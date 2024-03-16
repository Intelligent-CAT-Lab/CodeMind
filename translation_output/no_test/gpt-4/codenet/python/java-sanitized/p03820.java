import java.io.*;
import java.util.StringTokenizer;

public class p03820 {
    
    private static final long MOD = 1_000_000_007L;
    private static final int U = 2010;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(solve(N, K));
    }

    private static long solve(int N, int K) {
        K -= 1;
        long[][] C = new long[U][U];
        C[0][0] = 1;
        for (int n = 1; n < U; n++) {
            System.arraycopy(C[n - 1], 0, C[n], 0, n);
            for (int k = 1; k < U; k++) {
                C[n][k] += C[n - 1][k - 1];
                C[n][k] %= MOD;
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
            for (int m = 0; m < N + 10; m++) {
                dp[n][m] -= dp[n - 1][m];
                dp[n][m] = (dp[n][m] + MOD) % MOD;
            }
        }
        long ans = 0;
        if (K == N - 1) {
            for (int i = 0; i < N; i++) {
                ans += dp[i][N - 1];
                ans %= MOD;
            }
            return ans;
        }
        for (int r = N - K; r <= N; r++) {
            long x = C[r - 2][N - K - 2];
            int a = N - r;
            int b = K - a;
            if (b == 0) {
                for (int i = 0; i <= a; i++) {
                    x = x * (dp[i][a] % MOD) % MOD;
                }
            } else {
                long tempSum = 0;
                for (int i = 1, j = b - 1; i < a + 2 && j >= 0; i++, j--) {
                    tempSum += (dp[i][a + 1] * C[a + b][j]) % MOD;
                    tempSum %= MOD;
                }
                x *= tempSum;
                x %= MOD;
            }
            ans += x;
            ans %= MOD;
        }
        ans %= MOD;
        for (int i = 0; i < N - K - 2; i++) {
            ans = ans * 2 % MOD;
        }
        return ans % MOD;
    }
}