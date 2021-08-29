package cz.vanamir2.java.j8;

import java.util.Arrays;

public class ParallelSort {
    public static void sort(int[] numbers) {
        Arrays.parallelSort(numbers);
    }
}
