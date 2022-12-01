public class SelectionSort {
	private int temp;

	/** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }

    /* A simple SelectionSort algorithm
     * pre-condition: The array passed is not sorted
     * post-condition: The array passed is sorted
     * inputs: Unsorted array
     * outputs: Sorted array
     * special conditions: Accept all positive, negative, mixed, and duplicated integer
    */
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            for (int j= i+1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            } // end of inner for loop
        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method
}
