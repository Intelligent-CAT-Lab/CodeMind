import java.io.*;
import java.util.*;

public class p03820 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int MOD = 1_000_000_007;
        int U = 2010;
        long[][] C = new long[U][U];
        C[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int i = 0; i < U; i++) {
                C[n][i] += C[n - 1][i];
                C[n][i] %= MOD;
            }
            for (int i = 0; i < U; i++) {
                C[n][i] += C[n - 1][i - 1];
                C[n][i] %= MOD;
            }
        }
        long[][] dp = new long[N + 10][N + 10];
        dp[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m <= N; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = N; n >= 0; n--) {
            for (int m = 0; m <= n; m++) {
                dp[n][m] -= dp[n - 1][m];
                dp[n][m] %= MOD;
            }
        }
        long ans = 0;
        if (K == N - 1) {
            System.out.println(Arrays.stream(dp[0]).limit(N).sum() % MOD);
            return;
        }
        for (int r = N - K; r <= N; r++) {
            long x = C[r - 2][N - K - 2];
            int a = N - r;
            int b = K - a;
            if (b == 0) {
                x = x * (Arrays.stream(dp[0]).limit(a + 1).sum() % MOD) % MOD;
            } else {
                x *= (Arrays.stream(dp[1]).limit(a + 2).sum() * Arrays.stream(C[b - 1]).limit(a + b).map(i -> i == 0? 1 : i).reduce(1, (a, b) -> a * b) % MOD) % MOD;
            }
            ans += x;
        }
        ans %= MOD;
        for (int i = 0; i < N - K - 2; i++) {
            ans = ans * 2 % MOD;
        }
        System.out.println(ans);
    }
}