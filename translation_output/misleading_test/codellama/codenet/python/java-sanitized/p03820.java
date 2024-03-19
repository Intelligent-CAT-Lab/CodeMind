import java.util.Scanner;
import java.util.Arrays;

public class p03820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[][] C = new int[2010][2010];
        C[0][0] = 1;
        for (int n = 1; n < 2010; n++) {
            C[n][0] += C[n - 1][0];
            C[n][1:] += C[n - 1][:-1];
            C[n] %= 1000000007;
        }
        int[][] dp = new int[N + 10][N + 10];
        dp[0][0] = 1;
        for (int n = 1; n < N + 10; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % 1000000007;
            for (int m = n + 1; m < N + 10; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % 1000000007;
            }
        }
        for (int n = N + 9; n >= 0; n--) {
            dp[n] -= dp[n - 1];
            dp[n] %= 1000000007;
        }
        int ans = 0;
        if (K == N - 1) {
            return dp[N - 1][N - 1];
        }
        for (int r = N - K; r <= N + 1; r++) {
            int x = C[r - 2][N - K - 2];
            int a = N - r;
            int b = K - a;
            if (b == 0) {
                x = x * (dp[a + 1][a].sum() % 1000000007) % 1000000007;
            } else {
                x *= (dp[1:a + 2][a + 1] * C[b - 1:a + b][b - 1][::-1] % 1000000007).sum() % 1000000007;
                x %= 1000000007;
            }
            ans += x;
        }
        ans %= 1000000007;
        for (int i = 0; i < N - K - 2; i++) {
            ans = ans * 2 % 1000000007;
        }
        return ans % 1000000007;
    }
}