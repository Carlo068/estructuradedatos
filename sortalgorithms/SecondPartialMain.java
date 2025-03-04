package sortalgorithms;

public class SecondPartialMain {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 3, 8, 1, 2};
        InsertionSortExample ob = new InsertionSortExample();
        int [] array = ob.sort(numbers);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
