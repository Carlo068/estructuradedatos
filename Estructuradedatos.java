/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 04/02/2025
*/
public class Estructuradedatos {
    public static void main(String[] args) {
        // se llama a la clase arreglo y se guarda en una variable
        Arreglo arreglo = new Arreglo();
        // se llama a la funcion main dentro de arreglo
        arreglo.main(args);

        // se llama a la clase juego y se guarda en una variable
        Juego juego = new Juego();
        // se llama a la funcion main dentro de juego
        juego.main(args);

        // se llama a la clase promedio y se guarda en una variable
        Promedio promedio = new Promedio();
        // se llama a la funcion main dentro de promedio
        promedio.main(args);

        // se llama a la clase UserData y se guarda en una variable
        UserData userData = new UserData();
        // se llama a la funcion fullNameString dentro de UserData y se guarda en una variable
        String fullName = userData.fullNameString("Carlo", "Ruiz");
        // se imprime el resultado de la funcion fullNameString
        System.out.println(fullName);

        StudentGrades student = new StudentGrades();
        
        // Calcular la calificación del parcial
        int partialGrade = student.calculatePartialGrade(85, 90);
        System.out.println("Calificación del parcial: " + partialGrade);
        
        // Calcular la calificación final del semestre
        int finalGrade = student.calculateFinalGrade(80, 75, 90, 85);
        System.out.println("Calificación final del semestre: " + finalGrade);
        
        // Verificar el estatus de asistencia
        String attendanceStatus = student.checkFailureByAbcenses(64, 7);
        System.out.println(attendanceStatus);
    }
}
