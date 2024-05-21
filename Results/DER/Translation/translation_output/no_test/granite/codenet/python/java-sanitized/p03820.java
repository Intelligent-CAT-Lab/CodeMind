import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p03820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        long MOD = 1_000_000_007;

        long[][] C = new long[2010][2010];
        C[0][0] = 1;
        for (int n = 1; n < 2010; n++) {
            C[n][0] = 1;
            for (int m = 1; m < 2010; m++) {
                C[n][m] = (C[n - 1][m] + C[n][m - 1]) % MOD;
            }
        }

        long[][] dp = new long[N + 10][N + 10];
        dp[0][0] = 1;
        for (int n = 1; n < N + 10; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m < N + 10; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = N + 9; n > 0; n--) {
            dp[n][N] -= dp[n - 1][N];
            dp[n][N] %= MOD;
        }

        long ans = 0;
        if (K == N - 1) {
            for (int n = 0; n < N; n++) {
                ans += dp[n][N];
                ans %= MOD;
            }
        } else {
            for (int r = N - K; r <= N; r++) {
                long x = C[r - 2][N - K - 2];
                int a = N - r;
                int b = K - a;
                if (b == 0) {
                    x = x * (dp[0][a] + dp[1][a]) % MOD;
                } else {
                    x *= (dp[1][a + 1] * C[b - 1][a + b] % MOD) * (dp[0][b - 1] + dp[1][b - 1]) % MOD;
                    x %= MOD;
                }
                ans += x;
                ans %= MOD;
            }
        }
        for (int i = 0; i < N - K - 2; i++) {
            ans = ans * 2 % MOD;
        }
        System.out.println(ans);
    }
}