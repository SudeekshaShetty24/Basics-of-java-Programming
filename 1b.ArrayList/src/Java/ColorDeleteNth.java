package Java;

/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
import java.util.ArrayList;
import java.util.Scanner;

public class ColorDeleteNth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index (starting from 0) to remove: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < colors.size()) {
            colors.remove(index);
            System.out.println("Updated Colors: " + colors);
        } else {
            System.out.println("Invalid index!");
        }

        scanner.close();
    }
}
