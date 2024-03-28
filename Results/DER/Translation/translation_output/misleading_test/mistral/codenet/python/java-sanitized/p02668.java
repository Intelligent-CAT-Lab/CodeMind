import java.util.*;

public class p02668 {
    final static int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        while (sc.hasNextInt()) {
            N = sc.nextInt();
            M = sc.nextInt();
            if (N == 0 || M == 0)
                continue;
            int[][] dp = new int[N + 1][M + 1];
            Arrays.fill(dp, 0);
            dp[1][0] = 1;
            for (int i = 2; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
                }
            }
            int ans = 0;
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    ans = (ans + dp[i][j] * (1 << j)) % MOD;
                }
            }
            System.out.println(ans);
        }
    }
}