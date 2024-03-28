import java.util.*;

public class p03849 {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[61][3];
        Arrays.fill(dp[60], 1);
        for (int i = 59; i >= 0; i--) {
            if ((n >> i) & 1 == 1) {
                dp[i][0] += dp[i + 1][0];
                dp[i][1] += dp[i + 1][0] + dp[i + 1][1];
                dp[i][2] += 2 * dp[i + 1][1] + 3 * dp[i + 1][2];
            } else {
                dp[i][0] += dp[i + 1][0] + dp[i + 1][1];
                dp[i][1] += dp[i + 1][1];
                dp[i][2] += dp[i + 1][1] + 3 * dp[i + 1][2];
            }
            for (int j = 0; j < 3; j++) {
                dp[i][j] %= MOD;
            }
        }
        System.out.println(Arrays.stream(dp[0]).sum() % MOD);
    }
}