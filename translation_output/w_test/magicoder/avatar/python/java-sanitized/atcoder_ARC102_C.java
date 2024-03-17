import java.util.*;

public class atcoder_ARC102_C {
    static final int mod = 998244353;
    static int K, N;
    static long[] frac, invf, X;

    static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            long t = k / l;
            x = u; y = v; u = x - u * t; v = y - v * t;
            k = l; l = k % l;
        }
        return x % mod;
    }

    static void solve() {
        frac = new long[N + K + 1];
        invf = new long[N + K + 1];
        X = new long[2 * K - 1];
        frac[0] = 1;
        for (int i = 1; i <= N + K; i++) {
            frac[i] = (i * frac[i - 1]) % mod;
        }
        for (int i = 0; i <= N + K; i++) {
            invf[i] = inved(frac[i]);
        }
        for (int k = 2; k <= K + 1; k++) {
            long S = 0, sign = 1;
            int l = k / 2;
            for (int m = 0; m <= Math.min(l, N / 2); m++) {
                long prod = (sign * frac[l] * frac[N + K - 2 * m - 1]) % mod;
                prod = (prod * invf[m] * invf[l - m]) % mod;
                prod = (prod * invf[N - 2 * m] * invf[K - 1]) % mod;
                S = (S + prod) % mod;
                sign *= -1;
            }
            X[k - 2] = S;
            X[2 * K - k] = S;
        }
        for (int i = 0; i < 2 * K - 1; i++) {
            System.out.println(X[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        solve();
    }
}