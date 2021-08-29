package cz.vanamir2.java.j8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamUtils {

    public static List<String> listToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public static List<String> getShorterThen4Chars(List<String> array) {
        return array.stream().filter(str -> str.length() < 4).toList();
    }

    public static Person getOldestPerson(List<Person> collection) {
        return collection.stream()
                .max(Comparator.comparing(Person::getAge))
                .orElseThrow(NoSuchElementException::new);
    }

    public static List<String> getFlatString(List<List<String>> collection) {
        return collection.stream().flatMap(Collection::stream).toList();
    }

    public static Integer getSum(List<Integer> numbers) {
        return numbers
                .stream()
                // .reduce(0, (n1, n2) -> n1 + n2);
                .reduce(0, Integer::sum);
    }

    public static List<String> getNamesUnder18(List<Person> collection) {
        return collection
                .stream()
                .filter(p -> p.getAge() < 18)
                .map(Person::getName)
                .toList();
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people
                .stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() >= 18));
    }

    public static Map<String, List<Person>> groupByNationality(List<Person> collection) {
        return collection
                .stream()
                .collect(Collectors.groupingBy(Person::getNationality));
    }

    public static String namesToString(List<Person> collection) {
        return collection
                .stream()
                .map(Person::getName)
                .collect(Collectors.joining(", ", "Names: ", "."));
    }
}
