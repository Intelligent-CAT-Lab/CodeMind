import java.util.*;
import java.io.*;

public class p03581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mod = 1000000007;
        int[][] dp = new int[2001][2001];
        dp[0][0] = 1;
        for (int i = 1; i < 2001; i++) {
            for (int j = 0; j < i; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i - 1][j + 1]) % mod;
            }
        }
        int[][] dp2 = new int[2001][2001];
        dp2[0][0] = 1;
        for (int i = 1; i < 2001; i++) {
            for (int j = 0; j < i; j++) {
                dp2[i][j] = (dp2[i - 1][j] + dp2[i - 1][j + 1]) % mod;
            }
        }
        int ans = 0;
        for (int i = 0; i <= a; i++) {
            ans = (ans + dp[b][i] * dp2[a - i][0]) % mod;
        }
        System.out.println(ans);
    }
}