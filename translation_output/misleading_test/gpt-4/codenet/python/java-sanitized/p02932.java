import java.math.BigInteger;
import java.util.Scanner;

public class p02932 {
    private static final int MOD = 1_000_000_007;
    private static final int U = 600_100;
    private static long[] fact = new long[U + 1];
    private static long[] fact_inv = new long[U + 1];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        scanner.close();

        // Precompute factorial and inverse factorial arrays
        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n - 1] * n % MOD;
        }
        fact_inv[U] = BigInteger.valueOf(fact[U]).modInverse(BigInteger.valueOf(MOD)).longValue();
        for (int n = U; n > 0; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % MOD;
        }

        int U2 = N - M;
        long[] comb = new long[U2 + 1];
        for (int i = 0; i <= U2; i++) {
            comb[i] = fact[U2] * fact_inv[i] % MOD * fact_inv[U2 - i] % MOD;
            if (i % 2 == 1) comb[i] = (MOD - comb[i]) % MOD;
        }

        long[] P = new long[R + 1];
        for (int i = M, x = 0; i <= U2; i++, x++) {
            for (int j = 1; i * j <= R; j++) {
                P[i * j] = (P[i * j] + comb[x]) % MOD;
            }
        }

        for (int i = M; i <= R - M; i++) {
            P[i + M] = (P[i + M] - P[i] + MOD) % MOD;
        }

        long[] Q = new long[R + 1];
        for (int i = 0; i <= R; i++) {
            Q[i] = fact[N + i] * fact_inv[i] % MOD * fact_inv[N] % MOD;
        }

        long answer = (f(R, P, Q, N) - f(L - 1, P, Q, N) + MOD) % MOD;
        System.out.println(answer);
    }

    private static long f(int R, long[] P, long[] Q, int N) {
        long total = fact[R + N] * fact_inv[R] % MOD * fact_inv[N] % MOD;
        long x = 0;
        for (int i = 0; i <= R; i++) {
            x = (x + Q[R - i] * P[i] % MOD) % MOD;
        }
        long coef = fact[N] * fact_inv[N - (N - M)] % MOD * fact_inv[N - M] % MOD;
        return (total - x * coef % MOD + MOD) % MOD;
    }
}