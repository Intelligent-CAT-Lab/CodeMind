import java.util.Scanner;

public class p02990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        int[][] dp = new int[N + 1][K + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
                }
            }
        }

        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                System.out.println(0);
            } else {
                int ans = dp[N - K + 1][i] * between(N, K, i) % MOD;
                System.out.println(ans);
            }
        }
    }

    public static int between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return comb(k - 1, i - 1, MOD);
    }

    public static int comb(int n, int r, int mod) {
        r = Math.min(r, n - r);
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = (res * (n - i) * pow(i + 1, mod - 2, mod)) % mod;
        }
        return res;
    }
}