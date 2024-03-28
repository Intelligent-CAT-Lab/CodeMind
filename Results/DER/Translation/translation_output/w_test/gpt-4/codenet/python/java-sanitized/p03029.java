import java.util.Scanner;

public class p03029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt(); // Reads the first integer input for 'a'
        int p = scanner.nextInt(); // Reads the second integer input for 'p'

        System.out.println((3 * a + p) / 2); // Calculates and prints the result

        scanner.close(); // Closes the scanner
    }
}