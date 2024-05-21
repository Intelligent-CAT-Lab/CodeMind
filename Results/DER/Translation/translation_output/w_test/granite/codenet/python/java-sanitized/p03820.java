import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03820 {
    static final int MOD = 1_000_000_007;
    static final int MAX = 2010;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[][] C = new long[MAX][MAX];
        C[0][0] = 1;
        for (int n = 1; n < MAX; n++) {
            C[n][0] = 1;
            for (int m = 1; m < MAX; m++) {
                C[n][m] = (C[n - 1][m] + C[n][m - 1]) % MOD;
            }
        }

        long[][] dp = new long[MAX][MAX];
        dp[0][0] = 1;
        for (int n = 1; n < MAX; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m < MAX; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = MAX - 1; n > 0; n--) {
            dp[n][n] = (dp[n][n] - dp[n - 1][n - 1] + MOD) % MOD;
        }

        long ans = 0;
        if (K == N - 1) {
            for (int n = 1; n < N; n++) {
                ans = (ans + dp[n][N - 1]) % MOD;
            }
        } else {
            for (int r = N - K; r <= N; r++) {
                long x = C[r - 2][N - K - 2];
                int a = N - r;
                int b = K - a;
                if (b == 0) {
                    x = x * (dp[0][a] + dp[1][a]) % MOD;
                } else {
                    for (int i = 1; i <= a; i++) {
                        dp[i][a] = (dp[i - 1][a] + dp[i][a - 1]) % MOD;
                    }
                    x *= (dp[1][a] * C[b - 1][a + b - 2] % MOD + dp[0][a] * C[b - 1][a + b - 1] % MOD) % MOD;
                    x %= MOD;
                }
                ans = (ans + x) % MOD;
            }
        }
        for (int i = 1; i <= N - K - 2; i++) {
            ans = ans * 2 % MOD;
        }
        System.out.println(ans);
    }
}