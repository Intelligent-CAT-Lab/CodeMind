import java.util.*;
import java.io.*;

public class p02826 {
    static int N, MOD;
    static long[] fact, fact_inv, inv;
    static long[] f, g;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        MOD = Integer.parseInt(str[1]);
        fact = new long[100000];
        fact_inv = new long[100000];
        inv = new long[100000];
        fact[0] = fact_inv[0] = inv[0] = 1;
        for (int i = 1; i < 100000; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            fact_inv[i] = fact_inv[MOD % i] * pow(MOD - 2, MOD / i) % MOD;
            inv[i] = pow(fact[i], MOD - 2, MOD);
        }
        f = new long[N + N + 10];
        for (int x = 1; x <= N / 2; x++) {
            for (int i = x; i < N + N; i += x) {
                f[i] += 2 * inv[1 + (i - x) / x];
            }
        }
        if (N % 2 == 1) {
            for (int i = (N + 1) / 2; i < N + N; i += (N + 1) / 2) {
                f[i] += inv[1 + (i - (N + 1) / 2) / ((N + 1) / 2)];
            }
        }
        g = new long[N + N + 10];
        g[0] = 1;
        for (int i = 1; i < N + N; i++) {
            g[i] = g[i - 1] * fact[i - 1] % MOD;
        }
        g = fps_exp(f);
        System.out.println(g[N]);
    }
    static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) ==