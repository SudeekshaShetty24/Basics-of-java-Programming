/*Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/s
package Java;

public class Q10_CountWords {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "   Computer Science Department at AIET  ";
        System.out.println("Word Count: " + countWords(input));
    }
}
