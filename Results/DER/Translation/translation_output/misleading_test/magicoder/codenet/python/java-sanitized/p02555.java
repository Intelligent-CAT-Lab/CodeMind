import java.util.Scanner;

public class p02555 {
    static final int MOD = 1000000007;
    static long[] fact = new long[200001];
    static long[] inv = new long[200001];

    static void preprocess(int n) {
        fact[0] = 1;
        for (int i = 1; i <= 2 * n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        inv[n] = pow(fact[n], MOD - 2);
        for (int i = n - 1; i >= 0; i--) {
            inv[i] = (inv[i + 1] * (i + 1)) % MOD;
        }
    }

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }

    static long comb(int n, int r) {
        if (n < r || r < 0) {
            return 0;
        }
        return (fact[n] * inv[r] % MOD * inv[n - r] % MOD);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s < 3) {
            System.out.println(0);
            return;
        }
        preprocess(s);
        long ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1)) % MOD;
        }
        System.out.println(ans);
    }
}