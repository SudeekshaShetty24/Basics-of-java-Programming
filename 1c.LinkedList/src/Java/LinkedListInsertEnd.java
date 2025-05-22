/*3.Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
package Java;

import java.util.LinkedList;

public class LinkedListInsertEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.offerLast("Pink"); // Add at the end

        System.out.println("LinkedList after adding 'Pink' at the end: " + list);
    }
}
