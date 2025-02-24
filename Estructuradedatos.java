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

        // Calcular calificacion parcial
        // Se pide al usuario que ingrese la calificación del parcial
        System.out.print("Ingresa la calificación del parcial: ");
        int partialGrade2 = objScanner.nextInt();

        System.out.print("Ingresa la calificación de las tareas: ");
        int homeworkScore = objScanner.nextInt();

        GradeCalculationPartial objGradeCalculationPartial = new GradeCalculationPartial();
        double finalGrade2 = objGradeCalculationPartial.calculate(partialGrade2, homeworkScore);

        System.out.println("La calificación final es: " + finalGrade2);

        // Se cierra el objeto de la clase Scanner
        objScanner.close();
        
        // Se crea un objeto de la clase ArrayListExample
        ArrayListExample objArrayList = new ArrayListExample();
        objArrayList.addCars("Toyota");
        objArrayList.addCars("Ford");
        objArrayList.addCars("Chevrolet");

        objArrayList.removeCars(1);

        // Se crea un objeto de la clase MultiDimensionalArray
        MultiDimensionalArray objMultiDimensionalArray = new MultiDimensionalArray();
        objMultiDimensionalArray.printbidimensionalArray();

        // Se crea un objeto de la clase EvenOrOdd
        EvenOrOdd objEvenOrOdd = new EvenOrOdd();
        int[] numeros = {
            0, 2, 5, 8, 11, 14, 17, 20, 23, 26, 
            29, 32, 35, 38, 41, 44, 47, 50, 53, 56, 
            59, 62, 65, 68, 71, 74, 77, 80, 83, 86, 
            89, 92, 95, 98, 0, 3, 6, 9, 12, 15, 
            18, 21, 24, 27, 30, 33, 36, 39, 42, 45
        };
        objEvenOrOdd.evenorodd(numeros);
    }
}
