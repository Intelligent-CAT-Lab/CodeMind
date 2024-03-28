import java.util.Scanner;

public class p03375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long MOD = sc.nextLong();

        long[][] B = new long[N+1][N+1];
        B[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            B[n][1] = B[n-1][0];
            for (int l = 1; l <= N; l++) {
                B[n][l] = (B[n-1][l-1] + B[n-1][l] * l) % MOD;
            }
        }

        long[][] pow_2 = new long[N+1][N+1];
        for (int n = 1; n <= N; n++) {
            pow_2[1][n] = (2 * pow_2[1][n-1]) % MOD;
        }
        for (int n = 2; n <= N; n++) {
            for (int m = 1; m <= N; m++) {
                pow_2[n][m] = (pow_2[n-1][m] * pow_2[1][m]) % MOD;
            }
        }

        long[] pow_pow = new long[N+1];
        pow_pow[0] = 2;
        for (int n = 1; n <= N; n++) {
            pow_pow[n] = (pow_pow[n-1] * pow_pow[n-1]) % MOD;
        }

        long[] A = new long[N+1];
        for (int n = 1; n <= N; n++) {
            for (int l = 1; l <= N; l++) {
                A[n] += (B[l][n] * (pow_2[N-l+1][n] + pow_2[N-l][n-1] * l) % MOD);
                A[n] %= MOD;
            }
            A[n] = (A[n] * pow_pow[N-n]) % MOD;
        }

        long[] fact = new long[N+1];
        long[] fact_inv = new long[N+1];
        fact[0] = 1;
        fact_inv[N] = pow(fact[N], MOD-2, MOD);
        for (int n = N; n > 0; n--) {
            fact[n] = (fact[n-1] * n) % MOD;
            fact_inv[n-1] = (fact_inv[n] * n) % MOD;
        }

        long[] comb = new long[N+1];
        for (int n = 0; n <= N; n++) {
            comb[n] = (fact_inv[n] * fact_inv[N-n] % MOD * fact[N]) % MOD;
        }

        for (int n = 0; n <= N; n += 2) {
            A[n] = (A[n] * (-1)) % MOD;
        }

        long sumA = 0;
        for (int n = 0; n <= N; n++) {
            sumA += A[n];
            sumA %= MOD;
        }

        long answer = (long) (Math.pow(2, pow(2, N, MOD-1)) - sumA) % MOD;
        System.out.println(answer);

        sc.close();
    }

    public static long pow(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            exp = exp >> 1;
            base = (base * base) % mod;
        }
        return result;
    }
}