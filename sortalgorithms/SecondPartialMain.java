package sortalgorithms;

public class SecondPartialMain {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        InsertionSortExample insertion = new InsertionSortExample();
        int [] array = insertion.sort(numbers);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int[] numbers2 = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        SelectionSortExample selection = new SelectionSortExample();
        int [] array2 = selection.sort(numbers2);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
