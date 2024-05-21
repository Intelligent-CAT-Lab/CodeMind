import java.util.*;
import java.io.*;

public class p03375 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int MOD = Integer.parseInt(input[1]);

        long[][] B = new long[N+1][N+1];
        B[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            // 1 から n までの和
            B[n][1] = B[n-1][0];
            for (int l = 2; l <= n; l++) {
                B[n][l] = (B[n-1][l-1] + B[n-1][l] * l) % MOD;
            }
        }

        // 2^(kl)
        long[] pow_2 = new long[N+1];
        pow_2[0] = 2;
        for (int n = 1; n <= N; n++) {
            pow_2[n] = pow_2[n-1] * pow_2[1] % MOD;
        }

        long[] pow_pow = new long[N+1];
        pow_pow[0] = 2;
        for (int n = 1; n <= N; n++) {
            pow_pow[n] = pow_pow[n-1] * pow_pow[n-1] % MOD;
        }

        long[] A = new long[N+1];
        for (int n = 1; n <= N; n++) {
            A[n] = (B[n][1] * (pow_2[n] + pow_2[n-1] * n) % MOD) * pow_pow[N-n] % MOD;
        }

        long[] fact = new long[N+1];
        fact[0] = 1;
        for (int n = 1; n <= N; n++) {
            fact[n] = fact[n-1] * n % MOD;
        }

        long[] fact_inv = new long[N+1];
        fact_inv[N] = pow(fact[N], MOD-2, MOD);
        for (int n = N-1; n >= 0; n--) {
            fact_inv[n] = fact_inv[n+1] * (n+1) % MOD;
        }

        long[] comb = new long[N+1];
        for (int n = 0; n <= N; n++) {
            comb[n] = fact_inv[n] * fact_inv[N-n] % MOD * fact[N] % MOD;
        }

        A[0] = 0;
        for (int n = 2; n <= N; n++) {
            A[0] = (A[0] + A[n]) % MOD;
        }
        A[0] = (A[0] * 2 - B[N][1]) % MOD;
        A[0] = (A[0] * comb[N]) % MOD;
        A[0] = (pow(2, pow(2, N, MOD-1), MOD) - A[0] + MOD) % MOD;

        System.out.println(A[0]);
    }

    public static long pow(long a, long b, long mod) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = result * a % mod;
            }
            a = a * a % mod;
            b /= 2;
        }
        return result;
    }
}