import java.util.*;
import java.io.*;

public class p03375 {
    static int MOD = 998244353;
    static int N;
    static long[][] B;
    static long[][] pow_2;
    static long[] pow_pow;
    static long[] A;
    static long[] fact;
    static long[] fact_inv;
    static long[] comb;
    static long answer;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        N = sc.nextInt();
        B = new long[N+1][N+1];
        pow_2 = new long[N+1][N+1];
        pow_pow = new long[N+1];
        A = new long[N+1];
        fact = new long[N+1];
        fact_inv = new long[N+1];
        comb = new long[N+1];
        B[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            for (int l = 1; l <= n; l++) {
                B[n][l] = B[n-1][l-1] + B[n-1][l] * (n-l) % MOD;
                B[n][l] %= MOD;
            }
        }
        pow_2[1][1] = 2;
        for (int n = 2; n <= N; n++) {
            pow_2[n][1] = pow_2[n-1][1] * 2 % MOD;
        }
        for (int l = 2; l <= N; l++) {
            for (int n = 1; n <= N; n++) {
                pow_2[n][l] = pow_2[n][l-1] * pow_2[1][l-1] % MOD;
            }
        }
        pow_pow[0] = 2;
        for (int n = 1; n <= N; n++) {
            pow_pow[n] = pow_pow[n-1] * pow_pow[n-1] % MOD;
        }
        for (int n = 1; n <= N; n++) {
            for (int l = 1; l <= n; l++) {
                A[n] += B[n][l] * (pow_2[n][l] + pow_2[n][l-1] * (n-l) % MOD) % MOD;
                A[n] %= MOD;
            }
        }
        for (int n = 1; n <= N; n++) {
            A[n] *= pow_pow[N-n] % MOD;
            A[n] %= MOD;
        }
        fact[0] = 1;
        fact_inv[N] = pow(fact[N], MOD-2, MOD);
        for (int n = 1; n <= N; n++) {
            fact[n] = fact[n-1] * n % MOD;
        }
        for (int n = N-1; n >= 0; n--) {
            fact_inv[n] = fact_inv[n+1] * (n+1) % MOD;
        }
        for (int n = 0; n <= N; n++) {
            comb[n] = fact_inv[n] * fact_inv[N-n] % MOD * fact[N] % MOD;
        }
        for (int n = 0; n <= N; n++) {
            if (n % 2 == 0) {
                A[n] *= -1;
            }
            A[n] *= comb[n];
            A[n] %= MOD;
        }
        answer = pow(2, pow(2, N, MOD-1), MOD) - A[N];
        answer %= MOD;
        System.out.println(answer);
    }

    static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int