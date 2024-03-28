import java.util.Scanner;

public class p03892 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int h = Math.abs(b - d);
        int w = Math.abs(c - a);

        if (h == 0 || w == 0) {
            System.out.println(0);
            return;
        }

        int m = gcd(Math.max(h, w), Math.min(h, w));
        int result = h + w - m;
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}