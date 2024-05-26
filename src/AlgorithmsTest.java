import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void insertionSort() {
        int[] array = {2, 3, 4, 1, 6};
        int[] expectedResult = {1, 2, 3, 4, 6};

        Algorithms.insertionSort(array);

        assertArrayEquals(expectedResult, array);
    }


    @Test
    void mergeSort() {
        int[] array = {2, 3, 4, 1, 6};
        int[] expectedResult = {1, 2, 3, 4, 6};

        Algorithms.mergeSort(array, 0, array.length - 1);

        assertArrayEquals(expectedResult, array);
    }


    @Test
    void quickSort() {
        int[] array = {2, 3, 4, 1, 6};
        int[] expectedResult = {1, 2, 3, 4, 6};

        assertArrayEquals(expectedResult, Algorithms.quickSort(array, 0, array.length - 1));
    }


    @Test
    void bucketSort() {
        int[] array = {2, 3, 4, 1, 6};
        int[] expectedResult = {1, 2, 3, 4, 6};

        Algorithms.bucketSort(array);

        assertArrayEquals(expectedResult, array);
    }

}