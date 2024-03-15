import java.util.*;

public class p02974 {
    final static int INF = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][][] dp = new int[n + 1][k + 2 * (n + 1)][];
        Arrays.fill(dp[0], new int[k + 2 * (n + 1)]);
        Arrays.fill(dp[0][0], 1);
        for (int i = 1; i <= n; i++) {
            Arrays.fill(dp[i], new int[k + 2 * (n + 1)]);
            for (int j = 1; j <= i; j++) {
                for (int l = 1; l <= k + 2 * (j + 1); l++) {
                    dp[i][j][l] += dp[i - 1][j - 1][l - (j - 1) * 2];
                    dp[i][j][l] %= INF;
                    dp[i][j][l] += dp[i - 1][j][l - 2 * j];
                    dp[i][j][l] %= INF;
                    if (j != 0) {
                        dp[i][j - 1][l + (j - 1) * 2] += dp[i - 1][j][l] * j * j;
                        dp[i][j - 1][l + (j - 1) * 2] %= INF;
                    }
                }
            }
        }
        System.out.println(dp[n][0][k] % INF);
    }
}