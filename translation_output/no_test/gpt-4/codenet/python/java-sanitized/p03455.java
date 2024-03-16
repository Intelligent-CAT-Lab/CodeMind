import java.util.Scanner;

public class p03455 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        int a = scanner.nextInt();                // Read the first integer
        int b = scanner.nextInt();                // Read the second integer
        scanner.close();                          // Close the scanner
        
        int c = a * b;                            // Multiply the integers
        if (c % 2 == 1) {
            System.out.println("Odd");            // Print "Odd" if the product is odd
        } else {
            System.out.println("Even");           // Print "Even" if the product is even
        }
    }
}