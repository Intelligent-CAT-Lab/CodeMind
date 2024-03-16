import java.util.*;

public class p01995 {
    static int mod = (int) Math.pow(10, 9) + 7;
    static ArrayList<Integer>[] memo;
    static int[][] dp;
    static String alpha = "abcdefghijklmnopqrstuvwxyz";
    static Map<Character, Integer> alpha2 = new HashMap<>();

    static int bl(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) < x)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    static int br(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    static int solve(String s) {
        int l = s.length();
        memo = new ArrayList[26];
        dp = new int[l + 1][l + 1];
        dp[0][l] = 1;
        long ans = 0;

        for (int i = 0; i < 26; i++)
            memo[i] = new ArrayList<>();

        for (int i = 0; i < l; i++)
            memo[alpha2.get(s.charAt(i))].add(i);

        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                int p = dp[i][j];
                if (p == 0)
                    continue;
                for (int k = 0; k < 26; k++) {
                    ArrayList<Integer> arr = memo[k];
                    int x = bl(arr, i);
                    int y = br(arr, j - 1) - 1;
                    if (x > y)
                        continue;
                    ans = (ans + p) % mod;
                    if (x < y) {
                        int mx = arr.get(x), my = arr.get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                }
            }
        }

        for (int i = 0; i <= l; i++)
            for (int j = 0; j <= l; j++)
                ans = (ans + dp[i][j]) % mod;

        ans = (ans + mod - 1) % mod;
        return (int) ans;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 26; i++)
            alpha2.put(alpha.charAt(i), i);
        System.out.println(solve(new Scanner(System.in).next()));
    }
}