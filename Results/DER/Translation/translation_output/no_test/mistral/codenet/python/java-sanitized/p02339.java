import java.util.*;

public class p02339 {
    static Scanner sc = new Scanner(System.in);
    static int INF = (int) 1e9 + 7;
    static int MOD = (int) 1e9 + 7;

    static int n, k;
    static int[][] dp = new int[n + 1][k + 1];

    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();

        Arrays.fill(dp, new int[k + 1], n + 1);
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i + 1][j + 1] = dp[i][j] + (j + 1) * dp[i][j + 1];
                dp[i + 1][j + 1] %= MOD;
            }
        }

        System.out.println(dp[n][k]);
    }
}