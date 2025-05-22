/*4.Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
package Java;

import java.util.ArrayList;
import java.util.List;

public class ColorSubList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        List<String> subColors = colors.subList(0, 2); // Index 0 and 1

        System.out.println("Original Colors: " + colors);
        System.out.println("First two colors: " + subColors);
    }
}

