import java.util.*;

public class p02979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();
        // limitã®æå¤§å¤ï¼limitãªãï¼
        int L = (N+1)/2+1;

        int[][] dp = new int[N+1][K+1];
        dp[0][0] = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= K; j++) {
                dp[i+1][0] = (dp[i+1][0] + dp[i][j]) % M;
                // ç´åã«Kåé£ç¶ãã¦ããã¨ãã¯è¿½å ã§ããªã
                if (j != K) {
                    dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j]) % M;
                }
            }
        }
        int ret = 0;
        for (int i = 0; i <= N; i++) {
            ret += dp[i][K];
            ret %= M;
        }
        System.out.println(ret);
    }
}