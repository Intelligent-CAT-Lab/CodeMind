import java.util.Scanner;

public class atcoder_ABC132_F {

    public static void main(String[] args) {
        final long MOD = (long) 1e9 + 7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] coef = new long[n];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i-1] = (n / i) - (n / (i + 1));
        }
        long sumCoef = 0;
        for (int i = 0; i < coef.length; i++) {
            sumCoef += coef[i];
        }
        for (int i = sumCoef; i < n; i++) {
            coef[i] = 1;
        }

        int nn = coef.length;
        long[][] dp = new long[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= MOD;
                dp[i][j] = coef[j] * tmp % MOD;
            }
        }

        long result = 0;
        for (int i = 0; i < dp[k].length; i++) {
            result += dp[k][i];
            result %= MOD;
        }
        System.out.println(result);
    }
}