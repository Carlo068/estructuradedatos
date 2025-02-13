import java.util.Scanner;

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

        // Calcular el área de un triángulo
        // Se crea un objeto de la clase Scanner para leer la entrada del usuario
        Scanner objScanner = new Scanner(System.in);

        // Se pide al usuario que ingrese la base y la altura del triángulo
        System.out.print("Ingresa la base del triángulo: ");
        double base = objScanner.nextDouble();

        // Se pide al usuario que ingrese la altura del triángulo
        System.out.print("Ingresa la altura del triángulo: ");
        double height = objScanner.nextDouble();

        // Se crea un objeto de la clase TriangleArea
        TriangleArea objTriangle = new TriangleArea();
        double area = objTriangle.calculateArea(base, height);

        // Se imprime el resultado
        System.out.println("El área del triángulo de base " + base + " y altura " + height + " es: " + area);

        // Calcular el área de un círculo
        // Se pide al usuario que ingrese el radio del círculo
        System.out.print("Ingresa el radio del círculo: ");
        double radius = objScanner.nextDouble();

        // Se crea un objeto de la clase CircleArea
        CircleArea objCircle = new CircleArea();
        double area2 = objCircle.calculateArea(radius);

        // Se imprime el resultado
        System.out.println("El área del círculo de radio " + radius + " es: " + area2);

        // Se cierra el objeto de la clase Scanner
        objScanner.close();
        
        
        
    }
}
