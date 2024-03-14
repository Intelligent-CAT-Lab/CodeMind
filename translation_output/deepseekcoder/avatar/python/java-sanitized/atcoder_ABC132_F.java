import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        final long mod = (long) Math.pow(10, 9) + 7;
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long[] coef = new long[(int) Math.sqrt(n) + 1];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i] = n / i - n / (i + 1);
        }
        for (int i = 1; i < coef.length; i++) {
            coef[0] += coef[i];
        }
        int nn = (int) (n - coef[0]);
        long[][] dp = new long[(int) k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        long sum = 0;
        for (int i = 0; i < nn; i++) {
            sum += dp[(int) k][i];
            sum %= mod;
        }
        System.out.println(sum);
    }
}