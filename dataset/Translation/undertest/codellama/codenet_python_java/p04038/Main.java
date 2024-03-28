import java.util.Scanner;
import java.util.Arrays;

public class p04038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        if (K == 1) {
            System.out.println(1);
            return;
        }

        int[] fact = new int[N + 10];
        int[] fact_inv = new int[N + 10];
        makeFact(N + 10, fact, fact_inv);

        int[] dp = new int[N + 1];
        dp[0] = 1;
        for (int n = 1; n <= N; n++) {
            int[] prev = dp;
            dp = new int[n + 1];
            dp[0] = 1;
            for (int i = 1; i <= n; i++) {
                dp[i] = (prev[i - 1] + prev[i] + prev[i + 1]) % MOD;
            }
            int S = Arrays.stream(prev).sum() % MOD;
            for (int i = 1; i <= n; i++) {
                dp[i] = (S - prev[i - 1]) % MOD;
            }
            int[] coef = new int[K - 1];
            for (int i = 0; i < K - 1; i++) {
                coef[i] = fact[n * (K - 1) - 1 - i] % MOD;
            }
            for (int i = 0; i < K - 2; i++) {
                coef[i] *= fact_inv[K - 2 - i] % MOD;
            }
            for (int i = 0; i < n; i++) {
                dp[i] *= coef[i] % MOD;
            }
        }

        int answer = Arrays.stream(dp).sum() % MOD;
        answer *= fact[N] % MOD;
        System.out.println(answer);
    }

    private static void makeFact(int N, int[] fact, int[] fact_inv) {
        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        fact_inv[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact_inv[i] = (fact_inv[i - 1] * i)