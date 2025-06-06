
public class ThirdPartialMain {
    public static void main(String[] args) {
        // SinglyLinkedList example
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("List:");
        list.display();

        System.out.println("Is 20 in the list? " + list.search(20));

        list.delete(20);

        System.out.println("After deleting 20:");
        list.display();

        // DoubleLinkedList example
        DoubleLinkedList doubleList = new DoubleLinkedList();
        doubleList.addLast(10);
        doubleList.addLast(20);
        doubleList.addLast(30);
        doubleList.addFirst(5);
        doubleList.add(1, 15); // Add 15 at index 1
        System.out.println("Double Linked List:");
        doubleList.display();

        // CircularLinkedList example
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.add(10);
        circularList.add(20);
        circularList.add(30);
        System.out.println("Circular Linked List:");
        circularList.display();

        // Cola example
        System.out.println("\nCola example:");
        EjemploCola.add("Cliente 1");
        EjemploCola.add("Cliente 2");
        EjemploCola.add("Cliente 3");
        EjemploCola.mostrarCola();
        EjemploCola.frenteCola();
        EjemploCola.eliminarCola();
        EjemploCola.mostrarCola();

        // Pila example
        System.out.println("\nPila example:");
        EjemploPila.push("Plato 1");
        EjemploPila.push("Plato 2");
        EjemploPila.push("Plato 3");
        EjemploPila.mostrarPila();
        EjemploPila.cimaPila();
        EjemploPila.pop(); // Changed from pop() to popPila()
        EjemploPila.mostrarPila();
        
        // Arbol example
        System.out.println("\nArbol example:");
        EjemploArbolBinario arbol = new EjemploArbolBinario();
        arbol.add(10);
        arbol.add(5);
        arbol.add(15);
        arbol.add(3);
        arbol.add(7);
        arbol.add(12);
        arbol.add(18);
        System.out.println("Arbol Binario:");
        arbol.displayInOrder();
        arbol.displayPreOrder();
        arbol.displayPostOrder();
    }
}
