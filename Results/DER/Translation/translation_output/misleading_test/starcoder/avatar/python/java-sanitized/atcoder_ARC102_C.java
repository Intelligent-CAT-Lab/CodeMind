import java.util.*;
public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int mod = 998244353;
        int[] X = new int[2 * K - 1];
        int[] frac = new int[N + K + 1];
        frac[0] = 1;
        for (int i = 1; i <= N + K; i++) {
            frac[i] = (i * frac[i - 1]) % mod;
        }
        int[] invf = new int[N + K + 1];
        invf[N] = inved(frac[N]);
        for (int i = N - 1; i >= 0; i--) {
            invf[i] = (invf[i + 1] * (i + 1)) % mod;
        }
        for (int k = 2; k <= K + 2; k++) {
            int S = 0;
            int sign = 1;
            int l = k / 2;
            for (int m = Math.min(l + 1, N / 2 + 1); m >= 0; m--) {
                int prod = (sign * (frac[l] * frac[N + K - 2 * m - 1])) % mod;
                prod = (prod * (invf[m] * invf[l - m])) % mod;
                prod = (prod * (invf[N - 2 * m] * invf[K - 1])) % mod;
                S += prod;
                S %= mod;
                sign *= -1;
            }
            X[k - 2] = S;
            X[2 * K - k] = S;
        }
        for (int i = 0; i < 2 * K - 1; i++) {
            System.out.println(X[i]);
        }
    }

    public static int inved(int a) {
        int x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l!= 0) {
            int q = k / l;
            int t = l;
            l = k % l;
            k = t;
            t = x;
            x = u - q * x;
            u = t;
            t = y;
            y = v - q * y;
            v = t;
        }
        return x % mod;
    }
}