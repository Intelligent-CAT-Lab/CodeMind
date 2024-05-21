import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03529 {

    static int N, K;
    static final int MOD = 1_000_000_007;
    static long[][][] dp;

    public static void main(String[] args) throws IOException {
        init();
        solution();
    }

    private static void solution() {
        dp = new long[N + 1][K + 1][2][3301];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l <= 3300; l++) {
                        dp[i][j][k][l] = -1;
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += (K * (K + 1) / 2 % MOD) * pow(K + 1, N - i, MOD) % MOD * i % MOD;
            ans %= MOD;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                ans -= dfs(i, j, 0, 0) * i % MOD;
                ans %= MOD;
            }
        }
        System.out.println(ans);
    }

    private static long dfs(int n, int k, int b, int sum) {
        if (n == 0) {
            if (sum == 0) return 1;
            else return 0;
        }
        if (dp[n][k][b][sum]!= -1) return dp[n][k][b][sum];
        long ret = 0;
        if (b == 0) {
            for (int i = 0; i <= k; i++) {
                ret += dfs(n - 1, k, 1, sum + i);
                ret %= MOD;
            }
        } else {
            for (int i = 0; i <= k; i++) {
                ret += dfs(n - 1, k, 0, sum + i);
                ret %= MOD;
            }
        }
        return dp[n][k][b][sum] = ret;
    }

    private static long pow(long a, long b, long mod) {
        long ret = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1) {
                ret = ret * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return ret;
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }
}