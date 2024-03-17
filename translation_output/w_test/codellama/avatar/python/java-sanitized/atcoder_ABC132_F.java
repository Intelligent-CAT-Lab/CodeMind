import java.util.Scanner;

public class atcoder_ABC132_F {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[] coef = new int[n];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i] = (n / i) - (n / (i + 1));
        }
        coef[n - 1] = 1;
        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = n - 1; j >= 0; j--) {
                tmp += dp[i - 1][n - 1 - j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        System.out.println(sum(dp[k]) % mod);
    }

    private static int sum(int[][] dp) {
        int sum = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                sum += dp[i][j];
            }
        }
        return sum;
    }
}