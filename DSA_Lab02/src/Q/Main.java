package Q;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QueueX mainQueue = new QueueX(5);

        Scanner sc = new Scanner(System.in);

        int inputStr;

        for(int i=1; i<=5; i++) {
            System.out.println("Enter Transaction ID: ");
            inputStr = sc.nextInt();
            mainQueue.insert(inputStr); //Inserting inputs to the queue
        }

        //Object creation for oddQueue & evenQueue
        QueueX evenQueue = new QueueX(5);
        QueueX oddQueue = new QueueX(5);

        int value;

        //Check the remainder to check odd & even
        while(!mainQueue.isEmpty()) {
            value = mainQueue.remove();
            if(value % 2 == 0) {
                evenQueue.insert(value);
            }
            else {
                oddQueue.insert(value);
            }
        }

        //Remove and display evenIDs
        System.out.println("PC1");
        while(!evenQueue.isEmpty()) {
            System.out.println("Transaction ID: " +evenQueue.remove());
        }

        //Remove and display oddIDs
        System.out.println("PC2");
        while(!oddQueue.isEmpty()) {
            System.out.println("Transaction ID: " +oddQueue.remove());
        }

    }
}
