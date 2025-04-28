package thirdpartial;

public class ThirdPartialMain {
    public static void main(String[] args) {
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

        DoubleLinkedList doubleList = new DoubleLinkedList();
        doubleList.addLast(10);
        doubleList.addLast(20);
        doubleList.addLast(30);
        doubleList.addFirst(5);
        doubleList.add(1, 15); // Add 15 at index 1
        System.out.println("Double Linked List:");
        doubleList.display(); // Assuming you have a display method in DoubleLinkedList

        EjemploPila.main(args); // Call the stack example
    }
}
