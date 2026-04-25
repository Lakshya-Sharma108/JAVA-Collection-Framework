package A_ListInterface;

import java.util.*;

public class VectorExample1 {
    public static void main(String[] args) {
        /*
            Java Vector:
            The vector class is an implementation of the list interface that allows us to create resizable array similar to the ArrayList class.

            Vector vs ArrayList:
            -> In java, both ArrayList and Vector implements the List interface and provides the same functionality. However, there exist some difference b/w them
            -> The Vector class synchronizes each individual  operation, This means whenever we want to perform some operations on vectors, The vector class automatically applies in lock to that operation
            -> It is because when one thread is accessing a vector, and at the same time another thread try to access it, an exception called ConcurrentModificationException is generated. Hence, this continuous use of lock for each operation makes vectors less efficient
            -> However, in ArrayLists, methods are not synchronized. Instead, it uses the Collection.synchronizedList() method that synchronizes the list as a whole

        */


        // creation
        // Collection<Integer> vector = new Vector<>(); // first way
        // List<Integer> vector = new Vector<>();   // Second way
        // Vector<Integer> vector = new Vector<>();   // third way

        List<Integer> vector1 = new Vector<>();
        vector1.add(10);
        vector1.add(20);
        vector1.add(30);
        vector1.add(40);
        vector1.add(50);

        System.out.println(vector1);

        // Removing elements
        vector1.remove(1);  // needs index to remove elements
        System.out.println(vector1);


        List<Integer> vector2 = new Vector<>();
        vector2.add(110);
        vector2.addAll(vector1);
        System.out.println(vector2);


        vector2.removeAll(vector1);
        System.out.println(vector2);


        // checking the size of list
        System.out.println("Size of vector1: "+vector1.size());

        // removing all elements from list2
        vector2.clear();
        System.out.println(vector2);




        // iterator():
        // Its a standard way to travel on different collections

        // for ArrayList -> we need ArrayList iterator
        // for LinkedList -> we need LinkedList iterator
        // for Stack -> we need Stack iterator
        // for Vector -> we need Vector iterator

        //Example:
        Vector<Integer> vector3 = new Vector<>();
        vector3.add(100);
        vector3.add(200);
        vector3.add(300);
        vector3.add(400);
        vector3.add(500);


        // I want traverse list3 using iterator
        // Creating iterator for list3
        Iterator<Integer> iterator = vector3.iterator();
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




        Vector<Integer> vector4 = new Vector<>();
        vector4.add(11);
        vector4.add(12);
        vector4.add(13);
        vector4.add(14);
        vector4.add(15);

        // getting an element using index
        System.out.println(vector4.get(1));

        // setting an element using index
        vector4.set(2, 88);
        System.out.println(vector4);

        // checking if an element exists in the list
        System.out.println(vector4.contains(15));




        // Some more methods:
        // sort() -> sort the vector element
        // clone() -> creates a new vector with the same element, size and capacity
        // ensureCapacity() -> Specifies the total elements the vector can contain
        // isEmpty() -> checks if the vector is empty
        // indexOf -> searches a specified element in a vector and returns the index of element

        Vector<Integer> vector5 = new Vector<>();
        vector5.add(30);
        vector5.add(40);
        vector5.add(12);
        vector5.add(6);

        System.out.println("Printing entire vector5: "+vector5);

        // sorting vector5 in increasing order
        Collections.sort(vector5);
        System.out.println("Printing sorted vector5: "+vector5);

        // How to sort in decreasing order???
        Collections.sort(vector5, Collections.reverseOrder());
        System.out.println("Printing sorted vector5: "+vector5);

        // cloning vector5 elements in new list
        Vector<Integer> newList = (Vector<Integer>) vector5.clone();
        System.out.println("Cloned elements: "+newList);


        // providing a minimum capacity to a vector -> if we do not provide a minimum capacity to a vector, then it reassigns (1.5 times of its size) each time the limit hits which impacts performance -> because reassigning is a hard and multistep process
        Vector<Integer> marks = new Vector<>();
        marks.ensureCapacity(100);  // It will not resize the array until 100 element


        // checking is a list empty or not -> returns -1 if elements not exits
        System.out.println(newList.isEmpty());  // return false
        System.out.println(marks.isEmpty());  // return true


        // checking the index of a particular element
        System.out.println(newList.indexOf(30));
        System.out.println(newList.indexOf(6));
        System.out.println(newList.indexOf(12));
        System.out.println(newList.indexOf(100));

    }
}
