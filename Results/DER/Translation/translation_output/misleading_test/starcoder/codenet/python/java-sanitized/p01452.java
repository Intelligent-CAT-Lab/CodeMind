import java.util.*;
import java.io.*;

public class p01452 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[k+1];
        dp[0] = 1;
        for(int i = 1; i <= k; i++) {
            for(int j = 0; j <= i; j++) {
                dp[i] = (dp[i] + dp[j] * dp[i-j-1]) % 1000000007;
            }
        }
        System.out.println(dp[k]);
    }
}