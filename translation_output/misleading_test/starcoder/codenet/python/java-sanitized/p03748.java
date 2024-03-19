import java.util.*;

public class p03748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[][] dp = new long[2][N+1];
        dp[0][0] = 1;
        dp[1][0] = 0;
        for(int i = 0; i < M; i++) {
            long[] temp = new long[2];
            for(int j = 0; j < 2; j++) {
                temp[j] = dp[j][0];
            }
            for(int j = 1; j < N; j++) {
                dp[0][j] = (dp[0][j] + temp[0]) % 1000000007;
                dp[1][j] = (dp[1][j] + temp[1]) % 1000000007;
            }
            dp[0][0] = (dp[0][0] + temp[1]) % 1000000007;
            dp[1][0] = 0;
            for(int j = 1; j < N; j++) {
                dp[0][j] = (dp[0][j] + dp[0][j-1]) % 1000000007;
                dp[1][j] = (dp[1][j] + dp[1][j-1]) % 1000000007;
            }
        }
        System.out.println(dp[0][N-1]);
    }
}