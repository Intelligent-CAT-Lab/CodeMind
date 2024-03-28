import java.util.*;
import java.io.*;

public class p04038 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);
        if (K == 1) {
            System.out.println(1);
            return;
        }
        int MOD = 1000000007;
        int U = (N + 10) * (K + 10);
        int[] fact = new int[U];
        int[] fact_inv = new int[U];
        fact[0] = fact_inv[0] = 1;
        for (int i = 1; i < U; i++) {
            fact[i] = (int) ((long) fact[i - 1] * i % MOD);
            fact_inv[i] = (int) ((long) fact_inv[i - 1] * fact[i] % MOD);
        }
        int[] dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int n = 2; n <= N; n++) {
            int[] prev = dp;
            dp = new int[n + 1];
            int S = 0;
            for (int i = 0; i < n; i++) {
                S += prev[i];
                S %= MOD;
            }
            dp[1] = S;
            for (int i = 2; i <= n; i++) {
                dp[i] = S - prev[i - 1];
                dp[i] %= MOD;
            }
            int[] coef = new int[n * K];
            for (int i = 0; i < n * K; i++) {
                coef[i] = fact[i];
            }
            for (int i = 0; i < n * K; i++) {
                coef[i] = (int) ((long) coef[i] * fact_inv[n * K - 1 - i] % MOD);
            }
            for (int i = 0; i < n * K; i++) {
                coef[i] = (int) ((long) coef[i] * fact_inv[K - 2] % MOD);
            }
            for (int i = 0; i < n * K; i++) {
                coef[i] = (int) ((long) coef[i] * fact_inv[(n - 1) * K - 1 + i] % MOD);
            }
            for (