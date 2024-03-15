import java.util.*;

public class p03914 {
    final static int mod = 1000000007;
    final static double eps = Math.pow(10, -9);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        N = sc.nextInt();
        M = sc.nextInt();
        int[][] dp = new int[N + 1][N];
        Arrays.fill(dp[1], 1);
        for (int i = 1; i <= M; i++) {
            int[][] dp_new = new int[N + 1][N];
            Arrays.fill(dp_new[1], 1);
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    dp_new[j][k] = (dp_new[j][k] + dp[j][k] * k) % mod;
                    if (k + 1 < N) {
                        dp_new[j][k + 1] = (dp_new[j][k + 1] + dp[j][k] * (N - j - k)) % mod;
                    }
                    if (j + k <= N) {
                        dp_new[j + k][0] = (dp_new[j + k][0] + dp[j][k] * j) % mod;
                    }
                }
            }
            dp = dp_new;
        }
        System.out.println(dp[N][0]);
    }
}