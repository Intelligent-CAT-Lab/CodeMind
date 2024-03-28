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
            p = (int) (p * i % MOD);
            finvs[i] = p;
        }

        int[][] dp = new int[N + 1][M * 3 + 1];
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= M * 3; i++) {
            for (int j = 1; j <= N; j++) {
                dp[j][i] = (dp[j][i - 1] + dp[j - 1][i - 1]) % MOD;
            }
        }

        int ans = 0;
        for (int i = 1; i <= M * 3 // 2 + N; i++) {
            int cnt = 0;
            for (int j = 1; j <= N; j++) {
                cnt += dp[j][i];
                cnt %= MOD;
            }
            ans = (ans + cnt * finvs[i]) % MOD;
        }
        System.out.println(ans);
    }
}