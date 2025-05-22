/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
package Java;

public class Q5_RemoveWhitespace {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String input = "  Welcome   to  AIET  ";
        System.out.println("Original: '" + input + "'");
        System.out.println("Without Whitespace: '" + removeWhitespace(input) + "'");
    }
}
