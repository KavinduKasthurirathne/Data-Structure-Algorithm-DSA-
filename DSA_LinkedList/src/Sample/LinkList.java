package Sample;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    //Insert data items to first
    public void insertFirst(int value) {
        Link newLink = new Link(value);
        if(this.first == null) {
            this.first = newLink;
        }
        else {
            newLink.next = this.first;
            this.first = newLink;
        }
    }

    public Link find(int ID) {
        Link current = this.first;
        while(current.iData != ID) {
            current = current.next;
            if(current == null) {
                return null;
            }
        }
        return current;
    }

    public void insertMiddle(int ID, int newData)
    {
        Link newLink = new Link(newData);
        Link current = this.first;
        while(current.iData != ID)
        {
            current = current.next;
            if(current == null)
            {
                System.out.println(ID+ "Not in the list !");
            }
        }
        newLink.next = current.next;
        current.next = newLink;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    //Display data items
    public void displayList() {
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    //Delete element
    public Link delete(int ID) {
        Link current = this.first;
        while(current.iData != ID) {
            current = current.next;
            if(current == null) {
                return null;
            }
        }
        Link temp = current;
        current = current.next;
        return temp;
    }

    //Delete the first element
    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }
}