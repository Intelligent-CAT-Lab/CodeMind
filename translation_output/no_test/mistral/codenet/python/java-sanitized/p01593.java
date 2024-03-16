import java.util.*;

public class p01593 {
    public static void main(String[] args) {
        int[] dp = new int[]{1};
        Arrays.fill(dp, 0, 1000, 0);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i);
                j++;
            }
        }
        System.out.printf("%.10f%n", dp[n]);
    }
}