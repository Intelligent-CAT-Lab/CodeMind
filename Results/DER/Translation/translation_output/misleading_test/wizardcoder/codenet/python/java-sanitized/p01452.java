import java.util.*;
import java.io.*;

public class p01452 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, m, k;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            m = Integer.parseInt(br.readLine());
            k = Integer.parseInt(br.readLine());

            int[][] dp = new int[n+1][n+1];
            for (int i = 0; i <= n; i++) {
                Arrays.fill(dp[i], -1);
            }

            int res = 0;
            for (int i = 0; i <= k; i++) {
                for (int j = 0; j <= k; j++) {
                    if (i + j > k) continue;
                    if (dp[i][j]!= -1) continue;
                    dp[i][j] = 0;
                    for (int x = 0; x <= i; x++) {
                        for (int y = 0; y <= j; y++) {
                            if (x + y > i + j) continue;
                            dp[i][j] = (dp[i][j] + dp[x][y] * dp[i-x][j-y]) % 1000000007;
                        }
                    }
                }
            }

            res = dp[k][k];
            bw.write(res + "\n");
        }

        bw.close();
        br.close();
    }
}