package sortalgorithms;

public class SelectionSortExample {
    public int[] sort(int[] numbers) {
        int c = 0;
        for (int i = 0; i < numbers.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; ++j) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
                c++;
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println("\nComparaciones: " + c);
        return numbers;
    }
}
