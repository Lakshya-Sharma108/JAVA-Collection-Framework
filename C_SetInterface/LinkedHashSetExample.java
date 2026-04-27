package C_SetInterface;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        /*

            LinkedHashSet:
            It maintains insertion order and does not allow duplicates


        */


        // maintains the order and prevents the duplicates
        Set<Integer> ls = new LinkedHashSet<>();
        ls.add(10);
        ls.add(10);
        ls.add(20);
        ls.add(10);
        ls.add(20);
        ls.add(40);
        ls.add(50);
        ls.add(40);
        System.out.println(ls);











//        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
//        linkedHashSet1.add("Lakshaya");
//        linkedHashSet1.add("Awasthi");
//        linkedHashSet1.add("Awasthi");   // duplicate elements, will not be added
//        linkedHashSet1.add("Yogesh");
//        linkedHashSet1.add("Deepu");
//        linkedHashSet1.add("Deepu");   // duplicate elements, will not be added
//        linkedHashSet1.add("Bheeshm");
//
//        System.out.println(linkedHashSet1);
//
//
//        String[] data = linkedHashSet1.toArray(new String[0]);  // LinkedHashSet converted into array
//        System.out.println(data);
//
//        System.out.println("Data values : "+Arrays.toString(data));
    }
}
