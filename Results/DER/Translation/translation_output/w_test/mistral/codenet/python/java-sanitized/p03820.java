import java.util.Scanner;

public class p03820 {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int U = 2010;
        long[][] C = new long[U][U];
        C[0][0] = 1;
        for (int n = 1; n < U; n++) {
            C[n] = new long[n + 1];
            C[n][0] = C[n - 1][0];
            for (int i = 1; i < n; i++) {
                C[n][i] = C[n][i - 1] + C[n - 1][i - 1];
            }
            C[n][n] %= MOD;
        }
        long[][] dp = new long[N + 10][N + 10];
        dp[0][0] = 1;
        for (int n = 1; n < N + 10; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m < N + 10; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = N + 9; n >= 0; n--) {
            dp[n] -= dp[n - 1];
            dp[n] %= MOD;
        }
        long ans = 0;
        if (K == N - 1) {
            ans = dp[0, N - 1].sum() % MOD;
        } else {
            for (int r = N - K; r < N + 1; r++) {
                long x = C[(r - 2)][(N - K - 2)];
                int a = N - r;
                int b = K - a;
                if (b == 0) {
                    x = x * (dp[0, a].sum() % MOD) % MOD;
                } else {
                    long[][] temp = new long[a + 1][a + 2];
                    for (int i = 1; i <= a; i++) {
                        temp[i][0] = dp[i - 1][i];
                    }
                    for (int i = 1; i <= a; i++) {
                        temp[i][i + 1] = dp[i][i];
                    }
                    for (int i = 2; i <= a; i++) {
                        temp[i - 1][i] = dp[i][i - 1];
                    }
                    for (int i = 1; i <= b; i++) {
                        temp[a + i][a + i - 1] = C[b - 1][a + i - 1];
                    }
                    x = (temp[1][a + 2].sum() % MOD) * (temp[1][a + 2].sum() % MOD);
                }
                x %= MOD;
                ans += x;
            }
        }
        ans %= MOD;
        for (int i = N - K - 2; i >= 0; i--) {
            ans = ans * 2 % MOD;
        }
        System.out.println(ans % MOD);
    }
}