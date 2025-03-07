package sortalgorithms;

public class BubbleSortExample {
    public int[] sort(int[] numbers) {
        int c = 0;
        for (int i = 0; i < numbers.length - 1; ++i) {
            for (int j = 0; j < numbers.length - i - 1; ++j) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
                c++;
            }
        }
        System.out.println("\nComparaciones: " + c);
        return numbers;
    }
}
