import java.util.Scanner;

public class p03892 {

    private static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        System.out.println(calculateResult(a, b, c, d));
    }

    private static int calculateResult(int a, int b, int c, int d) {
        int h = Math.abs(b - d);
        int w = Math.abs(c - a);
        if (h == 0 || w == 0) return 0;
        int m = gcd(Math.max(h, w), Math.min(h, w));
        return h + w - m;
    }
}