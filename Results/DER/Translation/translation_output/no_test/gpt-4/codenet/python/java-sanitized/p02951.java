import java.util.Scanner;

public class p02951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read A, B, and C from user input
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // Calculate the value of 'get'
        int get = A - B;

        // Calculate the value of 'i'
        int i = C - get;

        // Ensure 'i' is not negative
        if (i < 0) {
            i = 0;
        }

        // Print the result
        System.out.println(i);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}