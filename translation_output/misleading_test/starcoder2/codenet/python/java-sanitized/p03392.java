import java.util.*;
import java.io.*;

public class p03392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int l = a.length();
        if (l < 6) {
            Set<String> s = new HashSet<>();
            s.add(a);
            Queue<String> q = new LinkedList<>();
            q.add(a);
            int oa = 'a';
            while (!q.isEmpty()) {
                a = q.poll();
                for (int i = 0; i < l - 1; i++) {
                    if (a.charAt(i) != a.charAt(i + 1)) {
                        char t = (char) (oa + 3 - (a.charAt(i) - oa) - (a.charAt(i + 1) - oa));
                        String na = a.substring(0, i) + t + t + a.substring(i + 2);
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
        String t = a.substring(0, l);
        if (t.equals(a)) {
            System.out.println(1);
            return;
        }
        int x = 0;
        for (char c : a.toCharArray()) {
            if (c == 'b') {
                x++;
            } else if (c == 'c') {
                x += 2;
            }
        }
        int ans = 0;
        if (a.chars().distinct().count() == l) {
            ans++;
        }
        int mod = 998244353;
        int[] dp = {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
        for (int i = 0; i < l - 1; i++) {
            int s = (dp[10] + dp[11] + dp[12]) % mod;
            dp = new int[]{(dp[3] + dp[6]) % mod, (dp[4] + dp[7]) % mod, (dp[5] + dp[8]) % mod, (dp[2] + dp[8]) % mod, (dp[0] + dp[6]) % mod, (dp[1] + dp[7]) % mod, (dp[1] + dp[4]) % mod, (dp[2] + dp[5]) % mod, (dp[0] + dp[3]) % mod, (dp[0] + dp[5] + dp[7] + s) % mod, (dp[1] + dp[3] + dp[8] + s) % mod, (dp[2] + dp[4] + dp[6] + s) % mod};
        }
        System.out.println((ans + dp[9 + x % 3]) % mod);
    }
}