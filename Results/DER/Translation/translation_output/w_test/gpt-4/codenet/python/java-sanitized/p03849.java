import java.util.Scanner;

public class p03849 {
    private static final int MOD = 1_000_000_007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        long[][] dp = new long[61][3];
        dp[60][0] = 1L;

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
        
        long result = 0;
        for (int j = 0; j < 3; j++) {
            result += dp[0][j];
            result %= MOD;
        }
        System.out.println(result);
    }
}