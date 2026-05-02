package F_ComparableInterface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
            Comparable Interface:
            Purpose: Defines a natural ordering for the objects of the classes that implement it.

            Method to implement: compareTo(Object obj)
                Functionality: This method compares the current object with the specified object to determine their order

                Return Value: Returns a negative integer, zero or positive integer as this object is less than, equal to or greater than the specified object, respectively

            Usage Context: Useful when there is single, natural ordering of the objects (e.g. alphabetical order for string, numerical order for numbers)

            Integration: Automatically used by sorting methods in collections that do not specify a custom comparator (e.g. Collections.sort(list) when sorting a list of objects that implement a comparable)

        */




        // Creating a arraylist
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(8);
        list.add(2);
        list.add(80);

        System.out.println(list);   // getting data as insertion order

        Collections.sort(list);  // sorting the list

        System.out.println(list);






        // Now how to sort a list of custom objects, because an object contains many properties, so basis of which property we will sort the list of objects

        List<Student> students = new ArrayList<>();
        students.add(new Student("lakshaya", 21, 60));
        students.add(new Student("divya", 19, 40));
        students.add(new Student("ankit", 23, 65));
        students.add(new Student("shruti", 19, 46));

        System.out.println(students);

        Collections.sort(students);  // first implement comparable interface in obj class

        System.out.println(students);





    }
}
