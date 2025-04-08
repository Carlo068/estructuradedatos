package secondpartial;

public class MergeSort {
    public int[] sort(int[] array) {
        if (array.length < 2) {
            return array; // Base case: array is already sorted
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Split the array into two halves
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort both halves
        left = sort(left);
        right = sort(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays while comparing elements
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Copy any remaining elements from the left array
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Copy any remaining elements from the right array
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
