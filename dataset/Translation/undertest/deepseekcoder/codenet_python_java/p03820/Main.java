import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03820 {
    static final long MOD = 1_000_000_007;
    static long[][] C, dp;
    static int U = 2010;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        K -= 1;
        init();
        System.out.println(solve(N, K));
    }

    static void init() {
        C = new long[U][U];
        dp = new long[U][U];
        for (int i = 0; i < U; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD;
            }
        }
        dp[0][0] = 1;
        for (int i = 1; i < U; i++) {
            dp[i][i] = (dp[i - 1][i - 1] + dp[i - 1][i]) % MOD;
            for (int j = i + 1; j < U; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
            }
        }
        for (int i = U - 1; i > 0; i--) {
            dp[i] = sub(dp[i], dp[i - 1]);
        }
    }

    static long[] sub(long[] a, long[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i] - b[i] + MOD) % MOD;
        }
        return a;
    }

    static long solve(int N, int K) {
        long ans = 0;
        if (K == N - 1) {
            for (int i = 0; i < N; i++) {
                ans = (ans + dp[i][N - 1]) % MOD;
            }
            return ans;
        }
        for (int r = N - K; r <= N; r++) {
            long x = C[r - 2][N - K - 2];
            int a = N - r;
            int b = K - a;
            if (b == 0) {
                x = x * sum(dp, 0, a) % MOD;
            } else {
                long[] arr = new long[a + 2];
                for (int i = 1; i <= a + 1; i++) {
                    arr[i] = dp[i - 1][a];
                }
                x *= sum(arr, 1, a + b + 1);
                x %= MOD;
            }
            ans = (ans + x) % MOD;
        }
        for (int i = 0; i < N - K - 2; i++) {
            ans = ans * 2 % MOD;
        }
        return ans % MOD;
    }

    static long sum(long[][] arr, int start, int end) {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum = (sum + arr[i]) % MOD;
        }
        return sum;
    }

    static long sum(long[] arr, int start, int end) {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum = (sum + arr[i]) % MOD;
        }
        return sum;
    }
}