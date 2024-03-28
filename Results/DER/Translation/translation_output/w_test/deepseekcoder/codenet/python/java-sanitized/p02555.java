import java.util.Scanner;

public class p02555 {
    static final long MOD = 1_000_000_007;
    static long[] fact, inv;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s < 3) {
            System.out.println(0);
            System.exit(0);
        }
        int n = s / 3;
        fact = new long[2 * s + 1];
        inv = new long[2 * s + 1];
        for (int i = 0; i < 2 * s + 1; i++) {
            fact[i] = i != 0 ? i * fact[i - 1] % MOD : 1;
        }
        inv[2 * s] = pow(fact[2 * s], MOD - 2);
        for (int i = 2 * s - 1; i >= 0; i--) {
            inv[i] = i != 2 * s - 1 ? inv[i + 1] * (i + 1) % MOD : 1;
        }
        long ans = 0;
        for (int i = 1; i <= s + 1; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1)) % MOD;
        }
        System.out.println(ans);
    }

    static long comb(int x, int y) {
        if (x >= y && y >= 0) {
            return fact[x] * inv[y] % MOD * inv[x - y] % MOD;
        } else {
            return 0;
        }
    }

    static long pow(long a, long b) {
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
}