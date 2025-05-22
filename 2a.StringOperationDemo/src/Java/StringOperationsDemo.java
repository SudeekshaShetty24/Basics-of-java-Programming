/*2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/
package Java;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Java Programming");

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);

        // 2. Length and Character Access
        System.out.println("\nLength of str3: " + str3.length());
        System.out.println("Character at index 5 in str3: " + str3.charAt(5));

        // 3. String Comparison
        String str4 = "Hello";
        System.out.println("\nstr1 equals str4? " + str1.equals(str4));
        System.out.println("str1 equalsIgnoreCase str4? " + str1.equalsIgnoreCase("hello"));

        // 4. String Searching
        System.out.println("\nDoes str3 contain 'Java'? " + str3.contains("Java"));
        System.out.println("Index of 'Programming' in str3: " + str3.indexOf("Programming"));

        // 5. Substring Operations
        String sub = str3.substring(5, 16);
        System.out.println("\nSubstring from index 5 to 16 in str3: " + sub);

        // 6. String Modification
        String modified = str3.replace("Java", "Python");
        System.out.println("After replacing 'Java' with 'Python': " + modified);

        // 7. Whitespace Handling
        String strWithSpaces = "   Welcome to Java   ";
        System.out.println("\nOriginal with spaces: '" + strWithSpaces + "'");
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String full = str1 + " " + str2;
        System.out.println("\nConcatenated string: " + full);

        // 9. String Splitting
        String csv = "Apple,Banana,Orange";
        String[] fruits = csv.split(",");
        System.out.println("\nSplitting CSV string:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to Java");
        sb.insert(0, "Hello! ");
        sb.replace(6, 13, " Everyone");
        System.out.println("\nStringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Sudeeksha";
        int age = 20;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nFormatted string: " + formatted);

        // 12. Validate Email
        String email = "user@gmail.com";
        System.out.println("\nValidating email: " + email);
        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }
    }
}
