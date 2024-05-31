package countingsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountingSortTest {

    @Test
    void countingSort() {
        int[] array = {2, 3, 4, 1, 6};
        int[] expectedResult = {1, 2, 3, 4, 6};

        assertArrayEquals(expectedResult, CountingSort.countingSort(array));
    }

}
