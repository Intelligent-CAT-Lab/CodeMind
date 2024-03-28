import java.util.Scanner;

public class p02843 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Get input

        int q = N / 100;           // Integer division to get quotient
        int mod = N % 100;         // Modulus to get remainder

        // Print 1 if mod is less than or equal to q * 5, else 0
        System.out.println(mod <= q * 5 ? 1 : 0);

        scanner.close(); // Close the scanner
    }
}