package Q1;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


        while(!stack.isEmpty()) {
            System.out.println("Pop: " +stack.pop());
        }
    }
}