package Question;

public class LinkList {
    private Link first;

    public LinkList() {
        this.first = null;
    }

    public void displayList() {
        Link current = first;
        while(current != null) {
            current.displayDetails();
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(String name, double average) {
        Link newLink = new Link(name, average);
        Link current = first;
        newLink.next = current;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link find(String name) {
        Link current = this.first;
        while(current.name != name) {
            current = current.next;
            if(current == null) {
                return null;
            }
        }
        return null;
    }

    public Link delete(String name) {
        Link current = this.first;
        while(current.name != name) {
            current = current.next;
            if(current == null) {
                return null;
            }
        }
        Link temp = current;
        current = current.next;
        return temp;
    }
}
