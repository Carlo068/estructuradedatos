public class EvenOrOdd {
    public void evenorodd(int[] numbers){
        int even = 0;
        int odd = 0;
        int zeros = 0;
        // Se verifica si el número es par o impar
        for (int number : numbers) {
            if (number == 0) {
                zeros++;
            } else if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Total de Pares: " + even);
        System.out.println("Total de Impares: " + odd);
        System.out.println("Total de Ceros: " + zeros);
    }
}
