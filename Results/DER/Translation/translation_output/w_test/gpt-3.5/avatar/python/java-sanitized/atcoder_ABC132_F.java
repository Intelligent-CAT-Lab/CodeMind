import java.util.*;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        int mod = (int) Math.pow(10, 9) + 7;
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int[] coef = new int[(int) Math.sqrt(n) + 1];
        for (int i = 1; i < coef.length; i++) {
            coef[i] = (n / i) - (n / (i + 1));
        }
        int sumCoef = 0;
        for (int i : coef) {
            sumCoef += i;
        }
        Arrays.fill(coef, coef.length, n, 1);

        int nn = coef.length;
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;

        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= mod;
                dp[i][j] = (int) ((long) coef[j] * tmp % mod);
            }
        }

        int result = 0;
        for (int j = 0; j < nn; j++) {
            result += dp[k][j];
            result %= mod;
        }

        System.out.println(result);
    }
}