import java.util.Scanner;

public class p00411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input and split into variables
        int a = scanner.nextInt();
        int t = scanner.nextInt();
        int r = scanner.nextInt();

        // Compute the answer
        double ans = (double) r * t / a;

        // Print the result formatted to 6 decimal places
        System.out.printf("%.6f", ans);

        // Close the scanner
        scanner.close();
    }
}