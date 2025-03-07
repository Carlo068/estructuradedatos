/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 06/03/2025
*/

package secondpartial;

public class InsertionSortExample {
    public int[] sort(int[] numbers) {
        // se crea una variable para contar las comparaciones
        int c = 0;
        // se recorre el arreglo de números
        for (int i = 1; i < numbers.length; ++i) {
            // se guarda el número actual en una variable key
            int key = numbers[i];
            int j = i - 1;
            // se crea otro ciclo para comparar los números y ordenarlos
            while (j >= 0 && numbers[j] > key) {
                // si el número actual es mayor al número siguiente se intercambian
                numbers[j + 1] = numbers[j];
                numbers[j] = key;
                j = j - 1;
                c++;
            }
        }
        if (c == 0) {
            c = numbers.length - 1;
        }
        System.out.println("Comparaciones: " + c);
        return numbers;
    }
}
