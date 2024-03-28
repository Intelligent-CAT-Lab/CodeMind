import java.util.*;

public class atcoder_ARC102_C {
    static int mod = (int) 1e9 + 7;
    static int K, N;
    static long[] frac, invf;

    static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            long tmp = u;
            u = x - u * (k / l);
            x = tmp;
            tmp = v;
            v = y - v * (k / l);
            y = tmp;
            k %= l;
            l = k;
        }
        return x < 0 ? x + mod : x;
    }

    static void preprocess() {
        frac = new long[N + K + 1];
        invf = new long[N + K + 1];
        frac[0] = 1;
        for (int i = 1; i <= N + K; i++) {
            frac[i] = (i * frac[i - 1]) % mod;
        }
        for (int i = 0; i <= N + K; i++) {
            invf[i] = inved(frac[i]);
        }
    }

    static void solve() {
        long[] X = new long[2 * K - 1];
        for (int k = 2; k <= K + 1; k++) {
            long S = 0, sign = 1;
            int l = k / 2;
            for (int m = 0; m < Math.min(l + 1, N / 2 + 1); m++) {
                long prod = (sign * frac[l] * frac[N + K - 2 * m - 1]) % mod;
                prod = (prod * invf[m] % mod * invf[l - m]) % mod;
                prod = (prod * invf[N - 2 * m] % mod * invf[K - 1]) % mod;
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
        Scanner scanner = new Scanner(System.in);
        K = scanner.nextInt();
        N = scanner.nextInt();
        preprocess();
        solve();
    }
}