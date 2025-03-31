package secondpartial;

public class QuickSort {
    private int comparisons = 0;
    
    public int[] sort(int[] array) {
        comparisons = 0; // Reset counter before sorting
        quickSort(array, 0, array.length - 1);
        System.out.println("Total comparisons: " + comparisons);
        return array;
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            comparisons++; // Count each comparison
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
    
    // Method to get comparison count if needed externally
    public int getComparisons() {
        return comparisons;
    }
}
