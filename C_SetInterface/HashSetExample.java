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
