package functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class FlatMapToLongMain {
    public static void main(String[] args)
    {

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("1", "2"),
                Arrays.asList("5", "6"),
                Arrays.asList("3", "4")
        );

        listOfLists.stream()
                .flatMapToLong(childList -> childList.stream()
                        .mapToLong((Long::parseLong)))
                .forEach(System.out::println);
    }
}
