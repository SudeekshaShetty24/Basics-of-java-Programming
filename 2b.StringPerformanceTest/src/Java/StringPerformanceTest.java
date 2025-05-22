/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/
package Java;

public class StringPerformanceTest {
    public static void main(String[] args) {
        int iterations = 10000;
        String text = "AIET";

        // Test with StringBuffer (thread-safe, synchronized)
        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endBuffer = System.nanoTime();
        long durationBuffer = endBuffer - startBuffer;

        // Test with StringBuilder (non-thread-safe, faster)
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        long endBuilder = System.nanoTime();
        long durationBuilder = endBuilder - startBuilder;

        // Output results
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

        // Justification
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster and preferred for single-threaded performance.");
        } else {
            System.out.println("StringBuffer is safer in multi-threaded environments, but slower.");
        }
    }
}
