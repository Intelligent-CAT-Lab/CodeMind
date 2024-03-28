import java.util.*;

public class p03849 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int MOD = 1000000007;
        int[][] dp = new int[61][3];
        dp[60][0] = 1;
        for (int i = 59; i >= 0; i--) {
            if ((n >> i) & 1 == 1) {
                dp[i][0] = (dp[i][0] + dp[i + 1][0]) % MOD;
                dp[i][1] = (dp[i][1] + dp[i + 1][0] + dp[i + 1][1]) % MOD;
                dp[i][2] = (dp[i][2] + 2 * dp[i + 1][1] + 3 * dp[i + 1][2]) % MOD;
            } else {
                dp[i][0] = (dp[i][0] + dp[i + 1][0] + dp[i + 1][1]) % MOD;
                dp[i][1] = (dp[i][1] + dp[i + 1][1]) % MOD;
                dp[i][2] = (dp[i][2] + dp[i + 1][1] + 3 * dp[i + 1][2]) % MOD;
            }
        }
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            ans = (ans + dp[0][i]) % MOD;
        }
        System.out.println(ans);
    }
}