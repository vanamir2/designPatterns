package cz.vanamir2.java.j8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/*
Get people statistics: average age, count, maximum age, minimum age and sum og all ages.
 */
public class SummaryStatisticsSpec {

    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    List<Person> collection = asList(sara, eva, viktor);

    public IntSummaryStatistics getStats(List<Person> people) {
        return people.stream().collect(Collectors.summarizingInt(Person::getAge));
    }

    @Test
    public void getStatsShouldReturnAverageAge() {
        Assertions.assertEquals((double) (4 + 40 + 42) / 3, getStats(collection).getAverage());
    }

    @Test
    public void getStatsShouldReturnNumberOfPeople() {
        Assertions.assertEquals(3, getStats(collection).getCount());
    }

    @Test
    public void getStatsShouldReturnMaximumAge() {
        Assertions.assertEquals(42, getStats(collection).getMax());
    }

    @Test
    public void getStatsShouldReturnMinimumAge() {
        Assertions.assertEquals(4, getStats(collection).getMin());
    }

    @Test
    public void getStatsShouldReturnSumOfAllAges() {
        Assertions.assertEquals(4 + 40 + 42, getStats(collection).getSum());
    }

}
