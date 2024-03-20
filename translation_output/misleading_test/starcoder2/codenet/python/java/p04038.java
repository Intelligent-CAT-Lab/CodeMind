

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        if (K == 1) {
            System.out.println(1);
            return;
        }
        int MOD = 1000000007;
        int[] fact = new int[N * K + 10];
        int[] fact_inv = new int[N * K + 10];
        fact[0] = 1;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = (int) ((long) fact[i - 1] * i % MOD);
        }
        fact_inv[fact.length - 1] = pow(fact[fact.length - 1], MOD - 2, MOD);
        for (int i = fact.length - 2; i >= 0; i--) {
            fact_inv[i] = (int) ((long) fact_inv[i + 1] * (i + 1) % MOD);
        }
        int[] dp = new int[N + 1];
        dp[1] = 1;
        for (int n = 2; n <= N; n++) {
            int[] prev = dp;
            dp = new int[n + 1];
            int S = 0;
            for (int i = 0; i < n; i++) {
                S = (S + prev[i]) % MOD;
            }
            for (int i = 1; i < n; i++) {
                dp[i] = (S - prev[i - 1] + MOD) % MOD;
            }
            int[] coef = new int[K];
            for (int i = 0; i < K; i++) {
                coef[i] = (int) ((long) fact[n * (K - 1) - 1 - i] * fact_inv[K - 2] % MOD * fact_inv[(n - 1) * (K - 1) + i] % MOD);
            }
            for (int i = 0; i < n; i++) {
                dp[i + 1] = (int) ((long) dp[i + 1] * coef[i] % MOD);
            }
        }
        int answer = 0;
        for (int i = 0; i <= N; i++) {
            answer = (answer + dp[i]) % MOD;
       
