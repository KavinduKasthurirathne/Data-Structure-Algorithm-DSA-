package Stacks;

public class Stack {
    private int maxSize;
    private int top;
    private int stackArray[];

    public Stack (int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.stackArray = new int[maxSize];
    }

    public void push (int value) {
        if(this.top == maxSize - 1) {
            System.out.println("FULL");
        }
        else {
            stackArray[++top] = value;
            //top++;
            //stackArray[top] = value;
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
        return (this.top == maxSize-1);
    }

}
