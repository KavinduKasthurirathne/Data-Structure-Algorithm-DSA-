package Sample;

public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(5);

        myStack.push(20);
        myStack.push(40);
        myStack.push(60);
        myStack.push(80);
        myStack.push(100);

        while(!myStack.isEmpty()) {
            System.out.println("Pop: " +myStack.pop());
        }
    }
}