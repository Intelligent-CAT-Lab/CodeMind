import java.util.*;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int) Math.pow(10, 9) + 7;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coef = new int[n];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i-1] = (n / i) - (n / (i+1));
        }
        int sum = 0;
        for (int i = Math.sqrt(n); i < n; i++) {
            coef[i] = 1;
        }
        for (int i = n-1; i >= 0; i--) {
            sum += coef[i];
            coef[i] = sum;
        }
        int[][] dp = new int[k+1][n];
        for (int i = 0; i <= k; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % mod;
                dp[i][j] = (dp[i][j] * coef[j]) % mod;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + dp[k][i]) % mod;
        }
        System.out.println(ans);
    }
}