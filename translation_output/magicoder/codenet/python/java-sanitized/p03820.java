import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03820 {
    static final long MOD = 1_000_000_007;
    static final int U = 2010;
    static long[][] C = new long[U][U];
    static long[][] dp = new long[U][U];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        K -= 1;
        C[0][0] = 1;
        for (int n = 1; n < U; n++) {
            C[n] = (C[n - 1].clone());
            for (int m = 1; m < U; m++) {
                C[n][m] += C[n - 1][m - 1];
                C[n][m] %= MOD;
            }
        }
        dp[0][0] = 1;
        for (int n = 1; n < U; n++) {
            dp[n] = dp[n - 1].clone();
            for (int m = n + 1; m < U; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = U - 1; n > 0; n--) {
            dp[n] = (dp[n].clone() - dp[n - 1] + MOD) % MOD;
        }
        long ans = 0;
        if (K == N - 1) {
            for (int i = 0; i < N; i++) {
                ans += dp[i][N - 1];
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
                x = x * (dp[a][a]) % MOD;
            } else {
                long[] temp = new long[b];
                for (int i = 0; i < b; i++) {
                    temp[i] = dp[i + 1][a + i];
                }
                for (int i = 0; i < b; i++) {
                    x *= temp[b - 1 - i];
                    x %= MOD;
                }
            }
            ans += x;
            ans %= MOD;
        }
        for (int i = 0; i < N - K - 2; i++) {
            ans = ans * 2 % MOD;
        }
        System.out.println(ans % MOD);
    }
}