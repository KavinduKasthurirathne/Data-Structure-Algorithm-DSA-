package Sample;

public class Tree {
    private Node root; //First node of the tree

    public Tree() {
        root = null;
    }

    public void insert (int id) {
        Node newNode = new Node();
        newNode.iData = id;
        if(root == null) {
            root = newNode;
        }
        else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if(id < current.iData) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean delete (int id) {
        return false;
    }

    public Node find (int key) {
        Node current = root;
        while(current.iData != key) {
            if(key < current.iData) {
                current = current.leftChild;
            }
            else {
                current = current.rightChild;
                if(current == null) {
                    return null;
                }
            }
        }
        return current;
    }
}