package functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class FlatMapToDouble {
    public static void main(String... args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("1", "2"),
                Arrays.asList("5", "6"),
                Arrays.asList("3", "4")
        );

        listOfLists.stream()
                .flatMapToDouble(childList -> childList.stream()
                        .mapToDouble((Double::parseDouble)))
                .forEach(System.out::println);
    }
}
