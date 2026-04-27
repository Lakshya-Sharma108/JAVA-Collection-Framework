package B_QueueInterface;

import java.util.Collections;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        /*
            Java Priority Queue:
            Instead of "first in, first out" (like a normal queue), it always gives you the highest priority element first — regardless of insertion order.

            Imagine you're a doctor in an emergency room. Patients keep arriving — some with minor issues, some critical. You don't treat them in the order they arrived. You treat the most critical first.


            Priority Queue Hierarchy:
                                         Collection
                                             |
                                           Queue
                                             |
                                       Priority Queue


            In the case of Integer:
            "Highest priority" = smallest value (min comes out first)


            We can reverse the priority using:
            Comparator.reverseOrder() -> reverse the priority to max

        */


        // Creation
        Queue<Integer> pq = new java.util.PriorityQueue<>();
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        // smallest value comes out first
        System.out.println(pq.poll());   // 10
        System.out.println(pq.poll());   // 20
        System.out.println(pq.poll());   // 30
        System.out.println(pq.poll());   // 40




        // Reversing the priority -> max gets priority
        Queue<Integer> pq2 = new java.util.PriorityQueue<>(Collections.reverseOrder());
        pq2.offer(40);
        pq2.offer(30);
        pq2.offer(10);
        pq2.offer(20);
        System.out.println(pq2.poll());   // 40
        System.out.println(pq2.poll());   // 30
        System.out.println(pq2.poll());   // 20
        System.out.println(pq2.poll());   // 10


    }
}
