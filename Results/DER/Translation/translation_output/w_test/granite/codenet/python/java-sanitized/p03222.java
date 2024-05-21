import java.util.*;

public class p03222 {
    static long MOD=10000000000L+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        K--;
        long[] dp = new long[1000];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < 1000; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        long[][] dp2 = new long[H + 1][W];
        dp2[0][0] = 1;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                dp2[i + 1][j] = (dp2[i + 1][j] + dp2[i][j] * dp[j] % MOD * dp[W - j - 1] % MOD) % MOD;
                if (j - 1 >= 0) {
                    dp2[i + 1][j - 1] = (dp2[i + 1][j - 1] + dp2[i][j] * dp[j - 1] % MOD * dp[W - j - 1] % MOD) % MOD;
                }
                if (j + 1 < W) {
                    dp2[i + 1][j + 1] = (dp2[i + 1][j + 1] + dp2[i][j] * dp[j] % MOD * dp[W - j - 2] % MOD) % MOD;
                }
            }
        }
        System.out.println(dp2[H][K]);
    }
}