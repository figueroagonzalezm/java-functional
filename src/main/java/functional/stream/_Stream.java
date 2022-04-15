package functional.stream;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Customer> customers = getCustomers();
        boolean result = customers.stream()
                .allMatch(customer -> customer.gender == Gender.MALE);
        System.out.println(result);

        List<Customer> droped = customers.stream().sorted()
                .dropWhile(customer -> customer.gender == Gender.FEMALE)
                .collect(Collectors.toList());
        System.out.println("droped: "+droped);

    }

    static class Customer {
        private final String name;
        private final String phoneNumber;
        private final Gender gender;

        Customer(String name, String phoneNumber, Gender gender) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.gender = gender;
        }
    }

    static enum Gender{
        MALE, FEMALE, OTHER
    }

    private static List<Customer> getCustomers(){
        return List.of(
                new Customer("Pedro Torres", "22235214", Gender.MALE),
                new Customer("Carlos Arango", "2223897", Gender.MALE),
                new Customer("Juana Pereira", "65214523", Gender.FEMALE));
    }
}
