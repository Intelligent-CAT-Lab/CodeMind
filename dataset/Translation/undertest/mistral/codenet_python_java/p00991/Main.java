import java.util.Scanner;

public class p00991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, h, ax, ay, bx, by;
        w = sc.nextInt();
        h = sc.nextInt();
        ax = sc.nextInt();
        ay = sc.nextInt();
        bx = sc.nextInt();
        by = sc.nextInt();
        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        int ans = 1;
        if (dx * 2 == w) {
            ans *= 2;
        }
        if (dy * 2 == h) {
            ans *= 2;
        }
        ans *= factorial(dx + dy) / factorial(dx) / factorial(dy);
        System.out.println(ans % 100000007);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}