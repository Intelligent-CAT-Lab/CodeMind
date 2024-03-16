import java.util.Scanner;

public class p03371 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Calculations
        int mi = Math.min(X, Y);
        int a = A * X + B * Y;
        int b = mi * C * 2 + A * (X - mi) + B * (Y - mi);
        int c = Math.max(X, Y) * C * 2;

        // Finding the minimum
        int result = Math.min(Math.min(a, b), c);

        // Printing result
        System.out.println(result);

        // Closing the scanner
        scanner.close();
    }
}