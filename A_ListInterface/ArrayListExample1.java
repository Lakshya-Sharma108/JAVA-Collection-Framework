package A_ListInterface;

import java.util.*;

public class ArrayListExample1 {
    public static void main(String[] args) {
        /*
            Java ArrayList:
            In java, we use the ArrayList class to implement the functionality of re-sizable arrays. It implements the List interface of the collections framework

            ArrayList changes its size dynamically -- depends on the situation


            ArrayList Collection HIERARCHY ==>
                                                   Iterable   -> interface
                                                      |
                                                  Collection   -> interface
                                                      |
                                                     List      -> interface
                                                      |
                                                   ArrayList   -> class


            We can only use wrapper classes as datatype
            Example :
            1. Integer
            2. Float
            3. Long
            4. Double
            5. Characters
            6. Boolean
            7. Short
            8. Byte
        */


        // Creation with DataType
        // Collection<Integer> list1 = new ArrayList();   // first way
        // List<Integer> list2 = new ArrayList();   // second way

        ArrayList<Integer> list1 = new ArrayList();  // third way - recommended

        // Adding elements
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1);
        list1.add(40);
        System.out.println(list1);

        // Removing elements
        list1.remove(1);  // needs index to remove elements
        System.out.println(list1);


        // Another ArrayList
        ArrayList<Integer> list2 = new ArrayList();

        // Adding element to list2
        list2.add(110);
        list2.add(120);
        list2.add(130);

        // inserting list2 all elements in list1
        list1.addAll(list2);  // addAll() can do this
        System.out.println(list1);

        // removing list2 all elements from list1
        list1.removeAll(list2);  // removeAll() can do this
        System.out.println(list1);


        // checking the size of list
        System.out.println("Size of list1: "+list1.size());

        // removing all elements from list2
        list2.clear();
        System.out.println(list2);





        // iterator():
        // Its a standard way to travel on different collections

        // for ArrayList -> we need ArrayList iterator
        // for LinkedList -> we need LinkedList iterator
        // for Stack -> we need Stack iterator
        // for Vector -> we need Vector iterator

        //Example:
        ArrayList<Integer> list3 = new ArrayList();
        list3.add(100);
        list3.add(200);
        list3.add(300);
        list3.add(400);
        list3.add(500);


        // I want traverse list3 using iterator
        // Creating iterator for list3
        Iterator<Integer> iterator = list3.iterator();
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


        ArrayList<Integer> list4 = new ArrayList();
        list4.add(11);
        list4.add(12);
        list4.add(13);
        list4.add(14);
        list4.add(15);

        // getting an element using index
        System.out.println(list4.get(1));

        // setting an element using index
        list4.set(2, 88);
        System.out.println(list4);

        // checking if an element exists in the list
        System.out.println(list4.contains(15));








        // Some more methods:
        // sort() -> sort the ArrayList element
        // clone() -> creates a new ArrayList with the same element, size and capacity
        // ensureCapacity() -> Specifies the total elements the ArrayList can contain
        // isEmpty() -> checks if the ArrayList is empty
        // indexOf -> searches a specified element in an ArrayList and returns the index of element

        ArrayList<Integer> list5 = new ArrayList();
        list5.add(30);
        list5.add(40);
        list5.add(12);
        list5.add(6);

        System.out.println("Printing entire List: "+list5);

        // sorting arraylist in increasing order
        Collections.sort(list5);
        System.out.println("Printing sorted List: "+list5);

        // How to sort in decreasing order???
        Collections.sort(list5, Collections.reverseOrder());
        System.out.println("Printing sorted List: "+list5);

        // cloning list5 elements in new list
        ArrayList<Integer> newList = (ArrayList<Integer>) list5.clone();
        System.out.println("Cloned elements: "+newList);


        // providing a minimum capacity to an arraylist -> if we do not provide a minimum capacity to an arraylist, then it reassigns (1.5 times of its size) each time the limit hits which impacts performance -> because reassigning is a hard and multistep process
        ArrayList<Integer> marks = new ArrayList();
        marks.ensureCapacity(100);  // It will not resize the array until 100 element


        // checking is a list empty or not -> returns -1 if elements not exits
        System.out.println(newList.isEmpty());  // return false
        System.out.println(marks.isEmpty());  // return true


        // checking the index of a particular element
        System.out.println(newList.indexOf(30));
        System.out.println(newList.indexOf(6));
        System.out.println(newList.indexOf(12));
        System.out.println(newList.indexOf(100));




        /*
            LinkedList as Queue and Dequeue:
            Since the LinkedList calss also implements the Queue and Dequeue interface, it can implement methods of interfaces as well.

            Here are some of the commonly used methods:
            addFirst() -> adds the specified element at the beginning of the linkedlist
            addLast() -> adds the specified element at the end of the linkedlist
            getFirst() -> returns the first element
            getLast() -> returns the last element
            removeFirst() -> removes the first element
            removeLast() -> removes the last element
            peek() -> returns the first element (head) of the linkedlist
            poll() -> returns and removes the first element (head) of the linkedlist
            offer() -> adds the specified element at the end of the linkedlist

        */

        // creating new linkedlist
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(6);
        linkedList.add(12);
        linkedList.add(30);
        System.out.println(linkedList);


        // addFirst and addLast
        linkedList.addFirst(101);
        linkedList.addLast(102);
        System.out.println(linkedList);


        // getFirst and getLast
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());


        // removeFirst and removeLast
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);


        // peek and poll
        System.out.println(linkedList.peek());
        System.out.println(linkedList.poll());
        System.out.println(linkedList);


        // offer
        linkedList.offer(69);
        System.out.println(linkedList);




    }
}
