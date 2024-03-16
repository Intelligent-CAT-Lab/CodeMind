import java.util.Scanner;

public class p02476 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two integers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Close the scanner
        scanner.close();

        // Print the result of a modulo b
        System.out.println(a % b);
    }
}