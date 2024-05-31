package selectionsort;

public class SelectionSort {

    /**
     * @param array array to be sorted
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
    }

}
