package secondpartial;

public class SearchAlgorithm {
    public int search(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] == n){
                return i;
            }
        }
        return -1;
    }
}
