import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02932 {
    static final long MOD = (long) Math.pow(10, 9) + 7;
    static long[] fact;
    static long[] fact_inv;
    static long[] comb;
    static long[] P;
    static long[] Q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int L = Integer.parseInt(input[2]);
        int R = Integer.parseInt(input[3]);

        int U = 6 * (int) Math.pow(10, 5) + 100;
        fact = new long[U + 1];
        fact_inv = new long[U + 1];
        comb = new long[U + 1];
        P = new long[R + 1];
        Q = new long[R + 1];

        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = (fact[n - 1] * n) % MOD;
        }

        fact_inv[U] = pow(fact[U], MOD - 2, MOD);
        for (int n = U; n > 0; n--) {
            fact_inv[n - 1] = (fact_inv[n] * n) % MOD;
        }

        U = N - M;
        for (int n = 0; n <= U; n++) {
            comb[n] = (fact[U] * fact_inv[n] % MOD * fact_inv[U - n]) % MOD;
        }

        for (int n = 1; n <= U; n += 2) {
            comb[n] = (comb[n] * -1) % MOD;
        }

        for (int n = M; n <= R; n++) {
            P[n] = (P[n - 1] + comb[n]) % MOD;
        }

        for (int n = N; n <= R + N; n++) {
            Q[n - N] = (fact[n] * fact_inv[n - N] % MOD * fact_inv[N]) % MOD;
        }

        long answer = (f(R) - f(L - 1) + MOD) % MOD;
        System.out.println(answer);
    }

    public static long pow(long a, long b, long m) {
        if (b == 0) {
            return 1;
        }
        long p = pow(a * a % MOD, b / 2, m);
        if (b % 2 == 1) {
            p = p * a % MOD;
        }
        return p;
    }

    public static long f(int R) {
        long total = (fact[R + N] * fact_inv[R] % MOD * fact_inv[N]) % MOD;
        long x = 0;
        for (int i = 0; i < R; i++) {
            x = (x + Q[i] * P[R - i]) % MOD;
        }
        long coef = (fact[N] * fact_inv[M] % MOD * fact_inv[N - M]) % MOD;
        return (total - x * coef % MOD + MOD) % MOD;
    }
}