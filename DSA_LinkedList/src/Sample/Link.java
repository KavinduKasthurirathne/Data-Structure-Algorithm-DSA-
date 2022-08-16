package Sample;

public class Link {
    public int iData;
    public Link next;

    public Link(int ID) {
        this.iData = ID;
        this.next = null;
    }
    //Display data items
    public void displayLink() {
        System.out.println("Data: " +this.iData);
    }
}
