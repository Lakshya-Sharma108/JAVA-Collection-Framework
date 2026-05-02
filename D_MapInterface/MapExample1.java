package D_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        /*
            Java Map Interface:
            In java, elements of map are stored in key/value pairs. Keys are unique values associated with the individual Values. A map cannot contain duplicate keys. And each key is associated with a single value.


            Map Hierarchy:
                                                     Map
                                                      |
            +--------------------+--------------------+--------------------+--------------------+
            |                    |                    |                    |                    |
            HashMap            TreeMap             EnumMap           LinkedHashMap         WeakHashMap



            Map Characteristics:
            No duplicate keys: each key can map to at most one value. However, diff. keys can map to the same value.
            Key-Value association: It maintains an association of keys to value

            Implementations: Some of the well known classes that implement the map interface are HashMap, TreeMap, LinkedHasMap, and Hashtable.

            Order: The Map interface itself doesn't guarantee any specific order of its elements. However, some specific implementation like TreeMap maintain a sorted order, and LinkedHashMap maintains the insertion order.

            Null Value: Map allows null value and, depending on the implementation, null keys. For example, HashMap allow one null key and multiple null values, but hashtable does not null key or values.

        */



        // Creation
        // HashMap<String, String> mapping = new HashMap<>();   // first way

        Map<String, String> mapping = new HashMap<>();    // second way


        // insertion method
        mapping.put("IN", "India");     // "key", "value"
        mapping.put("UK", "United Kingdom");
        mapping.put("US", "United States");
        mapping.put("US", "America");       // same key holds updated value

        System.out.println(mapping);




        // 

    }
}
