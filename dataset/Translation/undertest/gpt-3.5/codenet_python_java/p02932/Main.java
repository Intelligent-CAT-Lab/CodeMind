import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p02932 {
    static final int MOD = 1000000007;
    static final int U = 600100;

    static long[] fact = new long[U + 1];
    static long[] fact_inv = new long[U + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        long[] comb = new long[U + 1];
        long[] P = new long[R + 1];

        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n - 1] * n % MOD;
        }

        fact_inv[U] = pow(fact[U], MOD - 2);
        for (int n = U; n > 0; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % MOD;
        }

        for (int i = 0; i <= U; i++) {
            comb[i] = fact[N - M] * fact_inv[i] % MOD * fact_inv[N - M - i] % MOD;
            if (i % 2 == 1) {
                comb[i] *= -1;
            }
        }

        for (int i = M; i < R + 1; i++) {
            for (int j = M; j <= i; j += i) {
                P[j] += comb[i];
            }
        }

        for (int i = M; i < R + 1; i++) {
            if (i - M >= 0) {
                P[i] -= P[i - M];
            }
            P[i] %= MOD;
        }

        long[] Q = new long[R + 1];
        for (int i = 0; i <= R; i++) {
            Q[i] = fact[N + i] * fact_inv[i] % MOD * fact_inv[N] % MOD;
        }

        long answer = (f(R) - f(L - 1) + MOD) % MOD;
        System.out.println(answer);
    }

    static long pow(long base, long exp) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = result * base % MOD;
            }
            base = base * base % MOD;
            exp /= 2;
        }
        return result;
    }

    static long f(int R) {
        long total = fact[R + N] * fact_inv[R] % MOD * fact_inv[N] % MOD;
        long x = 0;
        for (int i = 0; i <= R; i++) {
            x += Q[R - i] * P[i] % MOD;
        }
        x %= MOD;
        long coef = fact[N] * fact_inv[M] % MOD * fact_inv[N - M] % MOD;
        return (total - x * coef + MOD) % MOD;
    }
}