package A_ListInterface;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {
    public static void main(String[] args) {
        /*
            What is LinkedList?
            The LinkedList class of java collection framework provides the functionality of the linked list data structure (doubly linkedlist)
            -> Each element in a LinkedList is known as a node, it consists of 3 fields


            LinkedList is just a collection of doubly LinkedList nodes:
            How a node looks like?
                            +-------+-------+-------+
               Node ->      | Prev  | Data  | Next  |
                            +-------+-------+-------+

            -> Prev: stores an address of the previous element in the list, Null for first element
            -> Next: stores an address of the next element in the list, Null for the last element
            -> Data: stores the actual data


            LinkedList allocated on none contiguous memory locations, so it is not necessary to have a continuous block of memory to store a LinkedList. It can be stored in different memory locations and each node will have the address of the next node.





            LinkedList Collection HIERARCHY ==>
                                                   Iterable   -> interface
                                                      |
                                                  Collection   -> interface
                                                      |
                                                     List      -> interface
                                                      |
                                                   LinkedList   -> class

        */


        // Creation of LinkedList -> without bounding in any datatype
        // Collection linkedList = new LinkedList();  // first way
        // List linkedListt = new LinkedList();  // second way
        // LinkedList linkedListtt = new LinkedList();  // third way


        // Creation of LinkedList -> with bounding in a datatype
        List<Integer> linkedList1 = new LinkedList<>();

        // adding elements
        linkedList1.add(10);
        linkedList1.add(20);
        linkedList1.add(30);
        System.out.println(linkedList1);

    }
}
