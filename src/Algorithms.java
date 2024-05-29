import java.util.HashMap;
import java.util.Map;

public class Algorithms {


    /**
     * @param array array to be sorted
     */
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            while (j >= 0 && array[j + 1] < array[j]) {
                int temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }


    /**
     * @param array array to be sorted
     * @param left left pointer
     * @param right right pointer
     */
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }


    /**
     * @param array array to be sorted
     * @param left left pointer
     * @param middle middle pointer
     * @param right right pointer
     */
    public static void merge(int[] array, int left, int middle, int right) {
        int[] leftArray = new int[middle - left + 1];
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[left + i];

        int[] rightArray = new int[right - middle];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[middle + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }


    /**
     * @param array array to be sorted
     * @param start start pointer
     * @param end end pointer
     * @return the sorted array
     */
    public static int[] quickSort(int[] array, int start, int end) {
        if (end - start + 1 <= 1) {
            return array;
        }

        int pivot = array[end], left = start;
        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                int temp = array[left];
                array[left] = array[i];
                array[i] = temp;
                left++;
            }
        }

        array[end] = array[left];
        array[left] = pivot;

        quickSort(array, start, left - 1);
        quickSort(array, left + 1, end);

        return array;
    }


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


    /**
     * @param array array to be sorted
     * @return the sorted array
     */
    public static int[] countingSort(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            max = Math.max(max, i);
        }

        int[] counts = new int[max + 1];
        for (int i : array) {
            counts[i]++;
        }

        for(int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }

        int[] output = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {   // Iterate backwards to preserve the order of equal elements
            output[counts[array[i]] - 1] = array[i];
            counts[array[i]]--;
        }

        return output;
    }

}
