import java.util.Scanner;

public class p02198 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Calculate and print the product
        System.out.println(N * M);

        // Close the scanner
        scanner.close();
    }
}