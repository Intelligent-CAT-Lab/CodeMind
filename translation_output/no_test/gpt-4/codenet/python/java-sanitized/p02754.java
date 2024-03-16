import java.util.Scanner;

public class p02754 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Reading the value of n from input
        int a = scanner.nextInt(); // Reading the value of a from input
        int b = scanner.nextInt(); // Reading the value of b from input

        int k = n / (a + b); // Calculating the whole number division part
        int p = n % (a + b); // Calculating the remainder

        System.out.println(k * a + Math.min(p, a));

        scanner.close(); // Closing the scanner
    }
}