import java.util.*;
import java.io.*;

public class p01995 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        char[] arr = s.toCharArray();
        int[] alpha = new int[26];
        for (int i = 0; i < n; i++) {
            alpha[arr[i] - 'a']++;
        }
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = dp[i][j - 1];
                for (int k = i; k < j; k++) {
                    if (arr[k] == arr[j]) {
                        dp[i][j] = (dp[i][j] + dp[i][k]) % 100000007;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                ans = (ans + dp[i][j]) % 100000007;
            }
        }
        System.out.println(ans);
    }
}