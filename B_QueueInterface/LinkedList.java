package B_QueueInterface;

import java.util.Queue;

public class LinkedList {
    public static void main(String[] args) {

        /*

            LinkedList Hierarchy:
                                     Collection
                                         |
                                       Queue
                                         |
                                    LinkedList

            LinkedList class implements both interfaces (List and Queue)


        */



        // Queue creation with LinkedList
        Queue<Integer> q = new java.util.LinkedList<>();

        // offer() is recommended for inserting value
        // q.add(10);
        // q.add(20);
        // q.add(30);
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);


        // peek() is recommended for getting head of the queue
        // System.out.println(q.element());
        System.out.println(q.peek());


        // poll() is recommended to remove the head of the queue
        // q.remove();
        q.poll();
        System.out.println(q);
    }
}
