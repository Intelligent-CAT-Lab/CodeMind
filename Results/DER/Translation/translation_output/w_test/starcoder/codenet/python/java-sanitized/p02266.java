import java.util.*;

public class p02266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] g = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        int[] dp2 = new int[n + 1];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + g[i];
            max = Math.max(max, dp[i]);
        }
        int[] ans = new int[n + 1];
        for (int i = n; i >= 1; i--) {
            if (dp[i] == max) {
                ans[i] = max;
                max--;
            } else {
                ans[i] = max;
            }
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += ans[i];
        }
        System.out.println(sum);
        System.out.println(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}