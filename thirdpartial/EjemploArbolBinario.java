public class EjemploArbolBinario {
    // Node class for binary tree
    private class Node {
        private Object data;
        private Node left;
        private Node right;

        public Node(Object data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public EjemploArbolBinario() {
        this.root = null;
    }

    // Add element to the binary tree
    public void add(Object data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, Object data) {
        if (current == null) {
            return new Node(data);
        }

        if ((int) data < (int) current.data) {
            current.left = addRecursive(current.left, data);
        } else if ((int) data > (int) current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            // Value already exists
            return current;
        }

        return current;
    }
    
    // Display tree in-order (left, root, right)
    public void displayInOrder() {
        System.out.println("In-order traversal:");
        inOrder(root);
        System.out.println();
    }
    
    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
    
    // Display tree pre-order (root, left, right)
    public void displayPreOrder() {
        System.out.println("Pre-order traversal:");
        preOrder(root);
        System.out.println();
    }
    
    private void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    
    // Display tree post-order (left, right, root)
    public void displayPostOrder() {
        System.out.println("Post-order traversal:");
        postOrder(root);
        System.out.println();
    }
    
    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}