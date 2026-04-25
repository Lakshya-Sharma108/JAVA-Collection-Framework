package A_ListInterface;

import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        /*
            Structure of singly LinkedList ---

            Each element has the address of next element :

            +--------+      +-------+      +-------+      +-------+      +-------+      +-------+
            |  Head  | ---> | D | A | ---> | D | A | ---> | D | A | ---> | D | A | ---> | D | A |
            +--------+      +-------+      +-------+      +-------+      +-------+      +-------+

            D --> Data
            A --> Address

        */


        /// This is how we create a LinkedList which is not bound in any datatype -- so we can add any type of value
        LinkedList linkedList = new LinkedList();
        linkedList.add("Lakshaya");   // add method to add values in a LinkedList
        linkedList.add(20);
        linkedList.add(5.6);
        linkedList.add(true);
        linkedList.add('A');

        System.out.println("LinkedList : "+linkedList);

        linkedList.addFirst("Linkedlist starts from here");  // add value on first index
        linkedList.addLast("Linkedlist ends here");   // add value on last index

        System.out.println("LinkedList : "+linkedList);

        // get method to get a value from LinkedList using index
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.get(4));
        System.out.println(linkedList.get(5));
        System.out.println(linkedList.get(6));
        //System.out.println(linkedList.get(7));

        System.out.println(linkedList.getClass());
        System.out.println(linkedList.getFirst());  // get value of first index
        System.out.println(linkedList.getLast());   // get value of last index




        LinkedList<String> linkedList2 = new LinkedList();
        linkedList2.add("Lakshaya");
        linkedList2.add("Shruti");
        linkedList2.add("Aziz");
        linkedList2.add("Yogesh");

        System.out.println(linkedList2);

        System.out.println(linkedList2.remove());  // remove method deletes first element
        System.out.println(linkedList2.remove("Shruti"));  // remove element using value
        System.out.println(linkedList2.remove(0));  // remove element using index
        System.out.println(linkedList2.removeAll(linkedList2)); // remove all elements

        System.out.println(linkedList2);  // linkedlist2 is now empty

        System.out.println(linkedList2.isEmpty());  // return true if empty

        System.out.println("\nrefill the linkedlist2 ----------------- ");
        linkedList2.add("Lakshaya Awasthi");
        linkedList2.add("Shruti Sharma");
        linkedList2.add("new element");
        linkedList2.add("new element");
        linkedList2.add("+-------+");
        linkedList2.add("new element");
        linkedList2.add("new element");

        System.out.println(linkedList2);

        linkedList2.removeFirstOccurrence("new element");   // remove first occurrence of a given value
        linkedList2.removeLastOccurrence("new element");    // remove last occurrence of a given value

        System.out.println(linkedList2);


        System.out.println("\nfetching elements using for-each loop");
        for (String str : linkedList2){
            System.out.println("LinkedList2 elements : "+str);
        }



        LinkedList<String> places = new LinkedList<>();
        places.add("Jaipur");
        places.add("Bharatpur");
        places.add("Dholpur");
        places.add("kerala");
        places.add("kashmir");
        places.add("himachal");

        System.out.println(places);
        System.out.println(places.peek());
        System.out.println(places);
        System.out.println(places.poll());
        System.out.println(places);
        System.out.println(places.pop());
        System.out.println(places);
        System.out.println(places.pollFirst());
        System.out.println(places);
        System.out.println(places.pollLast());
        System.out.println(places);

        System.out.println(places.hashCode());
    }
}
