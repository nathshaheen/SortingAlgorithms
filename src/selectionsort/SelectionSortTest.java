package selectionsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

    @Test
    void selectionSort() {
        int[] array = {2, 3, 4, 1, 6};
        int[] expectedResult = {1, 2, 3, 4, 6};

        SelectionSort.selectionSort(array);

        assertArrayEquals(expectedResult, array);
    }

}
