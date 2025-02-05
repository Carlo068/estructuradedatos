public class promedio {
    public static void main(String[] args) {
        int[] calificaciones = new int[]{10, 9, 8};
        int sum = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            sum = calificaciones[i] + sum;
        }
        float promedio = sum / calificaciones.length;
        System.out.println(promedio);
    }
}
