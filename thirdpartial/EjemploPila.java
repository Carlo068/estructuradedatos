package thirdpartial;
import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        // PUSH: Agregando elementos
        pila.push("Plato 1");
        pila.push("Plato 2");
        pila.push("Plato 3");

    }
    public static void mostrarPila(Stack<String> pila) {
        System.out.println("Contenido de la pila:");
        for (String plato : pila) {
            System.out.println(plato);
        }
    }
    public static void cimaPila(Stack<String> pila) {
        if (!pila.isEmpty()) {
            System.out.println("Elemento en la cima de la pila: " + pila.peek());
        } else {
            System.out.println("La pila está vacía.");
        }
    }
    public static void popPila(Stack<String> pila) {
        if (!pila.isEmpty()) {
            System.out.println("Elemento eliminado de la pila: " + pila.pop());
        } else {
            System.out.println("La pila está vacía.");
        }
    }

}
