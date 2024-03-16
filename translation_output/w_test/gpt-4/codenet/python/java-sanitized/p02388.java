import java.util.Scanner;

public class p02388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the input
        int x = scanner.nextInt();
        // Calculate x to the power of 3 and print the result
        System.out.println(x * x * x);
        // Close the scanner
        scanner.close();
    }
}