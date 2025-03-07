/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 06/03/2025
*/
package sortalgorithms;

public class BubbleSortExample {
    public int[] sort(int[] numbers) {
        // se crea una variable para contar las comparaciones
        int c = 0;
        // se recorre el arreglo de números
        for (int i = 0; i < numbers.length - 1; ++i) {
            // se crea otro ciclo para comparar los números
            for (int j = 0; j < numbers.length - i - 1; ++j) {
                // si el número actual es mayor al siguiente número se intercambian
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
                // se incrementa el contador de comparaciones
                c++;
            }
        }
        System.out.println("\nComparaciones: " + c);
        return numbers;
    }
}
