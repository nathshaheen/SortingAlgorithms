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

}
