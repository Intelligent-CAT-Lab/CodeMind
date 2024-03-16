import java.util.Scanner;

public class p02553 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // Compute the maximum product
        long ans = Long.MIN_VALUE;  // Equivalent to -1000000000000000000L
        ans = Math.max(ans, (long) a * c);
        ans = Math.max(ans, (long) a * d);
        ans = Math.max(ans, (long) b * c);
        ans = Math.max(ans, (long) b * d);

        // Print the result
        System.out.println(ans);

        // Close the scanner
        scanner.close();
    }
}