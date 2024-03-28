import java.util.*;
public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000007;
        int[] coef = new int[n];
        for (int i = 1; i <= n; i++) {
            coef[i - 1] = (n / i) - (n / (i + 1));
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += coef[i];
        }
        int[][] dp = new int[k + 1][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = 0;
                for (int l = j; l < n; l++) {
                    tmp += dp[i - 1][l];
                    tmp %= mod;
                }
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += dp[k][i];
            ans %= mod;
        }
        System.out.println(ans);
    }
}