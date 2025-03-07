/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 06/03/2025
*/
package sortalgorithms;

public class SelectionSortExample {
    public int[] sort(int[] numbers) {
        // se crea una variable para contar las comparaciones
        int c = 0;
        // se recorre el arreglo de números
        for (int i = 0; i < numbers.length - 1; ++i) {
            int minIndex = i;
            // se crea otro ciclo para comparar los números
            for (int j = i + 1; j < numbers.length; ++j) {
                // si el número actual es menor al número mínimo se actualiza el índice del número mínimo
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
