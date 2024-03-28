import java.util.*;
import java.io.*;

public class p04004 {
    static long mod = 1000000007;
    static long[] fact, fact_inv, power2, power2_inv, power3, power3_inv;
    static int N, M, K;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        K = Integer.parseInt(s[2]);

        fact = new long[1000001];
        fact_inv = new long[1000001];
        power2 = new long[1000001];
        power2_inv = new long[1000001];
        power3 = new long[1000001];
        power3_inv = new long[1000001];

        fact[0] = fact_inv[0] = power2[0] = power2_inv[0] = power3[0] = power3_inv[0] = 1;
        for (int i = 1; i <= 1000000; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            fact_inv[i] = (fact_inv[i - 1] * (mod - mod / i)) % mod;
            power2[i] = (power2[i - 1] * 2) % mod;
            power2_inv[i] = (power2_inv[i - 1] * (mod - mod / 2)) % mod;
            power3[i] = (power3[i - 1] * 3) % mod;
            power3_inv[i] = (power3_inv[i - 1] * (mod - mod / 3)) % mod;
        }

        long[] x = new long[N + M];
        x[1] = power3_inv[K + 1];
        for (int i = 2; i <= N + M; i++) {
            x[i] = (x[i - 1] * power3_inv[i - 1]) % mod;
        }
        for (int i = 1; i <= N + M - 1; i++) {
            x[i] = (x[i] * power2[i - 1]) % mod;
        }
        for (int i = 1; i <= N + M - 1; i++) {
            x[i] = (x[i] * power3[i + K]) % mod;
        }
        for (int i = 1; i <= N + M - 1; i++) {
            x[i] = (x[i] * fact[i + K]) % mod;
        }
        for (int i = 1; i <= N + M - 1; i++) {
            x[i] = (x[i] * fact_inv[i]) % mod;
        }
        for (int i = 1; i <= N + M - 1; i++) {
            x[i] = (x[i] * fact_inv[i + K]) % mod;
        }
        for (int i = 1; i <= N + M - 1; i++) {
            x[i] = (x[i] * power2_inv[i]) % mod;
        }
        x[0] = (3 * power3_inv[K + 1] * power2_inv[1]) % mod;
        for (int i = 1; i <= N + M - 1; i++) {
            x[i] = (x[i] * power3[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power2_inv[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power3_inv[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * fact[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * fact_inv[i]) % mod;
        }
        long[] coef = new long[M + 1];
        coef[0] = fact[N - 1] * fact_inv[M + 1] % mod;
        for (int i = 1; i <= M; i++) {
            coef[i] = (coef[i - 1] * fact_inv[i]) % mod;
        }
        for (int i = 1; i <= M; i++) {
            coef[i] = (coef[i] * power3[K + i - 1]) % mod;
        }
        coef[M] = (coef[M] * fact_inv[N - 1]) % mod;
        long ans = 0;
        for (int i = 0; i <= M; i++) {