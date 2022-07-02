package bst;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node search(int value) {
        return findRecursive(root, value);// != null ? Boolean.TRUE: Boolean.FALSE;
    }

    private Node findRecursive(Node root, int value) {
        if(root == null || root.value == value)
            return root;
        if(root.value > value)
            return findRecursive(root.leftNode, value);
        else
            return findRecursive(root.rightNode, value);
    }

    public void insert(int value) {
        this.root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node root, int value) {
        if(root == null) return new Node(value);
        if(value < root.value)
            root.leftNode = insertRecursive(root.leftNode, value);
        else if (value > root.value)
            root.rightNode = insertRecursive(root.rightNode, value);

        return root;
    }
}
