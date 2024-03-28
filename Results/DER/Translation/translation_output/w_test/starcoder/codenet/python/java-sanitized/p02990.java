import java.util.*;
import java.math.*;

public class p02990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        long[][] dp = new long[N+1][K+1];
        for(int i=1;i<=N;i++) {
            dp[i][0] = 1;
        }
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=K;j++) {
                if(j > i) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = (dp[i-1][j] + dp[i-1][j-1]) % MOD;
                }
            }
        }
        for(int i=1;i<=K;i++) {
            System.out.println(dp[N][i]);
        }
    }
}