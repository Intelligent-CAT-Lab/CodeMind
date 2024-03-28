import java.util.*;

public class p03392 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int l = a.length();
        if (l < 6) {
            Set<String> s = new HashSet<>();
            Queue<String> q = new LinkedList<>();
            q.add(a);
            s.add(a);
            int oa = (int) 'a';
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
        } else {
            String t = a.substring(0, 1).repeat(l);
            if (t.equals(a)) {
                System.out.println(1);
            } else {
                int x = 0;
                for (char c : a.toCharArray()) {
                    if (c == 'b') {
                        x += 1;
                    } else if (c == 'c') {
                        x += 2;
                    }
                }
                int ans = 0;
                if (a.chars().allMatch(i -> i != a.charAt(i + 1))) {
                    ans += 1;
                }
                int mod = 998244353;
                int[] dp = {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
                for (int i = 0; i < l - 1; i++) {
                    int s = (dp[dp.length - 1] + dp[dp.length - 2] + dp[dp.length - 3]) % mod;
                    dp = new int[]{
                            (dp[3] + dp[6]) % mod, (dp[4] + dp[7]) % mod, (dp[5] + dp[8]) % mod,
                            (dp[2] + dp[8]) % mod, (dp[0] + dp[6]) % mod, (dp[1] + dp[7]) % mod,
                            (dp[1] + dp[4]) % mod, (dp[2] + dp[5]) % mod, (dp[0] + dp[3]) % mod,
                            (dp[0] + dp[5] + dp[7] + s) % mod, (dp[1] + dp[3] + dp[8] + s) % mod,
                            (dp[2] + dp[4] + dp[6] + s) % mod};
                }
                System.out.println((ans + dp[9 + x % 3]) % mod);
            }
        }
    }
}