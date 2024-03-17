import java.util.*;

public class p04038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = (int) (1e9 + 7);
        int U = (N + 10) * (K + 10);
        long fact = 1;
        long fact_inv = 1;
        for (int i = 2; i <= U; i++) {
            fact *= i;
            fact_inv *= (U - i + 1);
            fact %= MOD;
            fact_inv %= MOD;
        }
        long[] dp = new long[N + 1];
        Arrays.fill(dp, 0, 2, 1);
        for (int i = 2; i <= N; i++) {
            long[] prev = dp.clone();
            Arrays.fill(dp, 0, i + 1, 0);
            for (int j = 1; j <= i; j++) {
                dp[j] = prev[j - 1] + prev[j - 1] * prev[j - 2] + prev[j - 1] * prev[j - 2] * prev[j - 3] + ... + prev[j - 1] * prev[j - 2] * prev[j - 3] * prev[j - 4];
                dp[j] %= MOD;
            }
            long S = prev.sum();
            S %= MOD;
            dp[1] = S;
            for (int j = 2; j <= i; j++) {
                dp[j] = S - prev[j - 1];
                dp[j] %= MOD;
            }
            long coef = fact[(i - 1) * (K - 1) + 1] * fact_inv[K - 2];
            coef *= fact_inv[(i - 1) * (K - 1) + 1];
            coef %= MOD;
            dp[1] *= coef;
            for (int j = 2; j <= i; j++) {
                dp[j] *= coef;
                dp[j] %= MOD;
            }
        }
        long answer = dp[N];
        answer *= fact[N];
        answer %= MOD;
        System.out.println(answer);
    }
}