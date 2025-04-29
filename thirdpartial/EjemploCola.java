package thirdpartial;
import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // ENQUEUE: Agregando elementos a la cola
        cola.add("Cliente 1");
        cola.add("Cliente 2");
        cola.add("Cliente 3");
    }
    public static void mostrarCola(Queue<String> cola) {
        System.out.println("Contenido de la cola:");
        for (String cliente : cola) {
            System.out.println(cliente);
        }
    }
    public static void frenteCola(Queue<String> cola) {
        if (!cola.isEmpty()) {
            System.out.println("Elemento en el frente de la cola: " + cola.peek());
        } else {
            System.out.println("La cola está vacía.");
        }
    }
    public static void eliminarCola(Queue<String> cola) {
        if (!cola.isEmpty()) {
            System.out.println("Elemento eliminado de la cola: " + cola.poll());
        } else {
            System.out.println("La cola está vacía.");
        }
}
