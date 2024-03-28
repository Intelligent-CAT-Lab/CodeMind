import java.util.*;
import java.io.*;
import java.math.*;

public class p03820 {
    static final int MOD = 1_000_000_007;
    static final int U = 2010;
    static long[][] C = new long[U][U];
    static long[][] dp = new long[U][U];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        K--;
        C[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int m = 0; m < U; m++) {
                C[n][m] += C[n - 1][m];
                if (m > 0) {
                    C[n][m] += C[n - 1][m - 1];
                }
                C[n][m] %= MOD;
            }
        }
        dp[0][0] = 1;
        for (int n = 1; n < U; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m < U; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = U - 1; n > 0; n--) {
            for (int m = 0; m < U; m++) {
                dp[n][m] -= dp[n - 1][m];
                dp[n][m] %= MOD;
            }
        }
        long ans = 0;
        if (K == N - 1) {
            for (int n = 0; n < N; n++) {
                ans += dp[n][N - 1];
                ans %= MOD;
            }
            System.out.println(ans);
            return;
        }
        for (int r = N - K; r <= N; r++) {
            long x = C[r - 2][N - K - 2];
            int a = N - r;
            int b = K - a;
            if (b == 0) {
                for (int n = 0; n <= a; n++) {
                    x = x * dp[n][a] % MOD;
                }
            } else {
                for (int n = 1; n <= a + 1; n++) {
                    x = x * dp[n][a + 1] % MOD;
                    x = x * C[b - 1 + n][b - 1] % MOD;
                }
            }
            ans += x;
            ans %= MOD;
        }
        for (int i = 0; i < N - K - 2; i++) {
            ans = ans * 2 % MOD;
        }
        System.out.println(ans);
    }
}