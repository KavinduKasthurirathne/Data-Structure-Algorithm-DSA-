package CircularQueue;

public class CircularQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int queueArray[];
    private int nItems;

    public CircularQueue(int maxSize) {
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.nItems = 0;
        this.queueArray = new int[maxSize];
    }

    public void insert(int value) {
        if(this.nItems == maxSize) {
            System.out.println("FULL");
        }
        else {
            nItems++;
            if(this.rear == maxSize - 1) {
                rear = 0;
            }
            else {
                rear++;
            }
        }
        queueArray[rear] = value;
    }

    public int remove() {
        if(this.nItems == 0) {
            System.out.println("EMPTY");
            return -99;
        }
        else {
            int temp = queueArray[front++];
            if(this.front == maxSize) {
                front = 0;
            }
            nItems--;
            return temp;
        }
    }

}
