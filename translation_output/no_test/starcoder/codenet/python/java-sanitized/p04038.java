import java.util.*;
import java.io.*;

public class p04038 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        if (K == 1) {
            System.out.println(1);
            return;
        }
        int MOD = 1000000007;
        int U = (N + 10) * (K + 10);
        int[] fact = new int[U + 1];
        int[] fact_inv = new int[U + 1];
        fact[0] = fact_inv[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            fact_inv[i] = pow(fact[i], MOD - 2, MOD);
        }
        int[] dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int n = 2; n <= N; n++) {
            int[] prev = dp;
            dp = new int[n + 1];
            int S = 0;
            for (int i = 1; i <= n; i++) {
                S = (S + prev[i - 1]) % MOD;
                dp[i] = S;
            }
            for (int i = n + 1; i <= 2 * n; i++) {
                S = (S - prev[i - 1]) % MOD;
                dp[i] = S;
            }
            int[] coef = new int[n * K];
            for (int i = 0; i < n * K; i++) {
                coef[i] = fact[n * K - 1 - i] * fact_inv[K - 2] * fact_inv[n * K - 1 - i + K - 2] % MOD;
            }
            for (int i = 1; i <= 2 * n; i++) {
                dp[i] = (dp[i] * coef[i - 1]) % MOD;
            }
        }
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            answer = (answer + dp[i]) % MOD;
        }
        answer = (answer * fact[N]) % MOD;
        System.out.println(answer);
    }

    public static int pow(int a, int b, int mod) {
        int ans = 1;
        while (b > 0) {
            if ((b & 1) == 1