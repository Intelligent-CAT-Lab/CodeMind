import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        final long mod = (long) Math.pow(10, 9) + 7;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int sqrtN = (int) Math.sqrt(n);
        long[] coef = new long[n];
        int coefIndex = 0;

        for (int i = 1; i <= sqrtN; i++) {
            coef[coefIndex++] = n / i - n / (i + 1);
        }

        for (int i = 1; i <= n - sum(coef, coefIndex); i++) {
            coef[coefIndex++] = 1;
        }

        long[][] dp = new long[k + 1][coefIndex];
        dp[0][0] = 1;

        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = coefIndex - 1; j >= 0; j--) {
                tmp += dp[i - 1][coefIndex - 1 - j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }

        long sum = 0;
        for (int i = 0; i < coefIndex; i++) {
            sum += dp[k][i];
            sum %= mod;
        }
        System.out.println(sum);

        scanner.close();
    }

    private static long sum(long[] arr, int len) {
        long total = 0;
        for (int i = 0; i < len; i++) {
            total += arr[i];
        }
        return total;
    }
}