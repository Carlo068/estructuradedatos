/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 04/02/2025
*/

public class Promedio {
    public void main(String[] args) {
        // Se crea un arreglo double para guardar las calificaciones
        double[] calificaciones = new double[]{10, 9, 8};
        double sum = 0;
        // El for sirve para sumar todas las calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            sum = calificaciones[i] + sum;
        }
        // avg guarda el promedio
        double avg = sum / 3;
        System.out.println(avg);
    }
}
