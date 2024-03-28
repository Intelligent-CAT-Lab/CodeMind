import java.util.*;
public class p03392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        if (l < 6) {
            Set<String> set = new HashSet<>();
            set.add(s);
            Queue<String> q = new LinkedList<>();
            q.add(s);
            char[] ca = {'a', 'b', 'c'};
            while (!q.isEmpty()) {
                String a = q.poll();
                for (int i = 0; i < l - 1; i++) {
                    if (a.charAt(i)!= a.charAt(i + 1)) {
                        char t = ca[(ca.length - 1 - (a.charAt(i) - 'a') - (a.charAt(i + 1) - 'a')) % 3];
                        String na = a.substring(0, i) + t + t + a.substring(i + 2);
                        if (!set.contains(na)) {
                            set.add(na);
                            q.add(na);
                        }
                    }
                }
            }
            System.out.println(set.size());
            return;
        }
        String t = s.charAt(0) + s.substring(1, l);
        if (t.equals(s)) {
            System.out.println(1);
            return;
        }
        int x = 0;
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                x++;
            } else if (c == 'c') {
                x += 2;
            }
        }
        int ans = 0;
        if (s.substring(0, l - 1).equals(s.substring(1, l))) {
            ans++;
        }
        int mod = 998244353;
        int[] dp = new int[]{1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
        for (int i = 0; i < l - 1; i++) {
            int s = (dp[3] + dp[6]) % mod;
            dp = new int[]{(dp[3] + dp[6]) % mod, (dp[4] + dp[7]) % mod, (dp[5] + dp[8]) % mod, (dp[2] + dp[8]) % mod, (dp[0] + dp[6]) % mod, (dp[1] + dp[7]) % mod, (dp[1] + dp[4]) % mod, (dp[2] + dp[5]) % mod, (dp[0] + dp[3]) % mod, (dp[0] + dp[5] + dp[7] + s) % mod, (dp[1] + dp[3] + dp[8] + s) % mod, (dp[2] + dp[4] + dp[6] + s) % mod};
        }
        System.out.println((ans + dp[9 + x % 3]) % mod);
    }
}