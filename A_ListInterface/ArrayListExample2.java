package A_ListInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {

        // List can store multiple type of values if we don't bound it with datatype
        List list = new ArrayList<>();
        list.add("hii");
        list.add(123);
        list.add(true);
        list.add('A');

        // It allows to add duplicate items
        list.add(88.30f);
        list.add(88.30f);
        list.add(88.30f);
        list.add(88.30f);

        System.out.println(list.contains(true));
        System.out.println(list);
        System.out.println(list.reversed());

        // we can directly print a list and output will be shown in form of Array
        System.out.println(list);





        // But if we provide a datatype to list then list can only store values of that datatype
        List<String> list2 = new ArrayList<>();
        list2.add("hii");
        //list2.add(123);
        //list2.add(true);
        //list2.add('A');
        //list2.add(88.30f);
        System.out.println(list);


        List<Integer> list3 = new ArrayList<>();
        list3.add(23);
        /*

         */


        // why we are not able to store child class object in parent class variable????
        Collection<Number> list4 = new ArrayList<>(2);
        list4.add(123);
        list4.add(12.3);
        list4.add(12.5d);

        System.out.println(list4);

        list4.remove(0);
        list4.remove(12.3);

        System.out.println(list4);


        /*
            Todo -- Methods of ArrayList
            1. add() -- to add element in ArrayList
            1. remove() -- to remove element from ArrayList
         */
    }
}
