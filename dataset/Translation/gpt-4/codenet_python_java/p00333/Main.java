import java.util.Scanner;

public class p00333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        int g = gcd(W, H);
        long result = ((long)W * H * C) / (g * g);
        System.out.println(result);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}