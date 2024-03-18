import java.util.Scanner;

public class p00376 {
    public static void main(String[] args) {
        // Create a Scanner object for getting input from the user
        Scanner scanner = new Scanner(System.in);

        // Read two integer values
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Calculate and print the absolute difference between the two numbers
        System.out.println(Math.abs(a - b));

        // Close the Scanner
        scanner.close();
    }
}