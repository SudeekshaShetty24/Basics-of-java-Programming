/*Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
package Java;

import java.util.Random;

public class Q9_RandomString {
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(rand.nextInt(characters.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Random String (length 10): " + generateRandomString(10));
    }
}

