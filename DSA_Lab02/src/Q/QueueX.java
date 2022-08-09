package Q;

public class QueueX {
    private int maxSize;
    private int front;
    private int rear;
    private int [] queueArr;
    private int noItems;

    public QueueX (int s) {
        this.maxSize = s;
        this.front = 0;
        this.rear = -1;
        this.queueArr = new int[maxSize];
        this.noItems = 0;
    }

    public void insert(int j) {
        if(rear == maxSize - 1) {
            System.out.println("Queue is Full!");
        }
        else {
            queueArr[++rear] = j;
            noItems++;
        }
    }

    public int remove() {
        if(noItems == 0) {
            System.out.println("Queue is Empty!");
            return -99;
        }
        else {
            noItems--;
            return queueArr[front++];
        }
    }

    public boolean isEmpty() {
        if(noItems == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if(rear == maxSize - 1) {
            return true;
        }
        else {
            return false;
        }

    }
}