import java.util.Scanner;

public class p02859 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        int r = scanner.nextInt(); // Read the next integer from the input
        System.out.println(r * r); // Print the square of the integer
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}