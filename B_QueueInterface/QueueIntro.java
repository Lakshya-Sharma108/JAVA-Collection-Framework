package B_QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIntro {
    public static void main(String[] args) {
        /*
            Java Queue Interface:
            The queue interface of the java collection framework provides the functionality of the queue data structure. It extends the collection interface

            Think of queue is like "A line on a ticket counter" where first one gets ticket first and new person needs to add in the end

            Queue follows FIFO (First In, First Out)


            Queue Hierarchy:
                                     Collection
                                         |
                                       Queue
                                         |
                       +------------------------------------+
                       |                 |                  |
                    ArrayDequeue     LinkedList        Priority Queue


            LinkedList class implements both interfaces (List and Queue)

            Queue:
                        +-------+  +-------+  +-------+  +-------+
            Deletion -> |       |  |       |  |       |  |       | <- Addition
                        +-------+  +-------+  +-------+  +-------+
                        Front                                 Rear



            Some Queue specific methods:
            add() -> inserts the specified elements into the queue, if the task is successful, add() returns true, if not it throws an exception

            offer() -> insert the specified element into the queue, if the task is successful, offer() returns true, if not it returns false

            element() -> Returns the head of the queue, throws an exception if queue is empty

            peek() -> returns the head of the queue, returns null if the queue is empty

            remove() -> Returns and removes the head of the queue, Throws an exception if the queue is empty

            poll() -> returns and removes the head of the queue, returns null if queue is empty

        */


        // Queue creation with LinkedList
        Queue<Integer> q = new LinkedList<>();

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
