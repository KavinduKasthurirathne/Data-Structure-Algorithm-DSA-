package Sample;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue (5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);

        for(int i=0; i<5; i++) {
            System.out.println("Front of the queue: " + queue.peekFront());
            System.out.println("Remove: " + queue.remove());
        }
    }
}