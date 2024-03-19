import java.util.*;

public class p01995 {
    static int mod = (int) Math.pow(10, 9) + 7;
    static ArrayList<Integer>[] memo;
    static int[][] dp;
    static String s;
    static int l;

    static int bl(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < x)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    static int br(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    static int solve() {
        dp = new int[l + 1][l + 1];
        dp[0][l] = 1;
        int ans = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                int p = dp[i][j];
                if (p == 0)
                    continue;
                for (int k = 0; k < 26; k++) {
                    int x = bl(memo[k], i);
                    int y = br(memo[k], j - 1) - 1;
                    if (x > y)
                        continue;
                    ans = (ans + p) % mod;
                    if (x < y) {
                        int mx = memo[k].get(x), my = memo[k].get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                }
            }
        }
        for (int i = 0; i <= l; i++) {
            for (int j = 0; j <= l; j++) {
                ans = (ans + dp[i][j]) % mod;
            }
        }
        ans = (ans + mod - 1) % mod;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        l = s.length();
        memo = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            memo[i] = new ArrayList<>();
        }
        for (int i = 0; i < l; i++) {
            memo[s.charAt(i) - 'a'].add(i);
        }
        System.out.println(solve());
    }
}