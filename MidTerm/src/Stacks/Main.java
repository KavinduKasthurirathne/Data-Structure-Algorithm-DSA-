package Stacks;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        myStack.push(20);
        myStack.push(21);
        myStack.push(22);
        myStack.push(23);
        myStack.push(24);
        myStack.push(25);

        while (!myStack.isEmpty()) {
            System.out.println("POP: " +myStack.pop());
        }
    }
}
