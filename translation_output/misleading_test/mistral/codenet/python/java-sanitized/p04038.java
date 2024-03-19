import java.util.*;

public class p04038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;
        int U = (N + 10) * (K + 10);
        long fact = 1;
        long fact_inv = 1;
        for (int i = 2; i <= U; i++) {
            fact *= i;
            fact_inv *= (MOD - fact) % MOD;
        }
        long[] dp = new long[N + 1];
        Arrays.fill(dp, 0, 2, 1);
        for (int i = 2; i <= N; i++) {
            long prev = dp[i - 1];
            Arrays.fill(dp, i, N + 1, 0);
            long S = prev.sum() % MOD;
            Arrays.cumsum(prev, prev);
            prev %= MOD;
            dp[1] = S;
            for (int j = 2; j <= i; j++) {
                dp[j] = S - prev[j - 1];
            }
            long coef = fact[(i - 1) * (K - 1) + 1];
            coef *= fact_inv[K - 2];
            coef *= fact_inv[(i - 1) * (K - 1) + 1];
            coef %= MOD;
            dp[i] *= coef;
            dp[i] %= MOD;
        }
        long answer = dp[N];
        answer *= fact[N];
        answer %= MOD;
        System.out.println(answer);
    }
}