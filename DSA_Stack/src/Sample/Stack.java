package Sample;

public class Stack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = top;
        this.stackArray = new int[maxSize];
    }

    public void push(int value) {
        if(this.top == maxSize - 1) {
            System.out.println("Stack is Full!");
        }
        else {
            stackArray[++top] = value;
        }
    }

    public int pop() {
        if(this.top == -1) {
            return -99;
        }
        else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if(this.top == -1) {
            return -99;
        }
        else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public boolean isFull() {
        return (this.top == maxSize);
    }

}
