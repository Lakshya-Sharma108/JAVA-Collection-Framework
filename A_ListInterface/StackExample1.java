package A_ListInterface;

import java.util.*;

public class StackExample1 {
    public static void main(String[] args) {
        /*
            Java Stack:
            The Java collection framework has a class named stack, that provides the functionality of stack data structure. The stack class extends the vector class
            Stack also implements List interface

            Stack follows LIFO ordering: Last In, First Out

        */


        // creation
        // Collection<Integer> stack = new Stack<>(); // first way
        // List<Integer> stack = new Stack<>();   // Second way
        // Stack<Integer> stack = new Stack<>();   // third way

        List<Integer> stack1 = new Stack<>();
        stack1.add(10);
        stack1.add(20);
        stack1.add(30);
        stack1.add(40);
        stack1.add(50);

        System.out.println(stack1);

        // Removing elements
        stack1.remove(1);  // needs index to remove elements
        System.out.println(stack1);


        List<Integer> stack2 = new Stack<>();
        stack2.add(110);
        stack2.addAll(stack2);
        System.out.println(stack2);


        stack2.removeAll(stack2);
        System.out.println(stack2);


        // checking the size of stack1
        System.out.println("Size of vector1: "+stack1.size());

        // removing all elements from stack2
        stack2.clear();
        System.out.println(stack2);




        // iterator():
        // Its a standard way to travel on different collections

        // for Stack -> we need Stack iterator
        // for ArrayList -> we need ArrayList iterator
        // for LinkedList -> we need LinkedList iterator
        // for Vector -> we need Vector iterator

        //Example:
        Stack<Integer> stack3 = new Stack<>();
        stack3.add(100);
        stack3.add(200);
        stack3.add(300);
        stack3.add(400);
        stack3.add(500);


        // I want traverse stack3 using iterator
        // Creating iterator for stack3
        Iterator<Integer> iterator = stack3.iterator();
        while (iterator.hasNext()){
            System.out.println("Element: "+iterator.next());
        }



        Stack<Integer> stack4 = new Stack<>();
        stack4.add(11);
        stack4.add(12);
        stack4.add(13);
        stack4.add(14);
        stack4.add(15);

        // getting an element using index
        System.out.println(stack4.get(1));

        // setting an element using index
        stack4.set(2, 88);
        System.out.println(stack4);

        // checking if an element exists in the stack
        System.out.println(stack4.contains(15));




        // Some more methods:
        // sort() -> sort the stack element
        // clone() -> creates a new stack with the same element, size and capacity
        // ensureCapacity() -> Specifies the total elements the stack can contain
        // isEmpty() -> checks if the stack is empty
        // indexOf -> searches a specified element in a stack and returns the index of element

        Stack<Integer> stack5 = new Stack<>();
        stack5.add(30);
        stack5.add(40);
        stack5.add(12);
        stack5.add(6);

        System.out.println("Printing entire stack5: "+stack5);

        // sorting stack5 in increasing order
        Collections.sort(stack5);
        System.out.println("Printing sorted vector5: "+stack5);

        // How to sort in decreasing order???
        Collections.sort(stack5, Collections.reverseOrder());
        System.out.println("Printing sorted stack5: "+stack5);

        // cloning stack5 elements in new list
        Vector<Integer> newList = (Vector<Integer>) stack5.clone();
        System.out.println("Cloned elements: "+newList);


        Stack<Integer> marks = new Stack<>();
        marks.ensureCapacity(100);  // It will not resize the stack until 100 element


        // checking is a stack empty or not -> returns -1 if elements not exits
        System.out.println(newList.isEmpty());  // return false
        System.out.println(marks.isEmpty());  // return true


        // checking the index of a particular element
        System.out.println(newList.indexOf(30));
        System.out.println(newList.indexOf(6));
        System.out.println(newList.indexOf(12));
        System.out.println(newList.indexOf(100));
    }
}
