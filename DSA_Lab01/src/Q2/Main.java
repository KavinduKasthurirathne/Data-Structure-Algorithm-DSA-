package Q2;

public class Main {
    public static void main(String[] args) {

        int i=0;

        Stack stack = new Stack(5);

        //(i)
        stack.push('T');
        stack.push('A');
        stack.push('C');

        //(ii)
        System.out.println("Initial Stack: " +stack.peek());

        while(!stack.isEmpty()) {
            System.out.println("Pop: "+stack.pop());
            System.out.println("Remaining Stack: " +stack.peek());
        }

        //(iii)
        //Insertion Order --> T A C
        //Removal Order --> C A T

    }

}