package thirdpartial;

public class DoubleLinkedList {
    // Node class for double linked list
    private class Node {
        private Object data;
        private Node next;
        private Node prev;
        
        public Node(Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add element to the end of the list
    public void addLast(Object data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        
        size++;
    }

    // Add element to the beginning of the list
    public void addFirst(Object data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        
        size++;
    }

    // Add element at specific index
    public void add(int index, Object data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        
        if (index == 0) {
            addFirst(data);
            return;
        }
        
        if (index == size) {
            addLast(data);
            return;
        }
        
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        
        Node newNode = new Node(data);
        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
        
        size++;
    }

    // Remove first element
    public Object removeFirst() {
        if (head == null) {
            throw new IllegalStateException("Cannot remove from empty list");
        }
        
        Object data = head.data;
        
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        
        size--;
        return data;
    }

    // Remove last element
    public Object removeLast() {
        if (tail == null) {
            throw new IllegalStateException("Cannot remove from empty list");
        }
        
        Object data = tail.data;
        
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        
        size--;
        return data;
    }

    // Other essential methods
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        
        return current.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
