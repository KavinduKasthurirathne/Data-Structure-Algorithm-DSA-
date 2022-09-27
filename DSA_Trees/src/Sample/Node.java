package Sample;

public class Node {
    public int iData; //Data Item(Used as key value)
    public Node leftChild; //Node's left child
    public Node rightChild; //Node's right child

    public Node() {
        this.iData = iData;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void displayNode() {
        System.out.println("{");
        System.out.println(iData);
        System.out.println("}");
    }
}