import java.util.*;

public class p02065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = sc.nextInt();
        int[][] dp = new int[2*N][];
        for (int i = 0; i < 2*N; i++) {
            dp[i] = new int[2*N];
        }
        dp[0][0] = 1;
        for (int i = 0; i < 2*N-1; i++) {
            for (int j = 0; j < 2*N; j++) {
                if (dp[i][j] == 0) {
                    continue;
                }
                if (j == 0) {
                    if (i+1 - j <= K) {
                        dp[i+1][i+1] = (dp[i+1][i+1] + dp[i][j]) % mod;
                    }
                } else {
                    if (i+1 - j <= K) {
                        dp[i+1][i+1] = (dp[i+1][i+1] + dp[i][j]) % mod;
                    }
                    if (i+1 - dp[i][j] <= K) {
                        dp[i+1][dp[i][j]] = (dp[i+1][dp[i][j]] + dp[i][j]) % mod;
                    }
                }
            }
        }
        int res = 0;
        for (int i = 0; i < 2*N; i++) {
            if (dp[2*N-1][i] == 1) {
                res = (res + dp[2*N-1][i]) % mod;
            }
        }
        System.out.println(res);
    }
}