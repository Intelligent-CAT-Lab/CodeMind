import java.util.Scanner;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int mod = 998244353;

        int[] X = new int[2 * K - 1];
        int[] frac = new int[N + K + 1];
        frac[0] = 1;
        for (int i = 1; i <= N + K; i++) {
            frac[i] = (int) ((i + 1) * (long) frac[i - 1] % mod);
        }

        int[] invf = new int[N + K + 2];
        invf[0] = 1;
        for (int i = 1; i <= N + K + 1; i++) {
            invf[i] = inved(frac[i], mod);
        }

        for (int k = 2; k <= K + 2; k++) {
            int S = 0;
            int sign = 1;
            int l = k / 2;
            for (int m = 0; m <= Math.min(l + 1, N / 2 + 1); m++) {
                int prod = (int) ((sign * (long) frac[l] * frac[N + K - 2 * m - 1]) % mod);
                prod = (prod * invf[m]) % mod;
                prod = (prod * invf[l - m]) % mod;
                prod = (prod * invf[N - 2 * m]) % mod;
                prod = (prod * invf[K - 1]) % mod;
                S += prod;
                S %= mod;
                sign *= -1;
            }
            X[k - 2] = S;
            X[2 * K - k] = S;
        }

        for (int i = 0; i <