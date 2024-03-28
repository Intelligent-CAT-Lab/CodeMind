import java.util.*;
import java.math.*;

public class p02335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int MOD = (int) Math.pow(10,9)+7;
        int[][] dp = new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                dp[i][j] = (dp[i-1][j] + dp[i][j-1])%MOD;
            }
        }
        System.out.println(dp[n][k]);
    }
}