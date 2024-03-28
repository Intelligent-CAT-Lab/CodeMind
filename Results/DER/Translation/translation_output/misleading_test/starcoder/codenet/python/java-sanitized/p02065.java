import java.util.*;
import java.io.*;

public class p02065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = (int)1e9 + 7;
        int[][] dp = new int[2*N][2*N];
        for (int i = 0; i < 2*N; i++) {
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = 1;
        for (int i = 0; i < 2*N-1; i++) {
            for (int j = 0; j < 2*N; j++) {
                if (dp[i][j] == -1) continue;
                if (j < N) {
                    if (i+1 - j <= K) {
                        dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j]) % mod;
                    }
                } else {
                    if (i+1 - j <= K) {
                        dp[i+1][j-1] = (dp[i+1][j-1] + dp[i][j]) % mod;
                    }
                }
            }
        }
        int res = 0;
        for (int i = 0; i < 2*N; i++) {
            res = (res + dp[2*N-1][i]) % mod;
        }
        System.out.println(res);
    }
}