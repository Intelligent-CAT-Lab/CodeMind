import java.util.*;
import java.io.*;

public class p03820 {
    static final long MOD = 1_000_000_007;
    static long[][] C, dp;
    static int N, K;

    static void init() {
        C = new long[2010][2010];
        dp = new long[2010][2010];
        C[0][0] = 1;
        for (int n = 1; n < 2010; n++) {
            C[n][0] = C[n - 1][0];
            for (int m = 1; m <= n; m++) {
                C[n][m] = (C[n - 1][m] + C[n - 1][m - 1]) % MOD;
            }
        }
        dp[0][0] = 1;
        for (int n = 1; n < 2010; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m < 2010; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = 2009; n > 0; n--) {
            dp[n] = (dp[n] - dp[n - 1] + MOD) % MOD;
        }
    }

    static long solve() {
        long ans = 0;
        if (K == N - 1) {
            for (int i = 0; i < N; i++) {
                ans = (ans + dp[i][N - 1]) % MOD;
            }
            return ans;
        }
        for (int r = N - K + 1; r <= N; r++) {
            long x = C[r - 2][N - K - 2];
            int a = N - r;
            int b = K - a;
            if (b == 0) {
                x = x * (dp[a][a]) % MOD;
            } else {
                long[] tmp = new long[b + 1];
                for (int i = 0; i <= b; i++) {
                    tmp[i] = dp[i + 1][a + i];
                }
                for (int i = 0; i < b; i++) {
                    x = x * tmp[b - i - 1] % MOD;
                }
            }
            ans = (ans + x) % MOD;
        }
        for (int i = 0; i < N - K - 2; i++) {
            ans = ans * 2 % MOD;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        init();
        System.out.println(solve());
    }
}