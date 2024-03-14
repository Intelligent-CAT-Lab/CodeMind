import java.util.*;

public class p03212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] dp = new int[n+1][10];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = dfs(dp, n, 0);
        System.out.println(ans);
    }

    public static int dfs(int[][] dp, int n, int curr) {
        if (curr > n) {
            return 0;
        }
        if (dp[curr][7]!= -1) {
            return dp[curr][7];
        }
        int ans = 0;
        if (curr == 0) {
            ans = 1;
        } else if (curr > 0 && curr <= n) {
            if (curr % 3 == 0) {
                ans = 1;
            } else if (curr % 3 == 1) {
                ans = 0;
            } else {
                ans = 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            int next = curr + i;
            if (next > n) {
                continue;
            }
            ans += dfs(dp, n, next);
        }
        dp[curr][7] = ans;
        return ans;
    }
}