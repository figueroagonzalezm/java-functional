package functional.combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice",
                "+02541252",
                "prueba@gmail.com",
                LocalDate.of(2015, 1, 1)
        );

        CustomerValidator.ValidationResult result = CustomerValidator.isPhoneNumberValid()
                .and(CustomerValidator.isEmailValid())
                .and(CustomerValidator.isAnAdult())
                .apply(customer);

        if (result != CustomerValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}
