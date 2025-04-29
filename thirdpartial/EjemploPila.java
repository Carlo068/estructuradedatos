package thirdpartial;
import java.util.Stack;

public class EjemploPila {
    public static Stack<String> pila = new Stack<>();
    
    public static void push(String plato) {
        pila.push(plato);
        System.out.println("Plato agregado a la pila: " + plato);
    }
    
    public static void mostrarPila() {
        System.out.println("Contenido de la pila:");
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }
        for (String plato : pila) {
            System.out.println(plato);
        }
    }
    
    public static void cimaPila() {
        if (!pila.isEmpty()) {
            System.out.println("Elemento en la cima de la pila: " + pila.peek());
        } else {
            System.out.println("La pila está vacía.");
        }
    }
    
    public static void popPila() {
        if (!pila.isEmpty()) {
            System.out.println("Elemento eliminado de la pila: " + pila.pop());
        } else {
            System.out.println("La pila está vacía.");
        }
    }
}
