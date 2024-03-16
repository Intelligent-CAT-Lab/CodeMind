import java.io.*;
import java.util.*;

public class p03914 {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        long[][] dp = new long[N + 1][N];
        dp[1][0] = 1;
        
        for (int i = 0; i < M; i++) {
            long[][] dpNew = new long[N + 1][N];
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k < N; k++) {
                    dpNew[j][k] = (dpNew[j][k] + dp[j][k] * k) % MOD;
                    if (k + 1 < N) {
                        dpNew[j][k + 1] = (dpNew[j][k + 1] + dp[j][k] * (N - j - k)) % MOD;
                    }
                    if (j + k <= N) {
                        dpNew[j + k][0] = (dpNew[j + k][0] + dp[j][k] * j) % MOD;
                    }
                }
            }
            dp = dpNew;
        }
        
        System.out.println(dp[N][0]);
    }
}