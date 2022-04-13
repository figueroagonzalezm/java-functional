package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        greetCustomerConsumer.accept(new Customer("Pedro", "9999999"));
        greetCustomerConsumerV2.accept(new Customer("Pedro", "9999999"), true);

    }
    //todo: Consumer receive ONE parameter and return NO result
    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello : "+ customer.name +"with phone number: "+ customer.phoneNumber);

    //todo: BiConsumer receive TWO parameter and return NO result
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) -> System.out.println("Hello : "+ customer.name
                    + " with phone number: "+ (showPhoneNumber ? customer.phoneNumber : "********"));

    static class Customer {
        private final String name;
        private final String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
