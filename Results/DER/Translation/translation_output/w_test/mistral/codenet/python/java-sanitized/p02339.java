import java.util.*;

public class p02339 {
    static int n, k;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        dp = new int[n + 1][k + 1];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i + 1][j + 1] = dp[i][j] + (j + 1) * dp[i][j + 1];
                dp[i + 1][j + 1] %= 1000000007;
            }
        }

        System.out.println(dp[n][k]);
    }
}