import java.util.*;
import java.io.*;

public class p03914 {
    static final int mod = 1000000007;
    static final double eps = 1e-9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[][] dp = new long[N+1][N];
        dp[1][0] = 1;
        for (int i = 0; i < M; i++) {
            long[][] dp_new = new long[N+1][N];
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k < N; k++) {
                    dp_new[j][k] = (dp_new[j][k] + dp[j][k] * k) % mod;
                    if (k+1 < N) {
                        dp_new[j][k+1] = (dp_new[j][k+1] + dp[j][k] * (N - j - k)) % mod;
                    }
                    if (j+k <= N) {
                        dp_new[j+k][0] = (dp_new[j+k][0] + dp[j][k] * j) % mod;
                    }
                }
            }
            dp = dp_new;
        }
        System.out.println(dp[N][0]);
    }
}