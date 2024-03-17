import java.util.Scanner;

public class p00957 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int[][] dp = new int[l+1][2];
        dp[0][0] = 1;
        dp[0][1] = 0;

        for (int i = 1; i <= l; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-k][0];
            dp[i][1] = dp[i-1][1] + dp[i-k][1];
        }

        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += dp[i][0];
        }

        System.out.println(ans);
    }
}