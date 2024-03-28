import java.util.*;
import java.io.*;

public class p02337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] dp = new int[n+1][k+1];
        for(int i = 1; i <= n; i++) {
            dp[i][1] = 1;
            dp[i][i] = 1;
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 2; j <= k; j++) {
                dp[i][j] = (dp[i-1][j-1] + j * dp[i-1][j]) % 1000000007;
            }
        }
        int ans = 0;
        for(int i = 0; i <= k; i++) {
            ans = (ans + dp[n][i]) % 1000000007;
        }
        System.out.println(ans);
    }
}