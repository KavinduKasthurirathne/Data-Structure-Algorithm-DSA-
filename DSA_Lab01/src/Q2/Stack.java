package Q2;

public class Stack {
    private int top;
    private int maxsize;
    private char[] array;

    public Stack(int maxsize) {
        this.top = -1;
        this.maxsize = maxsize;
        this.array = new char[maxsize];
    }

    public void push(char value) {
        if(this.top == maxsize - 1) {
            System.out.println("Stack is Full");
        }
        else {
            top++;
            array[top] = value;
        }
    }

    public char pop() {
        if(this.top == -1) {
            return 0;
        }
        else {
            return array[top--];
        }
    }
    public char peek() {
        if(this.top == -1) {
            return 0;
        }
        else {
            return array[top];
        }
    }
    public boolean isEmpty() {
        return (this.top == -1);
    }

}