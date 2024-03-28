import java.util.Scanner;

public class p03371 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Calculate the minimum value among a, b, and c
        int mi = Math.min(X, Y);
        int a = A * X + B * Y;
        int b = mi * C * 2 + A * (X - mi) + B * (Y - mi);
        int c = Math.max(X, Y) * C * 2;

        // Output the minimum cost
        System.out.println(Math.min(a, Math.min(b, c)));

        // Close the scanner
        scanner.close();
    }
}