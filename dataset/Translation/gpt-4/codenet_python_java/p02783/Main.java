import java.util.Scanner;
import java.lang.Math;

public class p02783 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        int H = scanner.nextInt();
        int A = scanner.nextInt();

        // Close the scanner to prevent resource leaks
        scanner.close();
        
        // Calculate the ceiling of H/A
        int result = (int)Math.ceil((double)H/A);

        // Print the result
        System.out.println(result);
    }
}