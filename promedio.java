/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 04/02/2025
*/

public class promedio {
    public static void main(String[] args) {
        double[] calificaciones = new double[]{10, 9, 8};
        double sum = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            sum = calificaciones[i] + sum;
        }
        double avg = sum / 3;
        System.out.println(avg);
    }
}
