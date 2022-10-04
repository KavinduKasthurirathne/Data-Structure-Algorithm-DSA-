package Queue;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        QueueX myQueue = new QueueX(5);

        myQueue.insert(23);
        myQueue.insert(25);
        myQueue.insert(23);
        myQueue.insert(25);
        myQueue.insert(23);
        myQueue.insert(25);

        while(!myQueue.isEmpty()) {
            System.out.println("REMOVE: " +myQueue.remove());
        }

    }
}
