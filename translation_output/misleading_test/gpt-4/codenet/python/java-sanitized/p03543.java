import java.util.Scanner;

public class p03543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: "); // Unlike Python, we typically prompt the user in Java
        String N = scanner.next(); // Reads input as string

        if (N.length() != 4) {
            System.out.println("Invalid input: Number must have exactly 4 digits.");
            return; // Exit if the input is not 4 digits
        }

        char a = N.charAt(0);
        char b = N.charAt(1);
        char c = N.charAt(2);
        char d = N.charAt(3);

        if (a == b && b == c || b == c && c == d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}