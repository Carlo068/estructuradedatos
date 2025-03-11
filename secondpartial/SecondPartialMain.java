/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 03/03/2025
*/

package secondpartial;

public class SecondPartialMain {
    public static void main(String[] args) {
        // se crean los arreglos de números
        int[] numbers = new int[]{5, 4, 3, 2, 1};
        int[] numbers2 = new int[]{1, 2, 3, 4, 5};
        // No se porque buguea por eso cree otra lista igual
        int[] numbers3 = new int[]{1, 2, 3, 4, 5};
        int[] numbers4 = new int[]{5, 4, 3, 2, 1};
        // se crea una instancia de la clase InsertionSortExample
        InsertionSortExample insertion = new InsertionSortExample();
        // se imprimen los números ordenados
        System.out.println("Peor caso");
        int [] array = insertion.sort(numbers);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nMejor caso");
        int [] array2 = insertion.sort(numbers2);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("\n");

        // se crea una instancia de la clase SelectionSortExample
        SelectionSortExample selection = new SelectionSortExample();
        // se imprimen los números ordenados
        System.out.println("Peor caso");
        int [] array3 = selection.sort(numbers);
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println("\nMejor caso");
        int [] array4 = selection.sort(numbers2);
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println("\n ");

        // se crea una instancia de la clase BubbleSortExample
        BubbleSortExample bubble = new BubbleSortExample();
        // se imprimen los números ordenados
        int [] array5 = bubble.sort(numbers4);
        System.out.println("Peor caso");
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i] + " ");
        }
        System.out.println("\nMejor caso");
        int [] array6 = bubble.sort(numbers3);
        for (int i = 0; i < array6.length; i++) {
            System.out.print(array6[i] + " ");
        }
    }
}
