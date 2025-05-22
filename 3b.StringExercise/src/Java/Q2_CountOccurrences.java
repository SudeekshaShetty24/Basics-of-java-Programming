/*Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
package Java;

public class Q2_CountOccurrences {
    public static int countOccurrences(String main, String sub) {
        int count = 0;
        int index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String mainStr = "banana";
        String subStr = "an";
        System.out.println("Occurrences of '" + subStr + "' in '" + mainStr + "': " + countOccurrences(mainStr, subStr));
    }
}
