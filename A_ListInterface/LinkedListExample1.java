package A_ListInterface;

import java.util.*;

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
        linkedList1.add(40);
        System.out.println(linkedList1);

        // Removing elements
        linkedList1.remove(1);  // needs index to remove elements
        System.out.println(linkedList1);


        // Another linkedList
         LinkedList<Integer> linkedList2 = new LinkedList<>();

        // Adding element to linkedList2
        linkedList2.add(110);
        linkedList2.add(120);
        linkedList2.add(130);
        linkedList2.add(140);
        linkedList2.add(150);
        System.out.println(linkedList2);

        // inserting linkedList2 all elements in linkedList1
        linkedList1.addAll(linkedList2);  // addAll() can do this
        System.out.println("With inserted element: "+linkedList1);

        // removing linkedList2 all elements from linkedList1
        linkedList1.removeAll(linkedList2);  // removeAll() can do this
        System.out.println("Without inserted element: "+linkedList1);

        // checking the size of linkedList
        System.out.println("Size of linkedList1: "+linkedList1.size());
        System.out.println("Size of linkedList2: "+linkedList2.size());

        // removing all elements from linkedList2
        linkedList2.clear();
        System.out.println(linkedList2);





        // iterator():
        // Its a standard way to travel on different collections

        // for LinkedList -> we need LinkedList iterator
        // for ArrayList -> we need ArrayList iterator
        // for Stack -> we need Stack iterator
        // for Vector -> we need Vector iterator

        //Example:
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.add(100);
        linkedList3.add(200);
        linkedList3.add(300);
        linkedList3.add(400);
        linkedList3.add(500);

        // I want traverse linkedList3 using iterator
        // Creating iterator for linkedList3
        Iterator<Integer> iterator = linkedList3.iterator();
        while (iterator.hasNext()){
            System.out.println("Element: "+iterator.next());
        }



        /*
            Working of 2 methods of Iterator --> 1. hasNext()  2. next()

            1. hasNext() -> it starts/points from the first element and if there is another element then it returns true and sits to that next element if there is no elements left then it returns false

            2. next() -> it contains the current element of hasNext()

            Example:

            list = [10, 20, 30];

            step 1:    [ 10,      20,      30 ]
                       hasNext
                       true
                       next()


            step2:     [ 10,      20,      30 ]
                                 hasNext
                                 true
                                 next()


            step3:     [ 10,      20,      30 ]
                                          hasNext
                                          false -> no element left
                                          next()

        */


    }
}
