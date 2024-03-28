import java.util.Scanner;
import java.lang.Math;

public class p02742 {

    // Utility function for reading integer from input
    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Create a Scanner object for input reading
        Scanner scanner = new Scanner(System.in);

        // Read input values for H and W
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        // Calculate and print the result
        // Use Math.ceil and cast the result to int since Math.ceil returns a double
        System.out.println((H != 1 && W != 1) ? (int)Math.ceil(H * W / 2.0) : 1);
        
        // Close the scanner
        scanner.close();
    }
}