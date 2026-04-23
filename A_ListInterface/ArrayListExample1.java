package A_ListInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        /*
            Java ArrayList:
            In java, we use the ArrayList class to implement the functionality of re-sizable arrays. It implements the List interface of the collections framework

            ArrayList changes its size dynamically -- depends on the situation


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


    }
}
