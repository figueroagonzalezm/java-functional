package functional.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static functional.combinatorpattern.CustomerValidator.ValidationResult.*;

public interface CustomerValidator extends Function<Customer, CustomerValidator.ValidationResult> {

    static CustomerValidator isEmailValid(){
        System.out.println("executing email validation");
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }
    static CustomerValidator isPhoneNumberValid(){
        System.out.println("executing phoneNumber validation");
        return customer -> customer.getPhoneNumber().startsWith("+0") ? SUCCESS : PHONE_NUMBER_NOT_VALID;
    }
    static CustomerValidator isAnAdult(){
        System.out.println("executing isAnAdult validation");
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
                SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerValidator and (CustomerValidator other){
        return customer -> {
            ValidationResult  result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult{
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
