import java.util.*;
import java.io.*;

public class p02932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();

        long MOD = 1000000007;

        long U = 6*100000 + 100;
        long[] fact = new long[U+1];
        fact[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = fact[i-1]*i % MOD;
        }
        long[] fact_inv = new long[U+1];
        fact_inv[U] = pow(fact[U],MOD-2,MOD);
        for (int i = U; i >= 0; i--) {
            fact_inv[i-1] = fact_inv[i] * i % MOD;
        }

        long comb = fact[U] * fact_inv[U] % MOD;
        for (int i = U-1; i >= M; i--) {
            comb = comb * i % MOD;
        }
        for (int i = M; i <= U; i++) {
            comb = comb * (-1) % MOD;
        }

        long[] P = new long[R+1];
        for (int i = M; i <= R; i++) {
            P[i] = P[i-1] + comb;
        }
        for (int i = M; i <= R; i++) {
            P[i] -= P[i-M];
        }
        P[M:] -= P[:-M];
        P %= MOD;

        long[] Q = new long[R+1];
        for (int i = N; i <= N+R; i++) {
            Q[i-N] = fact[i] * fact_inv[i-N] % MOD;
        }

        long f(int R) {
            long total = fact[R+N] * fact_inv[R] % MOD * fact_inv[N] % MOD;
            long x = (Q[R::-1] * P[:R+1] % MOD).sum() % MOD;
            long coef = fact[N] * fact_inv[M] % MOD * fact_inv[N-M] % MOD;
            return (total - x*coef)%MOD;
        }

        long answer = (f(R) - f(L-1))%MOD;
        System.out.println(answer);
    }

    public static long pow(long a, long b, long mod) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = ans * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return ans;
    }
}