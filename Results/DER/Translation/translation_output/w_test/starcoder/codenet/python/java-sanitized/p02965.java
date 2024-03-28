import java.util.Scanner;

public class p02965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] factorials = new int[m * 3 / 2 + n + 1];
        int[] finvs = new int[m * 3 / 2 + n + 1];
        factorials[0] = 1;
        finvs[0] = 1;
        for (int i = 1; i < factorials.length; i++) {
            factorials[i] = factorials[i - 1] * i % 998244353;
            finvs[i] = finvs[i - 1] * i % 998244353;
        }
        int MOD = 998244353;
        int p = 1;
        for (int i = 0; i < finvs.length; i++) {
            p = p * finvs[i] % MOD;
            finvs[i] = p;
        }

        int[][] dp = new int[n + 1][m * 3 / 2 + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= m * 3 / 2; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m * 3 / 2; j++) {
                if (j - i >= 0) {
                    dp[i][j] = (dp[i - 1][j - i] + dp[i - 1][j]) % MOD;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int ans = 0;
        for (int