/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 18/02/2025
*/

public class EvenOrOdd {
    public void evenorodd(int[] numbers){
        int even = 0;
        int odd = 0;
        int zeros = 0;
        // Se verifica si el número es par o impar o cero
        for (int number : numbers) {
            if (number == 0) {
                zeros++;
            } else if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        // Se imprime el resultado
        System.out.println("Total de Pares: " + even);
        System.out.println("Total de Impares: " + odd);
        System.out.println("Total de Ceros: " + zeros);
    }
}
