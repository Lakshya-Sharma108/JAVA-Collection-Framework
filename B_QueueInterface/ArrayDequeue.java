package B_QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeue {
    public static void main(String[] args) {
        /*
            Java ArrayDequeue:
            Java array dequeue stands for "Doubly Ended Queue" which means in array dequeue, Insertion and Deletion takes places on both end

            You can add or delete elements in dequeue from both side (front side and end side)


            DeQueue Hierarchy:
                                     Collection
                                         |
                                       Queue
                                         |
                                    ArrayDequeue


            DeQueue:
                            +-------+  +-------+  +-------+  +-------+
                Deletion -> |       |  |       |  |       |  |       | <- Addition
                Addition -> |       |  |       |  |       |  |       | <- Deletion
                            +-------+  +-------+  +-------+  +-------+
                            Front                                 Rear

        */


        // Creation
        Deque<Integer> dq = new ArrayDeque<>();

        // inserting element
        dq.offer(110);
        dq.offerFirst(120);     // adding from front
        dq.offerLast(130);      // adding from end
        System.out.println(dq);


        // removing element
        dq.pollFirst();     // removing from front
        System.out.println(dq);
        dq.pollLast();     // removing from end
        System.out.println(dq);


        // checking the size
        System.out.println(dq.size());


        dq.offer(5);
        dq.offer(10);
        dq.offer(15);
        dq.offer(20);

        // getting the element
        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());   // returns first element
        System.out.println(dq.peekLast());    // returns last element

    }
}
