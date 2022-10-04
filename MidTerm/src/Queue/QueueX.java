package Queue;

public class QueueX {
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;
    private int queueArray[];

    public QueueX (int maxSize) {
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
        this.queueArray = new int[maxSize];
    }

    public void insert(int value) {
        if(this.rear == maxSize - 1) {
            System.out.println("FULL");
        }
        else {
            queueArray[++rear] = value;
            nItems++;
        }
    }

    public int remove() {
        if(this.nItems == 0) {
            return -99;
        }
        else {
            nItems--;
            return queueArray[front++];
        }
    }

    public int peekFront() {
        if(this.nItems == 0) {
            return -99;
        }
        else {
            return queueArray[front];
        }
    }

    public boolean isEmpty() {
        if(this.nItems == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if(this.rear == maxSize - 1) {
            return true;
        }
        else {
            return false;
        }
    }

}
