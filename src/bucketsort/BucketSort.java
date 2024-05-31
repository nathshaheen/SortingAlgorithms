package bucketsort;

import java.util.HashMap;
import java.util.Map;

public class BucketSort {

    /**
     * @param array array to be sorted
     */
    public static void bucketSort(int[] array) {
        Map<Integer, Integer> bucket = new HashMap<>();
        for (int i : array) {
            if (bucket.containsKey(i)) {
                bucket.put(i, bucket.get(i) + 1);
            } else {
                bucket.put(i, 1);
            }
        }

        int n = 0;
        for (Integer i : bucket.keySet()) {
            for (int j = 0; j < bucket.get(i); j++) {
                array[n++] = i;
            }
        }
    }

}
