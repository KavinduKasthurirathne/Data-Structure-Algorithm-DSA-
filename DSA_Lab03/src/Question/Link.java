package Question;

public class Link {
    public String name;
    public double average;
    public Link next;

    public Link(String name, double average) {
        this.name = name;
        this.average = average;
        this.next = null;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public void displayDetails() {
        System.out.println("Name: " +this.name);
        System.out.println("Average: " +this.average);
    }

    public void displayDeleteDetails() {
        System.out.println("Delete Name: " +this.name);
        System.out.println("Delete Average: " +this.average);
    }
}