package functional.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid.test("0700000000")); //true
        System.out.println(isPhoneNumberValid.test("0900000000")); //false
        System.out.println(isPhoneNumberValid.test("07000000"));   //false

    }
    //todo: Predicate receive ONE parameter and return a boolean result
    static Predicate<String> isPhoneNumberValid =
            phoneNumber-> phoneNumber.startsWith("07") && phoneNumber.length()==10;

    //todo: BiPredicate receive TWO parameter and return a boolean result

}
