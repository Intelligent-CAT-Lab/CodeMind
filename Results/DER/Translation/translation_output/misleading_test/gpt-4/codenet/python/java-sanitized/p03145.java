import java.util.Scanner;

public class p03145 {
    public static void main(String[] args) {
        // Set up a Scanner to read the input
        Scanner scanner = new Scanner(System.in);
        
        // Read three integer values
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close(); // Close the scanner
        
        // Calculate and print the result
        System.out.println(a * b / 2);
    }
}