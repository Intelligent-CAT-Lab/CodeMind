import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long MOD = Long.parseLong(st.nextToken());

        long[][] B = new long[N + 1][N + 1];
        B[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            B[n][1] = B[n - 1][0];
            for (int l = 1; l <= N; l++) {
                B[n][l] = (B[n - 1][l - 1] + B[n - 1][l] * l) % MOD;
            }
        }

        long[][] pow_2 = new long[N + 1][N + 1];
        for (int n = 1; n <= N; n++) {
            pow_2[1][n] = 2 * pow_2[1][n - 1] % MOD;
        }
        for (int n = 2; n <= N; n++) {
            for (int i = 1; i <= N; i++) {
                pow_2[n][i] = pow_2[n - 1][i] * pow_2[1][i] % MOD;
            }
        }

        long[] pow_pow = new long[N + 1];
        pow_pow[0] = 2;
        for (int n = 1; n <= N; n++) {
            pow_pow[n] = pow_pow[n - 1] * pow_pow[n - 1] % MOD;
        }

        long[] A = new long[N + 1];
        for (int n = 0; n <= N; n++) {
            for (int l = 1; l <= N; l++) {
                A[n] += (B[n][l] * (pow_2[N - l + 1][l] + pow_2[N - l + 1][l - 1] * l % MOD) % MOD) % MOD;
            }
        }

        long[] fact = new long[N + 1];
        long[] fact_inv = new long[N + 1];
        fact[0] = 1;
        for (int n = 1; n <= N; n++) {
            fact[n] = (fact[n - 1] * n) % MOD;
        }
        fact_inv[N] = power(fact[N], MOD - 2, MOD);
        for (int n = N; n > 0; n--) {
            fact_inv[n - 1] = (fact_inv[n] * n) % MOD;
        }

        long[] comb = new long[N + 1];
        for (int n = 0; n <= N; n++) {
            comb[n] = (fact_inv[n] * fact_inv[N - n] % MOD * fact[N] % MOD) % MOD;
        }

        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                A[i] *= -1;
            }
            A[i] *= comb[i];
            A[i] %= MOD;
        }

        long sumA = 0;
        for (long value : A) {
            sumA += value;
            sumA %= MOD;
        }

        long answer = power(2, power(2, N, MOD - 1), MOD) - sumA;
        answer %= MOD;
        System.out.println(answer);
    }

    static long power(long x, long y, long p) {
        long res = 1;
        x = x % p;

        while (y > 0) {
            if (y % 2 == 1) {
                res = (res * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }
}