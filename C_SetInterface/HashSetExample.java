package C_SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        /*
            HashSet:
            It uses has table for storage. Fast access, insertion and deletion but no ordering,
            it uses hashing to store
            HashSet is thread-safe, meaning all methods are synchronized and only one thread can access them at a time


            How Hashtable works internally in java?
            Definition:
            Hashtable<K, V> is a synchronized collection that stores key-value pairs. It is similar to HashMap but thread-safe.

            Internal working:
            Hashing:
            When you put a key-value pair into the Hashtable, it calculates the hash code of the
            key using the hashCode() method.

            The hash code is then converted into an index to determine where in the internal, where the internal array (called the bucket array) to place the entry.

            Bucket Array:
            Internally hashtable maintains an array of buckets (Entry[] table) where each bucket is a linkedlist (or tree structure in modern implementations of HashMap)

            Each bucket contain contains zero or more Entry objects, each holding a key, value and a reference to the next Entry.

        */


        // no duplicates allowed
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(10);
        st.add(20);
        st.add(10);
        st.add(30);
        System.out.println(st);


        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();

        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);
        st1.add(5);

        st2.add(4);
        st2.add(5);
        st2.add(6);
        st2.add(7);
        st2.add(8);

        // before retainAll()
        System.out.println(st1);

        st1.retainAll(st2);  // only common elements (b/w st1 and st2) will stay in st1

        // after retainAll()
        System.out.println(st1);


        // checks if st1 contains all elements of st2  -> false
        System.out.println(st1.containsAll(st2));

        // checks if st2 contains all elements of st1  -> true
        System.out.println(st2.containsAll(st1));















//        Set<String> hashset1 = new HashSet<>();
//        hashset1.add("Jaipur");
//        hashset1.add("Bharatpur");
//        hashset1.add("Dholpur");
//        hashset1.add("Dholpur"); // duplicate values are not allowed
//        hashset1.add("kerala");
//        hashset1.add("kashmir");
//        hashset1.add("himachal");
//        //hashset1.add(null);
//        //hashset1.add(null); // only one null value is allowed
//
//        System.out.println("Values without loop : "+hashset1);
//
//        for (var values : hashset1){
//            System.out.println("HashSet value : "+values+" Hashcode --> "+values.hashCode());
//        }

    }
}
