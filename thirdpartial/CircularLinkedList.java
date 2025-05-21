public class CircularLinkedList {
    private class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Point tail to head
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Point tail to head
        }
        size++;
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
    public int size() {
        return size;
    }
}
