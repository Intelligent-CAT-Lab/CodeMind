import java.util.Scanner;

public class p03849 {
    public static final long MOD = (long) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[][] dp = new long[61][3];
        for (int i = 0; i < 61; i++) {
            dp[i][0] = 0;
            dp[i][1] = 0;
            dp[i][2] = 0;
        }

        dp[60][0] = 1;
        for (int i = 59; i >= 0; i--) {
            if (((n >> i) & 1) == 1) {
                dp[i][0] += dp[i + 1][0];
                dp[i][1] += dp[i + 1][0] + dp[i + 1][1];
                dp[i][2] += 2 * dp[i + 1][1] + 3 * dp[i + 1][2];
            } else {
                dp[i][0] += dp[i + 1][0] + dp[i + 1][1];
                dp[i][1] += dp[i + 1][1];
                dp[i][2] += dp[i + 1][1] + 3 * dp[i + 1][2];
            }

            for (int j = 0; j < 3; j++) {
                dp[i][j] %= MOD;
            }
        }

        long sum = 0;
        for (int j = 0; j < 3; j++) {
            sum = (sum + dp[0][j]) % MOD;
        }

        System.out.println(sum);
    }
}