import java.util.Scanner;

public class p03288 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Read the input as an integer
        int n = scanner.nextInt();

        // Determine and print the output based on the given conditions
        if (n < 1200) {
            System.out.println("ABC");
        } else if (n < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }

        // Close the scanner
        scanner.close();
    }
}