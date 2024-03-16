import java.util.Scanner;

public class p02555 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s < 3) {
            System.out.println(0);
            System.exit(0);
        }
        int n = s / 3;
        long mod = (long) Math.pow(10, 9) + 7;
        long[] fact = new long[2 * s + 1];
        long[] inv = new long[2 * s + 1];
        fact[0] = 1;
        inv[2 * s] = pow(fact[2 * s], mod - 2, mod);
        for (int i = 1; i <= 2 * s; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }
        for (int i = 2 * s - 1; i >= 0; i--) {
            inv[i] = (inv[i + 1] * (i + 1)) % mod;
        }
        long ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1, mod, fact, inv)) % mod;
        }
        System.out.println(ans);
    }

    private static long comb(int x, int y, long mod, long[] fact, long[] inv) {
        if (x >= y && y >= 0) {
            return (fact[x] * inv[y] % mod * inv[x - y] % mod) % mod;
        } else {
            return 0;
        }
    }

    private static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}