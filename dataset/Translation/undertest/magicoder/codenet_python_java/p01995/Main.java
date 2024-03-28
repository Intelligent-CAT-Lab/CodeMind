import java.util.*;

public class p01995 {
    static int mod = (int) Math.pow(10, 9) + 7;
    static int[][] dp;
    static int[][] memo;
    static int[] alpha2;
    static int l;
    static String s;

    public static void main(String[] args) {
        s = "acpc";
        l = s.length();
        alpha2 = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha2[i] = -1;
        }
        for (int i = 0; i < l; i++) {
            alpha2[s.charAt(i) - 'a'] = i;
        }
        memo = new int[26][l];
        for (int i = 0; i < 26; i++) {
            Arrays.fill(memo[i], -1);
        }
        int k = 0;
        for (int i = 0; i < l; i++) {
            memo[s.charAt(i) - 'a'][k++] = i;
        }
        dp = new int[l + 1][l + 1];
        dp[0][l] = 1;
        int ans = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                int p = dp[i][j];
                if (p == 0) {
                    continue;
                }
                for (int c = 0; c < 26; c++) {
                    int x = bl(memo[c], i);
                    int y = br(memo[c], j - 1) - 1;
                    if (x > y) {
                        continue;
                    }
                    ans = (ans + p) % mod;
                    if (x < y) {
                        int mx = memo[c][x];
                        int my = memo[c][y];
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                }
                ans = ans % mod;
            }
        }
        for (int i = 0; i <= l; i++) {
            for (int j = 0; j <= l; j++) {
                ans = (ans + dp[i][j]) % mod;
            }
        }
        ans = (ans + mod - 1) % mod;
        System.out.println(ans);
    }

    static int bl(int[] arr, int x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    static int br(int[] arr, int x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] <= x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}