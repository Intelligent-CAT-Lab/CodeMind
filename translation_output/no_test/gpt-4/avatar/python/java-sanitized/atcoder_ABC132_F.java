import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC132_F {
    private static final int MOD = (int)(1e9 + 7); // 10 ** 9 + 7

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coef = new int[n];
        Arrays.fill(coef, 1);
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i - 1] = (n / i) - (n / (i + 1));
        }
        
        int sum = Arrays.stream(coef).sum();
        Arrays.fill(coef, n - sum + 1, n, 1);
        int nn = coef.length;
        
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;

        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= MOD;
                dp[i][j] = (int)((coef[j] * tmp) % MOD);
            }
        }
        
        long sumDp = Arrays.stream(dp[k]).sum();
        System.out.println(sumDp % MOD);

        sc.close();
    }
}