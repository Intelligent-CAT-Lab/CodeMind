import java.util.*;
import java.io.*;

public class p01995 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[] alpha2 = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha2[i] = Arrays.asList(alpha).indexOf(s.charAt(i));
        }
        List<List<Integer>> memo = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            memo.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            memo.get(alpha2[s.charAt(i) - 'a']).add(i);
        }
        long[][] dp = new long[n + 1][n + 1];
        dp[0][n] = 1;
        long mod = 100000007;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                long p = dp[i][j];
                if (p == 0) {
                    continue;
                }
                for (int k = 0; k < 26; k++) {
                    int x = Collections.binarySearch(memo.get(k), i);
                    int y = Collections.binarySearch(memo.get(k), j - 1);
                    if (x < 0) {
                        x = -x - 1;
                    }
                    if (y < 0) {
                        y = -y - 2;
                    }
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = memo.get(k).get(x);
                        int my = memo.get(k).get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                }
                ans = ans % mod;
            }
        }
        ans = (ans + sum(dp) + mod - 1) % mod;
        System.out.println(ans);
    }

    public static long sum(long[][] arr) {
        long sum = 0;
        for (long[] row : arr) {
            for (long val : row) {
                sum += val;
            }
        }
        return sum;
    }
}