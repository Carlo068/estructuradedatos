package thirdpartial;

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
        doubleList.display(); // Assuming you have a display method in DoubleLinkedList

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
        EjemploPila.popPila();
        EjemploPila.mostrarPila();
    }
}
