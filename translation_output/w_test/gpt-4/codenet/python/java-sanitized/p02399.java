import java.util.Scanner;

public class p02399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        int a = scanner.nextInt(); // Read the first number
        int b = scanner.nextInt(); // Read the second number
        scanner.close(); // Close the scanner
        
        int division = a / b; // Integer division
        int remainder = a % b; // Remainder of the division
        double preciseDivision = (double) a / b; // Floating-point division
        
        // Print the results in the specified format
        System.out.printf("%d %d %.5f", division, remainder, preciseDivision);
    }
}