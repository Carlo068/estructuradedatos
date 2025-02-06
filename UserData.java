/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 06/02/2025
*/

public class UserData {
    // Se crea una funcion que recibe dos strings y regresa un string con el nombre completo
    public String fullNameString(String firstName, String lastName) {
        // Se crea un string que guarda el nombre completo
        String fullName = String.format("%s %s", firstName, lastName);
        return fullName;
    }
}
