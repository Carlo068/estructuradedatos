/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 06/03/2025
*/
package secondpartial;

// Bubble sort es un algoritmo que compara los elementos adyacentes y los intercambia si están en el orden incorrecto
// este proceso se repite hasta que no se necesiten más intercambios
public class BubbleSortExample {
    public int[] sort(int[] numbers) {
        // se crea una variable para contar las comparaciones
        int c = 0;
        // se recorre el arreglo de números
        for (int i = 0; i < numbers.length - 1; ++i) {
            // se crea una variable para saber si se hicieron cambios
            boolean change = false;
            // se crea otro ciclo para comparar los números
            for (int j = 0; j < numbers.length - i - 1; ++j) {
                // si el número actual es mayor al siguiente número se intercambian
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    // se actualiza la variable de cambios
                    change = true;
                }
                // se incrementa el contador de comparaciones
                c++;
            }
            // si no se hicieron cambios se sale del ciclo
            if (!change) {
                break;
            }
        }
        // el Big O de bubble sort es O(n^2) en el peor de los casos, pero si el arreglo ya esta ordenado es O(n)
        System.out.println("\nComparaciones: " + c);
        return numbers;
    }
}
