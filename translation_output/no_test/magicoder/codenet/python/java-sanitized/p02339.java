import java.util.*;
import java.io.*;

public class p02339 {
    static final long MOD = 1000000007;
    static int N, K;
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        dp = new long[N + 1][K + 1];
        dp[0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                dp[i + 1][j + 1] = dp[i][j] + (j + 1) * dp[i][j + 1];
                dp[i + 1][j + 1] %= MOD;
            }
        }

        System.out.println(dp[N][K]);
    }
}