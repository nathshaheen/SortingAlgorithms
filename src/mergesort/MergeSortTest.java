package mergesort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    void mergeSort() {
        int[] array = {2, 3, 4, 1, 6};
        int[] expectedResult = {1, 2, 3, 4, 6};

        MergeSort.mergeSort(array, 0, array.length - 1);

        assertArrayEquals(expectedResult, array);
    }

}
