import java.util.*;

public class p01593 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1);
        dp[n] = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n && j <= m; j++) {
                dp[j] += dp[j - i] / (n - j + i);
            }
        }
        System.out.printf("%.10f", dp[n]);
    }
}