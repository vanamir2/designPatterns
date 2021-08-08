package cz.vanamir2.dp.java.J8;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.Arrays.asList;

// https://technologyconversations.com/2014/11/04/java-8-streams-micro-katas/
public class StreamTest {

    private final Person SARA = new Person("Sara", 4, "Norwegian");
    private final Person VIKTOR = new Person("Viktor", 40, "Serbian");
    private final Person EVA = new Person("Eva", 42, "Norwegian");
    private final Person ANNA = new Person("Anna", 5);

    @Test
    void simpleStream() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Random");
        stringList.add("String");
        stringList.add("Test");

        Assertions.assertEquals(3, stringList.size());
        Assertions.assertEquals(2, stringList.stream().filter(str -> str.length() > 4).count());
    }


    @Test
    /* Convert elements of a collection to upper case. */
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        List<String> upperCase = StreamUtils.listToUpperCase(collection);
        Assertions.assertTrue(CollectionUtils.isEqualCollection(expected, upperCase));
    }


    @Test
    /* Filter collection so that only elements with less then 4 characters are returned. */
    public void transformShouldFilterCollection() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        List<String> shorterThen4Chars = StreamUtils.getShorterThen4Chars(collection);
        Assertions.assertTrue(CollectionUtils.isEqualCollection(expected, shorterThen4Chars));
    }

    @Test
    /* Flatten multidimensional collection */
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        List<String> flatList = StreamUtils.getFlatString(collection);
        Assertions.assertTrue(CollectionUtils.isEqualCollection(expected, flatList));
    }

    @Test
    /* Get oldest person from the collection */
    public void getOldestPersonShouldReturnOldestPerson() {
        List<Person> collection = asList(SARA, EVA, VIKTOR);
        OptionalInt oldestPersonAge = collection
                .stream()
                .mapToInt(Person::getAge)
                .max();
        Optional<Person> personOptional = collection
                .stream()
                .filter(p -> p.getAge() == oldestPersonAge.getAsInt())
                .findFirst();
        Person oldestPerson = personOptional.orElseThrow();
        Assertions.assertEquals(EVA.getName(), oldestPerson.getName());
    }

    @Test
    /* Get oldest person from the collection */
    public void getOldestPersonShouldReturnOldestPersonBetterWay() {
        List<Person> collection = asList(SARA, EVA, VIKTOR);
        Person oldestPerson = StreamUtils.getOldestPerson(collection);
        Assertions.assertEquals(EVA.getName(), oldestPerson.getName());
    }

    @Test
    /* Sum all elements of a collection */
    public void calculateSum() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        Integer sum = StreamUtils.getSum(numbers);
        Assertions.assertEquals(1 + 2 + 3 + 4 + 5, sum);
    }

    @Test
    /* Get names of all kids (under age of 18) */
    public void getKidNameShouldReturnNamesOfAllKidsFromNorway() {
        List<Person> collection = asList(SARA, EVA, VIKTOR, ANNA);
        List<String> result = StreamUtils.getNamesUnder18(collection);
        Assertions.assertTrue(result.contains("Sara"));
        Assertions.assertTrue(result.contains("Anna"));
        Assertions.assertFalse(result.contains("Viktor"));
        Assertions.assertFalse(result.contains("Eva"));
    }

    @Test
    /* Partition adults and kids */
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        List<Person> collection = asList(SARA, EVA, VIKTOR);
        Map<Boolean, List<Person>> result = StreamUtils.partitionAdults(collection);
        Assertions.assertTrue(CollectionUtils.isEqualCollection(result.get(true), asList(VIKTOR, EVA)));
        Assertions.assertTrue(CollectionUtils.isEqualCollection(result.get(false), List.of(SARA)));
    }

    @Test
    /* Group people by nationality */
    public void partitionAdultsByNationality() {
        List<Person> collection = asList(SARA, EVA, VIKTOR);
        Map<String, List<Person>> result = StreamUtils.groupByNationality(collection);
        Assertions.assertTrue(CollectionUtils.isEqualCollection(result.get("Norwegian"), asList(SARA, EVA)));
        Assertions.assertTrue(CollectionUtils.isEqualCollection(result.get("Serbian"), List.of(VIKTOR)));
    }

    @Test
    /* Return people names separated by comma */
    public void toStringShouldReturnPeopleNamesSeparatedByComma() {
        List<Person> collection = asList(SARA, VIKTOR, EVA);
        Assertions.assertEquals("Names: Sara, Viktor, Eva.", StreamUtils.namesToString(collection));
    }
}
