import java.util.*;

public class atcoder_ABC132_F {
    final static int mod = (int) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] coef = new int[n];
        for (int i = 1; i < (int) Math.sqrt(n) + 1; i++) {
            coef[i] = (n / i) - (n / (i + 1));
        }
        Arrays.fill(coef, n - sum(coef), n, 1);
        coef = Arrays.copyOf(coef, coef.length - 1);
        int nn = coef.length;
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        int ans = sum(dp[k]);
        ans %= mod;
        System.out.println(ans);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}