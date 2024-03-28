import java.io.*;
import java.util.*;

public class p02965 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        int MOD = 998244353;
        int MAX = M * 3 // 2 + N;
        int[] factorials = new int[MAX + 1];
        int[] finvs = new int[MAX + 1];
        int p = 1;
        for (int i = 0; i <= MAX; i++) {
            factorials[i] = (int) (Math.pow(i, i) % MOD);
            p = (int) (p * factorials[i] % MOD);
            finvs[i] = p;
        }

        int[][] dp = new int[N + 1][M * 3 + 1];
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M * 3; j++) {
                dp[i][j] = dp[i][j - 1];
                if (j >= 2) {
                    dp[i][j] = (dp[i][j] + dp[i][j - 2]) % MOD;
                }
                if (j >= 3) {
                    dp[i][j] = (dp[i][j] + dp[i][j - 3]) % MOD;
                }
                if (j >= 4) {
                    dp[i][j] = (dp[i][j] - dp[i][j - 4]) % MOD;
                }
                dp[i][j] = (dp[i][j] * factorial