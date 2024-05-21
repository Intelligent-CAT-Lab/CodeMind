import java.io.*;
import java.util.*;

public class p02339 {
    static int MOD = 100000007;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long[][] dp = new long[n+1][k+1];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i+1][j+1] = (dp[i][j] + (j+1)*dp[i][j+1]) % MOD;
            }
        }
        out.println(dp[n][k]);
        out.close();
    }
}