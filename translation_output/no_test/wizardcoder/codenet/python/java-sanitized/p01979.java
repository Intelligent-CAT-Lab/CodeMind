import java.util.*;

public class p01979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int[][] dp = new int[20][1 << 20];
        for (int i = 0; i < 20; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = 0;
        for (int i = 0; i < 20; i++) {
            ans += dfs(N, i, 0, dp);
        }
        System.out.println(ans);
    }

    public static int dfs(int N, int index, int state, int[][] dp) {
        if (index == 20) {
            if (state == 0) {
                return 0;
            }
            int cnt = 0;
            for (int i = 0; i < 20; i++) {
                if ((state & (1 << i)) == 0) {
                    continue;
                }
                cnt++;
            }
            int ans = 1;
            for (int i = 0; i < cnt; i++) {
                ans *= 10;
            }
            ans *= (-1) * Math.pow(-1, cnt + 1);
            return ans;
        }
        if (dp[index][state]!= -1) {
            return dp[index][state];
        }
        int ans = dfs(N, index + 1, state, dp);
        if (index <= 16) {
            int newState = state | (1 << index) | (1 << (index + 1)) | (1 << (index + 3));
            ans += dfs(N, index + 4, newState, dp);
        }
        dp[index][state] = ans;
        return ans;
    }
}