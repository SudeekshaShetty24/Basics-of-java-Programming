/*2.Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
package Java;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListReverseIterate {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Reverse iteration:");
        Iterator<String> descending = list.descendingIterator();
        while (descending.hasNext()) {
            System.out.println(descending.next());
        }
    }
}
