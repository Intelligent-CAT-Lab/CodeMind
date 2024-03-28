import java.util.Scanner;

public class p02594 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read an integer value from the user
        int X = scanner.nextInt();
        
        // Check the condition and print "Yes" or "No"
        if (X >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

// Test input: 25
// Expected output: No