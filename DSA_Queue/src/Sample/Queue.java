package Sample;

public class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int [] queueArray;
    private int nItems;

    public Queue (int maxSize) {
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = -1;
        this.queueArray = new int[maxSize];
        this.nItems = 0;
    }

    public void insert(int value) {
        if(rear == maxSize - 1) {
            System.out.println("Queue is Full!");
        }
        else {
            queueArray[++rear] = value;
            nItems++;
        }
    }
    public int remove() {
        if(nItems == 0) {
            return -99;
        }
        else {
            nItems--;
            return queueArray[front++];
        }
    }

    public int peekFront() {
        if(nItems == 0) {
            return -99;
        }
        else {
            return queueArray[front];
        }
    }
    public boolean isEmpty() {
        if(front == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if(front == 0 && rear == maxSize - 1) {
            return true;
        }
        if(front == rear + 1) {
            return true;
        }
        else {
            return false;
        }
    }
}