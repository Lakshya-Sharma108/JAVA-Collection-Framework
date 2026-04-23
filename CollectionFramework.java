public class CollectionFramework {
    public static void main(String[] args) {
        /*
            What is JCF? (Core Java)
            The Java Collection Framework (JCF) is a unified architecture for storing and manipulating groups of objects. It provides ready-to-use interfaces, implementations, and algorithms so you never have to write data structures from scratch.
            Introduced in Java 1.2 (1998) and lives in the java.util package.


            3 Pillars of JCF
            Interfaces -> abstract types defining behaviour (List, Set, Map, Queue)
            Implementations -> concrete classes (ArrayList, HashMap, TreeSet…)
            Algorithms -> utility methods in Collections class (sort, shuffle, binarySearch…)


            Root: Iterable & Collection
            Iterable -> enables for-each loops (one method: iterator())
            Collection -> top of the collection hierarchy. Adds add(), remove(), size(), contains(), iterator(), stream() and more.


            Map is separate - Not a Collection
            Map does not extend Collection because it stores key-value pairs, not individual elements. It is still part of JCF but sits in its own hierarchy.





            Simple Definitions:
            Java Collection Framework provides various interfaces. These interfaces include several methods to perform different operation on collections.

            The COLLECTION interface is the ROOT interface of the collection framework hierarchy.
            Java does not provide the direct implementations of the collection interfaces, but provides implementations of its sub-interfaces like List, Set and Queue.


            Common methods of Collection:
            1. add()  -> insert the specified element to the collection
            2. size()  -> returns the size of collection
            3. remove()  -> removes the specified element from the collection
            4. iterator()  -> returns an iterator to access elements of the collection
            5. addAll()  -> adds all the elements of a specified collection to the collection
            6. removeAll()  -> removes all the elements of the specified collection from the collection
            7. clear()  -> removes all the elements of the collection

        */



        /*
         *  COLLECTION FRAMEWORK HIERARCHY ==>
         *
         *
         *                        java.lang.Iterable<T>
         *                               |
         *                        java.util.Collection<E>
         *                        /           |          \
         *                       /            |           \
         *                 List<E>          Set<E>       Queue<E>
         *                /      \         /   |   \        |    \
         *               /        \       /    |    \       |     \
         *        ArrayList   LinkedList  HashSet  LinkedHashSet  TreeSet   PriorityQueue
         *           |                      |                                    |
         *        Vector(L)            EnumSet(special)                       Deque<E>
         *           |                                                        /       \
         *         Stack(L)                                           ArrayDeque   LinkedList
         *
         *
         *        (Separate hierarchy — Map does NOT extend Collection)
         *
         *                        java.util.Map<K,V>
         *                        /        |        \
         *                       /         |         \
         *                 HashMap    LinkedHashMap  TreeMap
         *                   |                         |
         *              EnumMap(special)          SortedMap<K,V>
         *                                            |
         *                                       NavigableMap<K,V>
         *
         *
         *        Concurrent (java.util.concurrent):
         *        ├── CopyOnWriteArrayList   (thread-safe List)
         *        ├── ConcurrentHashMap      (thread-safe Map)
         *        ├── CopyOnWriteArraySet    (thread-safe Set)
         *        └── BlockingQueue<E>
         *                ├── ArrayBlockingQueue
         *                └── LinkedBlockingQueue
         *
         *
         *        Legend:
         *        (L)  = Legacy class (avoid in new code)
         *        |    = extends / implements
         *        ---  = concrete class (instantiable)
         *
         */
    }
}
