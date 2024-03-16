import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p01995 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int l = s.length();
        int[] alpha2 = new int[26];
        for (int i = 0; i < alpha.length(); i++) {
            alpha2[alpha.charAt(i) - 'a'] = i;
        }
        ArrayList<Integer>[] memo = new ArrayList[26];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = new ArrayList<Integer>();
        }
        final int mod = 1000000007;
        for (int i = 0; i < l; i++) {
            memo[alpha2[s.charAt(i) - 'a']].add(i);
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
                    if (x < 0) x = -x - 1;
                    if (y < 0) y = -y - 2;
                    if (x > y) continue;
                    ans += p;
                    if (x < y) {
                        int mx = memo[k].get(x);
                        int my = memo[k].get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                    ans = ans % mod;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                ans = (ans + dp[i][j]) % mod;
            }
        }
        ans = (ans + mod - 1) % mod;
        System.out.println(ans);
        scanner.close();
    }
}