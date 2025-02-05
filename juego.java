/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 04/02/2025
*/

import java.util.Random;

public class juego {
    public static void main(String[] args) {
        // Se crea un arreglo tipo string que guarde las opciones de juego
        String[] opciones = new String[]{"Piedra", "Papel", "Tijeras"};
        // Se crea la variable random que guarde la funcion Random
        Random random = new Random();
        // Se crean los jugadores que guarden una opcion random del arreglo
        String jugador1 = opciones[random.nextInt(opciones.length)];
        String jugador2 = opciones[random.nextInt(opciones.length)];

        System.out.println("Jugador 1: " + jugador1);
        System.out.println("Jugador 2: " + jugador2);

        // Se utiliza un switch case para representar las posibles opciones que pueden haber para jugador 1
        switch (jugador1) {
            case "Piedra":
                // En base a los resultados de jugador uno se revisa al jugador 2 para determinar un ganador
                if (jugador2.equals("Tijeras")) {
                    System.out.println("Jugador 1 gana");
                } else if (jugador2.equals("Papel")) {
                    System.out.println("Jugador 2 gana");
                } else {
                    System.out.println("Empate");
                }
                break;
            case "Papel":
                // En base a los resultados de jugador uno se revisa al jugador 2 para determinar un ganador
                if (jugador2.equals("Piedra")) {
                    System.out.println("Jugador 1 gana");
                } else if (jugador2.equals("Tijeras")) {
                    System.out.println("Jugador 2 gana");
                } else {
                    System.out.println("Empate");
                }
                break;
            case "Tijeras":
                // En base a los resultados de jugador uno se revisa al jugador 2 para determinar un ganador
                if (jugador2.equals("Papel")) {
                    System.out.println("Jugador 1 gana");
                } else if (jugador2.equals("Piedra")) {
                    System.out.println("Jugador 2 gana");
                } else {
                    System.out.println("Empate");
                }
                break;
        }
    }
}
