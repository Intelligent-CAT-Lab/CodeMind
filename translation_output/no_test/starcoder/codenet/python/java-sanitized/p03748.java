import java.util.*;

public class p03748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[][] dp = new long[2][N+1];
        dp[0][0] = 1;
        dp[1][0] = 0;
        for (int i = 0; i < M; i++) {
            long[] prev = dp[i % 2];
            dp[i % 2] = new long[N+1];
            for (int j = 0; j < N; j++) {
                dp[i % 2][j] = (prev[j] + prev[j+1]) % 1000000007;
                dp[i % 2][j+1] = (prev[j] + prev[j+1]) % 1000000007;
                dp[i % 2][j+2] = (prev[j+1] + prev[j+2]) % 1000000007;
            }
        }
        System.out.println(dp[(M-1) % 2][N-1]);
    }
}