import java.util.*;

public class p00957 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[l+1];
        dp[0] = 1;
        for (int i = 1; i <= l; i++) {
            dp[i] = dp[i-1];
            if (i >= k) {
                dp[i] += dp[i-k];
            }
        }
        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += dp[i-1];
        }
        System.out.println(ans);
    }
}