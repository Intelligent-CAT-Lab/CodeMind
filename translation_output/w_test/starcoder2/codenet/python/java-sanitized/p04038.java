import java.util.*;
import java.io.*;

public class p04038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        if (K == 1) {
            System.out.println(1);
            return;
        }
        int MOD = 1000000007;
        long[] fact = new long[N * K + 10];
        long[] fact_inv = new long[N * K + 10];
        fact[0] = 1;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        fact_inv[fact.length - 1] = pow(fact[fact.length - 1], MOD - 2, MOD);
        for (int i = fact.length - 2; i >= 0; i--) {
            fact_inv[i] = fact_inv[i + 1] * (i + 1) % MOD;
        }
        long[] dp = new long[N + 1];
        dp[0] = 1;
        for (int n = 1; n <= N; n++) {
            long[] prev = dp;
            dp = new long[n + 1];
            long S = 0;
            for (int i = 0; i < n; i++) {
                S += prev[i];
                S %= MOD;
            }
            for (int i = 1; i < n; i++) {
                dp[i] = (dp[i - 1] + S - prev[i - 1]) % MOD;
            }
            dp[n] = S;
            long[] coef = new long[K];
            for (int i = 0; i < K; i++) {
                coef[i] = fact[n * (K - 1) - i] * fact_inv[K - 2] % MOD * fact_inv[(n - 1) * (K - 1) + i] % MOD;
            }
            for (int i = 0; i <= n; i++) {
                dp[i] = dp[i] * coef[i] % MOD;
            }
        }
        long answer = 0;
        for (int i = 0; i <= N; i++) {
            answer += dp[i];
            answer %= MOD;
        }
        answer = answer * fact[N] % MOD;
        System.out.println(answer