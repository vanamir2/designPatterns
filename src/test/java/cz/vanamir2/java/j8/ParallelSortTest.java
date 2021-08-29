package cz.vanamir2.java.j8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParallelSortTest {

    @Test
    void parallelSort() {
        int[] numbers = {10, 3, 5, -53, 28, 135, 6, 9, 1, 8, 4};
        Assertions.assertEquals(5, numbers[2]);
        ParallelSort.sort(numbers);
        Assertions.assertEquals(5, numbers[4]);
    }
}
