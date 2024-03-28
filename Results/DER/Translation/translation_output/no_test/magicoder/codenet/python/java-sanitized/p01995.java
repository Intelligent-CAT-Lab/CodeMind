import java.util.*;

public class p01995 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int l = s.length();
        Map<Character, Integer> alpha2 = new HashMap<>();
        for (int i = 0; i < alpha.length(); i++) {
            alpha2.put(alpha.charAt(i), i);
        }
        List<Integer>[] memo = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            memo[i] = new ArrayList<>();
        }
        int mod = (int) Math.pow(10, 9) + 7;
        for (int i = 0; i < l; i++) {
            memo[alpha2.get(s.charAt(i))].add(i);
        }
        int[][] dp = new int[l + 1][l + 1];
        dp[0][l] = 1;
        int ans = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                int p = dp[i][j];
                if (p == 0) {
                    continue;
                }
                for (int k = 0; k < 26; k++) {
                    int x = Collections.binarySearch(memo[k], i);
                    int y = Collections.binarySearch(memo[k], j - 1);
                    if (x > y) {
                        continue;
                    }
                    ans = (ans + p) % mod;
                    if (x < y) {
                        int mx = memo[k].get(x);
                        int my = memo[k].get(y);
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
        System.out.println(ans);
    }
}