import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ARC102_C {
    private static final int mod = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        long[] frac = new long[N + K + 1];
        long[] invf = new long[N + K + 1];
        long[] X = new long[2 * K - 1];

        frac[0] = 1;
        for (int i = 1; i < frac.length; i++) {
            frac[i] = (i * frac[i - 1]) % mod;
        }

        for (int i = 0; i < invf.length; i++) {
            invf[i] = inved(frac[i]);
        }

        for (int k = 2; k <= K + 1; k++) {
            long S = 0;
            long sign = 1;
            int l = k / 2;
            for (int m = 0; m < Math.min(l + 1, N / 2 + 1); m++) {
                long prod = sign * frac[l] % mod * frac[N + K - 2 * m - 1] % mod;
                prod = prod * invf[m] % mod * invf[l - m] % mod;
                prod = prod * invf[N - 2 * m] % mod * invf[K - 1] % mod;
                S = (S + prod) % mod;
                sign *= -1;
            }
            X[k - 2] = S;
            X[2 * K - k] = S;
        }

        for (long x : X) {
            System.out.println(x);
        }
    }

    private static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            long tmp = x - u * (k / l);
            x = u;
            u = tmp;

            tmp = y - v * (k / l);
            y = v;
            v = tmp;

            tmp = k % l;
            k = l;
            l = tmp;
        }
        return (x + mod) % mod;
    }
}