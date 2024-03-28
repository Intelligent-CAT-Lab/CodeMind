import java.util.*;
import java.io.*;

public class p04040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mod = 1000000007;
        int[][] dp = new int[h+1][w+1];
        dp[0][0] = 1;
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j]) % mod;
            }
        }
        int ans = 0;
        for(int i = 0; i < h-a; i++) {
            for(int j = 0; j < w-b; j++) {
                ans = (ans + dp[i][j] * dp[i+a][j+b]) % mod;
            }
        }
        System.out.println(ans);
    }
}