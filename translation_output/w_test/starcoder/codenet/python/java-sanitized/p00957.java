import java.util.*;
import java.io.*;

public class p00957 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int k = in.nextInt();
        int[][] dp = new int[l+1][2];
        dp[0][0] = 1;
        for (int i = 1; i <= l; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-k][0];
            dp[i][1] = dp[i-1][1] + dp[i-k][1];
        }
        System.out.println(dp[l][0]);
    }
}