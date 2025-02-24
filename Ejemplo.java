public class Ejemplo {
    public static void main(String[] args) {
        int[] grades = new int[]{100, 90, 80, 70, 60, 50, 65, 75, 82, 56, 99};
        int amount_of_approved = 0;
        int amount_of_failed = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 70) {
                amount_of_approved++;
            } else {
                amount_of_failed++;
            }
        }
        System.out.println("Total de aprobados: " + amount_of_approved);
        System.out.println("Total de reprobados: " + amount_of_failed);
      }
}
