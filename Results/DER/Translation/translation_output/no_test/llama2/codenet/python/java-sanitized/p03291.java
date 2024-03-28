import java.io.*;
import java.util.*;

public class p03291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        int[][] dp = new int[n+1][4];
        int num = 1000000007;
        dp[0][0] = 1;
        String[] string = {"A","B","C"};
        for (int i = 0; i < n; i++) {
            int m = 0;
            int b = 1;
            if (s.charAt(i) == '?') {
                b = 3;
            }
            if (i == 0) {
                if (s.charAt(i) == '?') {
                    dp[i+1][0] = (dp[i][0] * 3) % num;
                } else {
                    dp[i+1][0] = (dp[i][0]) % num;
                }
                continue;
            }
            if (s.charAt(i) == string[0] || s.charAt(i) == '?') {
                m = 1;
            }
            dp[i+1][0] = (m * dp[i][0] + b * dp[i][1]) % num;
            dp[i+1][1] = (m * dp[i][1] + b * dp[i][2]) % num;
            dp[i+1][2] = (m * dp[i][2] + b * dp[i][3]) % num;
            dp[i+1][3] = (m * dp[i][3] + b * dp[i][0]) % num;
        }
        System.out.println(dp[n][3]);
    }
}