import java.util.Scanner;
import java.lang.Math;

public class p03264 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the integer input from the user
        int k = scanner.nextInt();

        // Calculate the result as the product of the ceiling of k/2 and the floor division of k by 2
        int result = (int)Math.ceil(k / 2.0) * (k / 2);

        // Print the result to the console
        System.out.println(result);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}