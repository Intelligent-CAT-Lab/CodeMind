import java.io.*;
import java.util.*;

public class p03135 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two integers, t and x, from the input
        int t = scanner.nextInt();
        int x = scanner.nextInt();

        // Since the division should result in a floating point number,
        // at least one operand should be cast to double before the operation.
        double result = (double)t / x;

        // Output the result with a newline
        System.out.printf("%.10f\n", result);

        // Close the scanner
        scanner.close();
    }
}