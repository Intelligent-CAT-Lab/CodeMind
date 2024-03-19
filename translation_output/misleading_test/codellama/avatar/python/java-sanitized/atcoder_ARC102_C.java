import java.util.Scanner;

public class atcoder_ARC102_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int mod = 998244353;

        int[] frac = new int[N + K + 1];
        frac[0] = 1;
        for (int i = 1; i <= N + K; i++) {
            frac[i] = (i * frac[i - 1]) % mod;
        }

        int[] invf = new int[N + K + 1];
        for (int i = 0; i <= N + K; i++) {
            invf[i] = inved(frac[i]);
        }

        int[] X = new int[2 * K - 1];
        for (int k = 2; k <= K + 1; k++) {
            int S = 0;
            int sign = 1;
            int l = k / 2;
            for (int m = Math.min(l + 1, N / 2 + 1); m > 0; m--) {
                int prod = (sign * (frac[l] * frac[N + K - 2 * m - 1]) % mod) * (invf[m] * invf[l - m] % mod) % mod;
                prod *= (invf[N - 2 * m] * invf[K - 1] % mod) % mod;
                S += prod % mod;
                sign *= -1;
            }
            X[k - 2] = S % mod;
            X[2 * K - k] = S % mod;
        }

        for (int i = 0; i < 2 * K - 1; i++) {
            System.out.println(X[i]);
        }
    }

    public static int inved(int a) {
        int x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            x = u;
            y = v;
            u = x - u * (k / l);
            v = y - v * (k / l);
            k = l;
            l = k % l;
        }
        return x % mod;
    }
}