import java.util.*;
import java.io.*;

public class p03914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] dp = new int[n+1][n+1];
        dp[1][0] = 1;
        for (int i = 0; i < m; i++) {
            int[][] dp_new = new int[n+1][n+1];
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    dp_new[j][k] = (dp_new[j][k] + dp[j][k] * k) % 1000000007;
                    if (k + 1 < n) {
                        dp_new[j][k + 1] = (dp_new[j][k + 1] + dp[j][k] * (n - j - k)) % 1000000007;
                    }
                    if (j + k <= n) {
                        dp_new[j + k][0] = (dp_new[j + k][0] + dp[j][k] * j) % 1000000007;
                    }
                }
            }
            dp = dp_new;
        }
        System.out.println(dp[n][0]);
    }
}