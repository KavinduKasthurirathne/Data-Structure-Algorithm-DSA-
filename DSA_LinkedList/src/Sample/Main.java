package Sample;

public class Main {
    public static void main(String[] args) {
        LinkList newLink = new LinkList();

        newLink.insertFirst(20);
        newLink.insertFirst(40);
        newLink.insertFirst(60);
        newLink.insertMiddle(40,50);
        newLink.insertMiddle(60,70);

        newLink.displayList();

        newLink.deleteFirst().displayLink();
        newLink.deleteFirst().displayLink();

    }
}