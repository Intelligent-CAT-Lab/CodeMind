import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03820 {
    static final long MOD = (long)1e9 + 7;
    static long[][] C, dp;
    static int U = 2010;

    static void preprocess() {
        C = new long[U][U];
        C[0][0] = 1;
        for (int n = 1; n < U; ++n) {
            C[n] = C[n - 1].clone();
            for (int i = 1; i < U; ++i) {
                C[n][i] += C[n - 1][i - 1];
                C[n][i] %= MOD;
            }
        }

        dp = new long[U + 10][U + 10];
        dp[0][0] = 1;
        for (int n = 1; n < U + 10; ++n) {
            dp[n] = dp[n - 1].clone();
            for (int m = n + 1; m < U + 10; ++m) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = U + 8; n >= 0; --n) {
            dp[n] = (dp[n] - dp[n - 1] + MOD) % MOD;
        }
    }

    static long solve(int N, int K) {
        K--;
        long ans = 0;
        if (K == N - 1) {
            for (int i = 0; i < N; ++i) {
                ans += dp[i][N - 1];
                ans %= MOD;
            }
            return ans;
        }
        for (int r = N - K; r <= N; ++r) {
            long x = C[r - 2][N - K - 2];
            int a = N - r;
            int b = K - a;
            if (b == 0) {
                x = x * (dp[a + 1][a] % MOD) % MOD;
            } else {
                long[] arr = new long[a + 1];
                for (int i = 0; i <= a; ++i) {
                    arr[i] = dp[i + 1][a] * C[b - 1][b - 1] % MOD;
                }
                x *= sumArray(arr, a + 1) % MOD;
                x %= MOD;
            }
            ans += x;
            ans %= MOD;
        }
        for (int i = 0; i < N - K - 2; ++i) {
            ans = ans * 2 % MOD;
        }
        return ans % MOD;
    }

    static long sumArray(long[] arr, int n) {
        long sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += arr[i];
            sum %= MOD;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        preprocess();
        System.out.println(solve(N, K));
    }
}