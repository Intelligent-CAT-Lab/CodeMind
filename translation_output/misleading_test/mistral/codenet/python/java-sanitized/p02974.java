import java.util.*;

public class p02974 {
    final static int INF = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][][] dp = new int[n + 1][k + 2 * (n + 1)][3];
        Arrays.fill(dp[0], Arrays.fill(dp[0][0], 1));
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int l = 1; l <= k + 2 * (j - 1); l++) {
                    dp[j][l][0] += dp[i][j - 1][l - 1];
                    dp[j][l][0] %= INF;
                    dp[j][l][1] += dp[i][j - 1][l - 1] * (j * 2 + 1);
                    dp[j][l][1] %= INF;
                    if (j != 0) {
                        dp[j][l - 1][2] += dp[i][j - 1][l - 1] * j * j;
                        dp[j][l - 1][2] %= INF;
                    }
                }
            }
        }
        System.out.println(dp[n][0][k] % INF);
    }
}