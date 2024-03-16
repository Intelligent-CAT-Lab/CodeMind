import java.util.*;
public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dp = new int[N + 1][10];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(solve(N, dp));
    }

    public static int solve(int n, int[][] dp) {
        if (n > 9) {
            return 0;
        }
        if (dp[n][0]!= -1) {
            return dp[n][0];
        }
        int ans = 1;
        if (n == 0) {
            ans = 0;
        } else if (n == 1) {
            ans = 1;
        } else if (n == 2) {
            ans = 1;
        } else if (n == 3) {
            ans = 1;
        } else if (n == 4) {
            ans = 1;
        } else if (n == 5) {
            ans = 1;
        } else if (n == 6) {
            ans = 1;
        } else if (n == 7) {
            ans = 1;
        } else if (n == 8) {
            ans = 1;
        } else if (n == 9) {
            ans = 1;
        }
        for (int i = 0; i < 3; i++) {
            ans += solve(n + i, dp);
        }
        dp[n][0] = ans;
        return ans;
    }
}