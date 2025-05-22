/*5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
package Java;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListSwapElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Before swap: " + list);

        // Swap first (index 0) and third (index 2)
        Collections.swap(list, 0, 2);

        System.out.println("After swap (first and third): " + list);
    }
}
