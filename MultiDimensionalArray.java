public class MultiDimensionalArray {
    public void printbidimensionalArray(){
        // Se crea un arreglo bidimensional
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };
        
        // Se llena el arreglo bidimensional
        
        // Se imprime el arreglo bidimensional
        for (int i = 0; i < 2; i++) {
            System.out.println("Fila " + (i+1));
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
