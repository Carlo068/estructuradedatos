import java.util.Random;

public class juego {
    public static void main(String[] args) {
        String[] opciones = new String[]{"Piedra", "Papel", "Tijeras"};
        String jugador1 = opciones[new Random().nextInt(opciones.length)];
        String jugador2 = opciones[new Random().nextInt(opciones.length)];

        System.out.println("Jugador 1: " + jugador1);
        System.out.println("Jugador 2: " + jugador2);

        switch (jugador1) {
            case "Piedra":
                if (jugador2.equals("Tijeras")) {
                    System.out.println("Jugador 1 gana");
                } else if (jugador2.equals("Papel")) {
                    System.out.println("Jugador 2 gana");
                } else {
                    System.out.println("Empate");
                }
                break;
            case "Papel":
                if (jugador2.equals("Piedra")) {
                    System.out.println("Jugador 1 gana");
                } else if (jugador2.equals("Tijeras")) {
                    System.out.println("Jugador 2 gana");
                } else {
                    System.out.println("Empate");
                }
                break;
            case "Tijeras":
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
