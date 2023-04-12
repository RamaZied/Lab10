package lab10;

public class SelectionSort {
    private int temp;
    
    /** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }
    
    /*
    * A simple SelectionSort algorithm
    * pre-condition: x is an array of integers
    * post-condition: x is sorted in ascending order
    * inputs: x - array of integers
    * outputs: sorted array of integers
    * special conditions: none
    */
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < x.length; ++j) {
                if (x[j] < x[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = x[i];
                x[i] = x[minIndex];
                x[minIndex] = temp;
            }
        }
        return x;
    }
}




