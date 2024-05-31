package quicksort;

public class QuickSort {

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

}
