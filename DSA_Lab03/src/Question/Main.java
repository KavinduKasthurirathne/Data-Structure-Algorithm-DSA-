package Question;

public class Main {
    public static void main(String[] args) {

        LinkList list = new LinkList();

        list.insertFirst("Prashani", 69.5);
        list.insertFirst("Aravinda", 78.0);
        list.insertFirst("Nipuna", 53.5);
        list.insertFirst("Nirmal", 70.5);
        list.insertFirst("Tharushi", 92.5);
        list.insertFirst("Saman", 50.0);

        list.displayList();

        System.out.println();

        list.deleteFirst().displayDeleteDetails();
        list.delete("Nirmal").displayDetails();

    }
}
