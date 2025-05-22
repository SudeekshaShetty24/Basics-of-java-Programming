/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
package Java;

public class Q8_IsNumeric {
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input1 = "123456";
        String input2 = "12A34";

        System.out.println(input1 + " is numeric? " + isNumeric(input1));
        System.out.println(input2 + " is numeric? " + isNumeric(input2));
    }
}
