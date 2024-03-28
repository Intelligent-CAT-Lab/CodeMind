import java.util.*;

public class p02065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = sc.nextInt();
        int[][] dp = new int[2 * N][2 * N];
        Arrays.fill(dp, new int[2 * N]);
        Arrays.fill(dp[0], new int[2 * N]);
        dp[0][(0, 0)] = 1;
        for (int i = 1; i < 2 * N - 1; i++) {
            for (Map.Entry<int[], int> entry : dp[i].entrySet()) {
                int[] leftTop = entry.getKey();
                int v = entry.getValue();
                if (leftTop[1].size() > K + 1) {
                    continue;
                }
                if (leftTop[0] == null) {
                    if (leftTop[1].size() > 0 && i + 1 - leftTop[1].get(0) <= K) {
                        dp[i + 1][(i + 1, leftTop[1])] = (dp[i + 1][(i + 1, leftTop[1])] + v) % mod;
                    }
                } else {
                    if (i + 1 - leftTop[0] <= K) {
                        dp[i + 1][(i + 1, leftTop[0])] = (dp[i + 1][(i + 1, leftTop[0])] + v) % mod;
                    }
                    if (leftTop[1].size() > 1 && i + 1 - leftTop[1].get(1) <= K) {
                        dp[i + 1][(i + 1, leftTop[1].subList(1, leftTop[1].size()))] = (dp[i + 1][(i + 1, leftTop[1].subList(1, leftTop[1].size()))] + v) % mod;
                    }
                }
            }
        }
        int res = 0;
        for (Map.Entry<int[], int> entry : dp[2 * N - 1].entrySet()) {
            int[] leftTop = entry.getKey();
            int v = entry.getValue();
            if (leftTop[1].size() == 1) {
                assert leftTop[0] == 2 * N - 1;
                res = (res + v) % mod;
            }
        }
        System.out.println(res);
    }
}