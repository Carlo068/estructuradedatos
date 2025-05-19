package thirdpartial;
import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    public static Queue<String> cola = new LinkedList<>();
    
    public static void add(String cliente) {
        cola.add(cliente);
        System.out.println("Cliente agregado a la cola: " + cliente);
    }
    
    public static void mostrarCola() {
        System.out.println("Contenido de la cola:");
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        for (String cliente : cola) {
            System.out.println(cliente);
        }
    }
    
    public static void frenteCola() {
        if (!cola.isEmpty()) {
            System.out.println("Elemento en el frente de la cola: " + cola.peek());
        } else {
            System.out.println("La cola está vacía.");
        }
    }
    
    public static void eliminarCola() {
        if (!cola.isEmpty()) {
            System.out.println("Elemento eliminado de la cola: " + cola.poll());
        } else {
            System.out.println("La cola está vacía.");
        }
    }
}
