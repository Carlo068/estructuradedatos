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

        // PEEK: Consultando quién está al frente de la cola sin eliminarlo
        System.out.println("Cliente al frente: " + cola.peek());

        // DEQUEUE: Atendiendo (eliminando) al primer cliente en la cola
        System.out.println("Atendiendo a: " + cola.poll());

        // DEQUEUE: Atendiendo (eliminando) al siguiente cliente en la cola
        System.out.println("Atendiendo a: " + cola.poll());

        // PEEK: Consultando quién está ahora al frente
        System.out.println("Cliente al frente ahora: " + cola.peek());
    }
}
