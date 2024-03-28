import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02932 {
    static int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int L = Integer.parseInt(input[2]);
        int R = Integer.parseInt(input[3]);

        int U = 6 * 100000 + 100;
        int[] fact = new int[U + 1];
        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = (int) ((long) fact[n - 1] * n % MOD);
        }

        int[] fact_inv = new int[U + 1];
        fact_inv[U] = pow(fact[U], MOD - 2, MOD);
        for (int n = U; n > 0; n--) {
            fact_inv[n - 1] = (int) ((long) fact_inv[n] * n % MOD);
        }

        long[] comb = new long[U + 1];
        int inv_M = pow(fact[M], MOD - 2, MOD);
        int N_MINUS_M = N - M;
        for (int i = 1; i <= N_MINUS_M; i++) {
            comb[i] = (long) fact[N_MINUS_M] * fact_inv[i] % MOD * fact_inv[N_MINUS_M - i] % MOD;
            if (i % 2 == 1) {
                comb[i] *= -1;
            }
        }

        long[] P = new long[R + 1];
        for (int i = M; i < comb.length; i++) {
            for (int j = i; j <= R; j += i) {
                P[j] = (P[j] + comb[i]) % MOD;
            }
        }

        for (int i = M; i < P.length; i++) {
            P[i] -= P[i - M];
        }

        for (int i = M; i < P.length; i++) {
            P[i] = (P[i] % MOD + MOD) % MOD;
        }

        long[] Q = new long[R + 1];
        Q[0] = 1;
        for (int i = 1; i <= R; i++) {
            Q[i] = (long) Q[i - 1] * (N + i) % MOD * pow(i, MOD - 2, MOD) % MOD;
        }

        long ans = (f(R, fact, fact_inv, N, M, P, Q) - f(L - 1, fact, fact_inv, N, M, P, Q)) % MOD;
        ans = (ans % MOD + MOD) % MOD;
        System.out.println(ans);
    }

    static int pow(int base, int exp, int mod) {
        int res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (int) ((long) res * base % mod);
            }
            base = (int) ((long) base * base % mod);
            exp >>= 1;
        }
        return res;
    }

    static long f(int R, int[] fact, int[] fact_inv, int N, int M, long[] P, long[] Q) {
        long total = (long) fact[R + N] * fact_inv[R] % MOD * fact_inv[N] % MOD;
        long x = 0;
        for (int i = 0; i <= R; i++) {
            x = (x + (long) Q[R - i] * P[i] % MOD) % MOD;
        }
        long coef = (long) fact[N] * fact_inv[M] % MOD * fact_inv[N - M] % MOD;
        return (total - x * coef) % MOD;
    }
}