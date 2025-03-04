package sortalgorithms;

public class InsertionSortExample {
    public int[] sort(int[] numbers) {
        int c = 0;
        for (int i = 1; i < numbers.length; ++i) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
                c++;
            }
            numbers[j + 1] = key;
        }
        System.out.println("Comparaciones: " + c);
        return numbers;
    }
}
