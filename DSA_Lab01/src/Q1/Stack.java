package Q1;

public class Stack {
    private int maxsize;
    private int top;
    private int[] array;

    public Stack(int maxsize) {
        this.maxsize = maxsize;
        this.top = top;
        this.array = new int[maxsize];
    }

    public void push(int value) {
        if(this.top == maxsize -1) {
            System.out.println("Stack is Full!");
        }
        else {
            top++;
            array[top] = value;
        }
    }

    public int pop() {
        if(this.top == -1) {
            return -99;
        }
        else {
            return array[top--];
        }
    }

    public int peek() {
        if(this.top == -1) {
            return -99;
        }
        else {
            return array[top];
        }
    }
    public boolean isEmpty() {
        return (this.top == -1);
    }

    public boolean isFull() {
        return (this.top == maxsize);
    }

}