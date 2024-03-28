import java.util.*;
import java.io.*;

public class p01995 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int l = s.length();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> alpha2 = new HashMap<>();
        for (int i = 0; i < alpha.length(); i++) {
            alpha2.put(alpha.charAt(i), i);
        }
        List<Integer>[] memo = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            memo[i] = new ArrayList<>();
        }
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
                    if (x < 0) {
                        x = -x - 1;
                    }
                    int y = Collections.binarySearch(memo[k], j - 1);
                    if (y < 0) {
                        y = -y - 2;
                    }
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = memo[k].get(x);
                        int my = memo[k].get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % 1000000007;
                    }
                }
                ans = ans % 1000000007;
            }
        }
        ans = (ans + Arrays.stream(dp).flatMapToInt(Arrays::stream).sum() + 1000000007 - 1) % 1000000007;
        System.out.println(ans);
    }
}