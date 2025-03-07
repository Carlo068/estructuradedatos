/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 06/03/2025
*/

package secondpartial;

// Insertion sort es un algoritmo que ordena los elementos por medio de comparaciones a la izquierda del arregllo
// cambiando los elementos de lugar mientras se cumpla la condicion de que la key sea menor al número anterior
public class InsertionSortExample {
    public int[] sort(int[] numbers) {
        // se crea una variable para contar las comparaciones
        int c = 0;
        // se recorre el arreglo de números
        for (int i = 1; i < numbers.length; ++i) {
            // se guarda el número actual en una variable key
            int key = numbers[i];
            int j = i - 1;
            // se utiliza un if else para solo contar una vez en el caso de que la comparacion sea falsa
            if (j >= 0 && numbers[j] > key){
            // se crea otro ciclo para comparar los números y ordenarlos
                while (j >= 0 && numbers[j] > key) {
                    // si el número actual es mayor al número siguiente se intercambian
                    numbers[j + 1] = numbers[j];
                    numbers[j] = key;
                    j = j - 1;
                    c++;
                }
            }
            else {
                c++;
            }
        }
        System.out.println("Comparaciones: " + c);
        return numbers;
    }
}
