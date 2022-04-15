package functional.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable(null)
                .ifPresentOrElse(System.out::println,
                        ()-> System.out.println("value cannot be displayed"));
    }
}
