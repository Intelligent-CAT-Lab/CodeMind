import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.Scanner;

public class p00993 {
    public static void main(String[] args) {
        // Calculating the factorial-like reduction operation
        BigInteger result = IntStream.rangeClosed(1, 1500) // Replacing the Python range with a Java IntStream for the numbers 1-1500
                .mapToObj(BigInteger::valueOf) // Convert each int to a BigInteger
                .reduce(BigInteger.ONE, BigInteger::multiply); // Perform the multiplication reduction
        System.out.println(result.add(BigInteger.valueOf(2))); // Add 2 to the result and print

        // Reading input from the user and printing numbers
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Getting the integer input
        scanner.close(); // Closing the scanner to prevent resource leak

        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1); // Output each number incremented by 1
        }
    }
}