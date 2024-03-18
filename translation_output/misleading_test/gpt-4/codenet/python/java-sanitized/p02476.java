import java.util.Scanner;

public class p02476 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read two integers separated by a space from the user input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // Print the result of the modulo operation
        System.out.println(a % b);
    }
}