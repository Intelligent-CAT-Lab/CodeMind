import java.util.*;

public class p03375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long MOD = sc.nextLong();
        long[][] B = new long[N+1][N+1];
        Arrays.fill(B, 0, MOD);
        B[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            // 1çªãåç¬ã§ä½¿ã
            for (int l = 1; l <= n; l++) {
                B[n][l] = B[n-1][l-1];
            }
            // 1çªãã©ããã«æ··ãopã¦ã░lã°ã«ã¼ãã«ã
            for (int l = 1; l <= n; l++) {
                B[n][l] += B[n-1][l-1] * (l-1) % MOD;
            }
            B[n] %= MOD;
        }
        long[] pow_2 = new long[N+1];
        Arrays.fill(pow_2, 1, MOD);
        for (int n = 1; n <= N; n++) {
            pow_2[n] = 2 * pow_2[n-1] % MOD;
        }
        long[] pow_pow = new long[N+1];
        pow_pow[0] = 2;
        for (int n = 1; n <= N; n++) {
            pow_pow[n] = pow_pow[n-1] * pow_pow[n-1] % MOD;
        }
        long[] A = new long[N+1];
        for (int n = 1; n <= N; n++) {
            A[n] = (B[n-1][1:] * (pow_2[n-1] + pow_2[n-1] * (n-1) % MOD) % MOD).sum();
        }
        Arrays.fill(A, 0, MOD);
        for (int n = 1; n <= N; n++) {
            A[n] %= MOD;
            A[n] *= pow_pow[n-1];
            A[n] %= MOD;
        }
        long[] fact = new long[N+1];
        long[] fact_inv = new long[N+1];
        for (int n = 1; n <= N; n++) {
            fact[n] = fact[n-1] * n % MOD;
            fact_inv[n] = fact[n] % MOD;
            for (int i = n-1; i > 1; i--) {
                fact_inv[i] = fact_inv[i] * n % MOD;
            }
            fact_inv[0] = pow(fact[N], MOD-2, MOD);
        }
        Arrays.fill(fact, 1, MOD);
        Arrays.fill(fact_inv, 1, MOD);
        long[] comb = new long[N+1];
        for (int n = 1; n <= N; n++) {
            comb[n] = fact_inv[n] * fact_inv[n] * fact[N] % MOD;
        }
        Arrays.fill(comb, 0, MOD);
        for (int n = 1; n <= N; n++) {
            comb[n] %= MOD;
        }
        for (int i = 1; i <= N; i++) {
            A[i] *= comb[i];
            A[i] %= MOD;
        }
        long answer = pow(2, pow(2, N, MOD-1), MOD) - A.sum();
        answer %= MOD;
        System.out.println(answer);
    }
}