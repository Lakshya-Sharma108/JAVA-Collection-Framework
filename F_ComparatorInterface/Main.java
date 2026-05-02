package F_ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
            Comparator Interface:

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
        students.add(new Student("lakshaya", 22, 60));
        students.add(new Student("divya", 20, 40));
        students.add(new Student("ankit", 23, 65));
        students.add(new Student("shruti", 20, 46));

        System.out.println(students);

       Collections.sort(students, new WeightComparator());

        System.out.println(students);





    }
}
