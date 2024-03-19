import java.util.Scanner;

public class p00991 {
    private static final int MOD = 100000007;
    private static long[] fact;

    private static long factorial(int n) {
        if (fact[n] != 0) {
            return fact[n];
        } else {
            return fact[n] = (n <= 1) ? 1 : n * factorial(n - 1) % MOD;
        }
    }

    private static long comb(int x, int y) {
        return factorial(x) * pow((factorial(y) * factorial(x - y)) % MOD, MOD - 2) % MOD;
    }

    private static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int bx = scanner.nextInt();
        int by = scanner.nextInt();
        scanner.close();

        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));

        long ans = 1;
        if (dx * 2 == w) {
            ans = ans * 2 % MOD;
        }
        if (dy * 2 == h) {
            ans = ans * 2 % MOD;
        }
        ans = ans * comb(dx + dy, dx) % MOD;

        System.out.println(ans);
    }
}