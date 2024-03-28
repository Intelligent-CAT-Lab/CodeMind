import java.util.*;

public class p04038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        if (K == 1) {
            System.out.println(1);
            return;
        }

        int[][] fact = new int[N + 1][N + 1];
        int[] fact_inv = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            fact[i][i] = 1;
        }

        for (int i = 1; i <= N; i++) {
            fact[i][i] *= fact[i - 1][i - 1];
            fact[i][i] %= MOD;
        }

        for (int i = 1; i <= N; i++) {
            fact[i][0] = fact[i - 1][i - 1];
            fact[i][0] %= MOD;
        }

        for (int i = 1; i <= N; i++) {
            fact[i][N] *= fact[i - 1][N - 1];
            fact[i][N] %= MOD;
        }

        for (int i = 1; i <= N; i++) {
            fact[i][N - i] *= fact[i][N];
            fact[i][N - i] %= MOD;
        }

        int[] dp = new int[N + 1];
        Arrays.fill(dp, 0);

        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            int prev = dp[i - 1];
            dp[i] = 0;

            for (int j = 1; j <= K; j++) {
                dp[i] += prev[i - 1][j - 1];
                dp[i] %= MOD;
            }

            for (int j = 1; j <= K; j++) {
                dp[i] += prev[i - 1][j];
                dp[i] %= MOD;
            }

            dp[i] += prev[i - 1][K];
            dp[i] %= MOD;
        }

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            answer += fact[N][i - 1];
            answer %= MOD;
        }

        answer *= fact[N];
        answer %= MOD;

        System.out.println(answer);
    }
}