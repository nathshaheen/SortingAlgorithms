package countingsort;

public class CountingSort {

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
