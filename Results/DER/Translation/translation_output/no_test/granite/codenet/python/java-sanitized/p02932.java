import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02932 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int L = Integer.parseInt(inputs[2]);
        int R = Integer.parseInt(inputs[3]);

        final int MOD = 100000007;
        final int U = 600000;
        long[] fact = new long[U + 1];
        long[] fact_inv = new long[U + 1];
        fact[0] = 1;
        fact_inv[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n - 1] * n % MOD;
        }
        fact_inv[U] = pow(fact[U], MOD - 2, MOD);
        for (int n = U; n > 0; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % MOD;
        }

        long[] comb = new long[N - M + 1];
        comb[0] = 1;
        for (int i = 1; i <= N - M; i++) {
            comb[i] = fact[N - M] * fact_inv[i] % MOD * fact_inv[N - M - i] % MOD;
            if (i % 2 == 1) {
                comb[i] *= -1;
            }
        }

        long[] P = new long[R + 1];
        for (int i = 1; i <= N - M; i++) {
            for (int j = i; j <= R; j += i) {
                P[j] += comb[i];
            }
        }
        for (int i = 1; i <= R; i++) {
            P[i] = (P[i] % MOD + MOD) % MOD;
        }
        for (int i = R; i > 0; i--) {
            P[i - 1] += P[i];
        }
        for (int i = 0; i < R; i++) {
            P[i] = (P[i] % MOD + MOD) % MOD;
        }

        long[] Q = new long[R + 1];
        Q[0] = 1;
        for (int i = 1; i <= R; i++) {
            Q[i] = fact[N + i] * fact_inv[i] % MOD * fact_inv[N] % MOD;
        }

        long total = fact[N + R] * fact_inv[N] % MOD * fact_inv[R] % MOD;
        long x = 0;
        for (int i = 1; i <= R; i++) {
            x += P[i] * Q[R - i] % MOD;
        }
        x %= MOD;
        long coef = fact[N] * fact_inv[M] % MOD * fact_inv[N - M] % MOD;
        long ans = (total - x * coef % MOD + MOD) % MOD;
        System.out.println(ans);
    }

    static long pow(long a, long x, long mod) {
        long res = 1;
        while (x > 0) {
            if (x % 2!= 0) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            x /= 2;
        }
        return res;
    }
}