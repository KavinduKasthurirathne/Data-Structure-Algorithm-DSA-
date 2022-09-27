package Question;

public class Tree {
    private Node root;

    public void insert(int Empno, String name) {
        Node newNode = new Node();
        newNode.Empno = Empno;
        newNode.name = name;

        if(root == null) {
            //If the tree is empty make the new node as root
            root = newNode;
        }
        else {
            Node current = root;
            Node parent;

            while(true) {
                parent = current;
                //Assigning the left child
                if(Empno < current.Empno) {
                    current = current.leftChild;

                    if(current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else {
                    //Assigning the right child
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    private void inOrder(Node localRoot) {
        //Left, Root & Right
        if(localRoot != null) {
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }

    public void TraverseinOrder() {
        inOrder(root);
    }
    private void preOrder(Node localRoot) {
        //Root, Left & Right
        localRoot.displayNode();
        preOrder(localRoot.leftChild);
        preOrder(localRoot.rightChild);
    }

    public void TraversepreOrder() {
        preOrder(root);
    }

    private void postOrder(Node localRoot) {
        //Left, Right & Root
        postOrder(localRoot.leftChild);
        postOrder(localRoot.rightChild);
        localRoot.displayNode();
    }

    public void TraversepostOrder() {
        postOrder(root);
    }

    

    public Node find(int empno) {
        Node current = root;
        while(current.Empno != empno) {
            if(empno < current.Empno) {
                current = current.leftChild;
            }
            else {
                current = current.rightChild;
            }
            if(current == null) {
                System.out.println("Error Not Found");
                return null;
            }
            //Found and print EmpNo
        }
        System.out.println("Employee No: "+empno);
        return null;
    }

}
