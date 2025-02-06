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
    }
}
