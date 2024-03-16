import java.util.*;

public class p02668 {
    static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] dp = new int[M + 1][N + 1];
        Arrays.fill(dp, 0);

        for (int i = 1; i <= M; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= N; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                dp[j][i] = (dp[j][i - 1] + dp[j - 1][i - 1]) % MOD;
            }
        }

        int ans = dp[M][N];
        ans %= MOD;

        System.out.println(ans);
    }
}