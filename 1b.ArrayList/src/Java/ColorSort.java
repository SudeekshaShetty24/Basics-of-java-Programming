/*3.Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
package Java;

import java.util.ArrayList;
import java.util.Collections;

public class ColorSort {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Unsorted Colors: " + colors);

        Collections.sort(colors);

        System.out.println("Sorted Colors: " + colors);
    }
}
