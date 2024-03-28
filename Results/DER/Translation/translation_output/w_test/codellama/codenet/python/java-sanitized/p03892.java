import java.util.Scanner;

public class p03892 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int h = Math.abs(b - d);
        int w = Math.abs(c - a);

        if (h == 0 || w == 0) {
            System.out.println(0);
            return;
        }

        int m = gcd(Math.max(h, w), Math.min(h, w));
        System.out.println(h + w - m);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}