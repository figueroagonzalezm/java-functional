package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice",
                "+02541252",
                "prueba@gmail.com",
                LocalDate.of(2015, 1, 1)
        );

        ValidationResult result = isPhoneNumberValid()
                .and(isEmailValid())
                .and(isAnAdult())
                .apply(customer);

        if (result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}
