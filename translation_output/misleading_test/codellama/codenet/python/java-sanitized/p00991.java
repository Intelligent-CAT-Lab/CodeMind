import java.util.Scanner;

public class p00991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();

        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        int ans = 1;
        if (dx * 2 == w) {
            ans *= 2;
        }
        if (dy * 2 == h) {
            ans *= 2;
        }
        ans *= comb(dx + dy, dx);
        System.out.println(ans % 100000007);
    }

    public static int comb(int x, int y) {
        return factorial(x) / factorial(x - y) / factorial(y);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}