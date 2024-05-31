package bucketsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BucketSortTest {

    @Test
    void bucketSort() {
        int[] array = {2, 3, 4, 1, 6};
        int[] expectedResult = {1, 2, 3, 4, 6};

        BucketSort.bucketSort(array);

        assertArrayEquals(expectedResult, array);
    }

}
