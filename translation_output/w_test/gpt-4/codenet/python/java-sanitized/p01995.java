import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p01995 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int l = s.length();
        int[] alpha2 = new int[26];
        for (int i = 0; i < alpha.length(); i++) {
            alpha2[alpha.charAt(i) - 'a'] = i;
        }
        List<List<Integer>> memo = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            memo.add(new ArrayList<>());
        }
        long mod = 1000000007;
        for (int i = 0; i < l; i++) {
            memo.get(alpha2[s.charAt(i) - 'a']).add(i);
        }
        long[][] dp = new long[l + 1][l + 1];
        dp[0][l] = 1;
        long ans = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                long p = dp[i][j];
                if (p == 0) {
                    continue;
                }
                for (int k = 0; k < 26; k++) {
                    List<Integer> list = memo.get(k);
                    int x = Collections.binarySearch(list, i);
                    int y = Collections.binarySearch(list, j - 1);
                    if (x < 0) x = -x - 1;
                    if (y < 0) y = -y - 2;
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = list.get(x), my = list.get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                }
                ans = ans % mod;
            }
        }
        for (long[] row : dp) {
            for (long val : row) {
                ans = (ans + val) % mod;
            }
        }
        ans = (ans + mod - 1) % mod;
        System.out.println(ans);
        scanner.close();
    }
}