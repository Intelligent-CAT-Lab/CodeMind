import java.util.*;
import java.io.*;

public class p02826 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int MOD = Integer.parseInt(str[1]);
        int U = 100000;
        int[] fact = new int[U + 1];
        int[] fact_inv = new int[U + 1];
        fact[0] = fact_inv[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            fact_inv[i] = fact_inv[i - 1] * inv(i, MOD) % MOD;
        }
        int[] inv = new int[U + 1];
        inv[1] = 1;
        for (int i = 2; i <= U; i++) {
            inv[i] = inv[MOD % i] * (MOD - MOD / i) % MOD;
        }
        int[] f = new int[U + 10];
        for (int i = 1; i <= U; i++) {
            f[i] = 2 * inv[1 + (U - 1) / i];
        }
        if (U & 1) {
            f[U / 2 + 1] = inv[1 + (U - 1) / (U / 2 + 1)];
        }
        int[] g = new int[U + 10];
        for (int i = 0; i < U; i++) {
            g[i] = 0;
        }
        for (int i = 0; i < U; i++) {
            for (int j = 0; j < U; j++) {
                g[i + j] += f[i] * fact[j] % MOD;
                g[i + j] %= MOD;
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += g[i];
            ans %= MOD;
        }
        System.out.println(ans);