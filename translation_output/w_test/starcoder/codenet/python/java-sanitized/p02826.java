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
        int inv = pow(fact[U], MOD - 2, MOD);
        int[] f = new int[N + N + 10];
        for (int x = 1; x <= N / 2; x++) {
            for (int i = x; i < N; i += x) {
                f[i] += 2 * inv;
            }
        }
        if (N % 2 == 1) {
            for (int i = (N + 1) / 2; i < N; i += x) {
                f[i] += inv;
            }
        }
        int[] g = new int[N + 1];
        g[0] = 1;
        for (int i = 1; i <= N; i++) {
            g[i] = g[i - 1] * fact[i - 1] % MOD;
            g[i] = g[i] * fact_inv[i] % MOD;
        }
        for (int i = 0; i < N; i++) {
            g[i] = g[i] * f[i] % MOD;
        }
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += g[i];
            answer %= MOD;
        }
        System.out.println(answer);
    }

    public static int pow(int a, int b, int MOD