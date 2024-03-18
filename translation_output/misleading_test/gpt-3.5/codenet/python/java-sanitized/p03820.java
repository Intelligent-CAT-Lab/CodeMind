import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03820 {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        System.out.println(main(N, K));
    }

    static int main(int N, int K) {
        K -= 1;
        int U = 2010;
        long[][] C = new long[U][U];
        C[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int i = 0; i < U; i++) {
                C[n][i] += C[n - 1][i];
                if (i > 0) {
                    C[n][i] += C[n - 1][i - 1];
                }
                C[n][i] %= MOD;
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
            dp[n][0] -= dp[n - 1][0];
            dp[n][0] = (dp[n][0] + MOD) % MOD;
        }

        long ans = 0;
        if (K == N - 1) {
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum = (sum + dp[i][N - 1]) % MOD;
            }
            return (int) sum;
        }

        for (int r = N - K; r < N + 1; r++) {
            long x = C[r - 2][N - K - 2];
            int a = N - r;
            int b = K - a;
            if (b == 0) {
                long sum = 0;
                for (int i = 0; i <= a; i++) {
                    sum = (sum + dp[i][a]) % MOD;
                }
                x = (x * sum) % MOD;
            } else {
                long sum = 0;
                for (int i = 1; i <= a + 1; i++) {
                    sum = (sum + dp[i][a + 1]) % MOD;
                }
                for (int i = b - 1; i < a + b; i++) {
                    sum = (sum + C[i][b - 1]) % MOD;
                }
                x = (x * sum) % MOD;
            }
            ans = (ans + x) % MOD;
        }

        for (int i = 0; i < N - K - 2; i++) {
            ans = (ans * 2) % MOD;
        }

        return (int) ans;
    }
}