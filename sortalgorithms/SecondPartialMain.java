/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 03/03/2025
*/

package sortalgorithms;

public class SecondPartialMain {
    public static void main(String[] args) {
        // se crean los arreglos de números
        int[] numbers = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        // se crea una instancia de la clase InsertionSortExample
        InsertionSortExample insertion = new InsertionSortExample();
        // se ordenan los números
        int [] array = insertion.sort(numbers);
        // se imprimen los números ordenados
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // se crea una instancia de la clase SelectionSortExample
        SelectionSortExample selection = new SelectionSortExample();
        // se ordenan los números
        int [] array2 = selection.sort(numbers);
        // se imprimen los números ordenados
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        // se crea una instancia de la clase BubbleSortExample
        BubbleSortExample bubble = new BubbleSortExample();
        // se ordenan los números
        int [] array3 = bubble.sort(numbers);
        // se imprimen los números ordenados
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
