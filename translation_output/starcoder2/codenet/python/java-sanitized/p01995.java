import java.util.*;
import java.io.*;

public class p01995 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int l = s.length();
        int[][] dp = new int[l + 1][l + 1];
        dp[0][l] = 1;
        int mod = (int) 1e9 + 7;
        int ans = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                int p = dp[i][j];
                if (p == 0) {
                    continue;
                }
                for (int k = 0; k < 26; k++) {
                    int x = bl(memo[k], i);
                    int y = br(memo[k], j - 1) - 1;
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = memo[k][x];
                        int my = memo[k][y];
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                    ans = ans % mod;
                }
            }
        }
        ans = (ans + sum(dp) + mod - 1) % mod;
        System.out.println(ans);
    }

    static int bl(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    static int br(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr[mid] <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    static int sum(int[][] dp) {
        int ans = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                ans += dp[i][j];
            }
        }
        return ans;
    }
}