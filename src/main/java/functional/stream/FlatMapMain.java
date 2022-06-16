package functional.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.List;

public class FlatMapMain {
    public static void main(String[] args) {
        List<Travel> travels1 = List.of(new Travel("Spain"), new Travel("Peru"));
        List<Travel> travels2 = List.of(new Travel("Cancun"), new Travel("USA"));

        List<Person> people = List.of(new Person("Pedro", travels1), new Person("Juan", travels2));

        people.stream().map(Person::getTravels)
                .flatMap(Collection::stream)
                .map(Travel::getPlace)
                .forEach(System.out::println);
    }
}

@Getter
@Setter
@AllArgsConstructor
class Person {
    private String name;
    private List<Travel> travels;
}

@Getter
@Setter
@AllArgsConstructor
class Travel {
    private String place;
}