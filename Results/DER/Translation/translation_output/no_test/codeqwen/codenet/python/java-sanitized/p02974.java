import java.util.*;

public class p02974 {
    static final int INF = (int) 1e9;
    static final int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][][] dp = new int[n + 1][n + 1][2 * (n + 1) + 1];
        dp[0][0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                for (int l = 0; l <= k; l++) {
                    dp[i + 1][j + 1][l + 2 * (j + 1)] = (dp[i + 1][j + 1][l + 2 * (j + 1)] + dp[i][j][l]) % mod;
                    dp[i + 1][j][l + 2 * j] = (dp[i + 1][j][l + 2 * j] + dp[i][j][l] * (2 * j + 1)) % mod;
                    if (j != 0) {
                        dp[i + 1][j - 1][l + (j - 1) * 2] = (dp[i + 1][j - 1][l + (j - 1) * 2] + dp[i][j][l] * j * j) % mod;
                    }
                }
            }
        }
        System.out.println(dp[n][0][k] % mod);
    }
}