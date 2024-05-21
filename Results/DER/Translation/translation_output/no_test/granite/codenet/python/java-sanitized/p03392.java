import java.util.*;
import java.io.*;

public class p03392 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().trim();
        int l = a.length();
        if (l < 6) {
            Set<String> s = new HashSet<>();
            Queue<String> q = new LinkedList<>();
            s.add(a);
            q.add(a);
            int oa = (int)'a';
            while (!q.isEmpty()) {
                a = q.poll();
                for (int i = 0; i < l - 1; i++) {
                    if (a.charAt(i)!= a.charAt(i+1)) {
                        char t = (char)(oa + 3 - (a.charAt(i) - oa) - (a.charAt(i+1) - oa));
                        String na = a.substring(0, i) + t + t + a.substring(i+2);
                        if (!s.contains(na)) {
                            s.add(na);
                            q.add(na);
                        }
                    }
                }
            }
            System.out.println(s.size());
            return;
        }
        String t = String.valueOf(a.charAt(0)).repeat(l);
        if (t.equals(a)) {
            System.out.println(1);
            return;
        }
        int x = 0;
        for (int i = 0; i < l; i++) {
            if (a.charAt(i) == 'b') {
                x += 1;
            } else if (a.charAt(i) == 'c') {
                x += 2;
            }
        }
        int ans = 0;
        if (a.chars().distinct().count() == l) {
            ans += 1;
        }
        int mod = 998244353;
        int[] dp = new int[12];
        dp[0] = 1;
        dp[3] = 1;
        dp[6] = 1;
        for (int i = 1; i < l; i++) {
            int s = (dp[9] + dp[6] + dp[3]) % mod;
            dp[1] = (dp[1] + dp[4]) % mod;
            dp[2] = (dp[2] + dp[5]) % mod;
            dp[4] = (dp[4] + dp[7]) % mod;
            dp[5] = (dp[5] + dp[8]) % mod;
            dp[7] = (dp[7] + dp[1]) % mod;
            dp[8] = (dp[8] + dp[2]) % mod;
            dp[9] = s;
            dp[3] = (dp[3] + s) % mod;
            dp[6] = (dp[6] + s) % mod;
        }
        System.out.println((ans + dp[x%3+3]) % mod);
    }
}