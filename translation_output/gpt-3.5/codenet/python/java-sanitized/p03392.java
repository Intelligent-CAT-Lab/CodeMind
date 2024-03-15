import java.util.*;

public class p03392 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();
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
                    if (a.charAt(i) != a.charAt(i+1)) {
                        char t = (char) (oa + 3 - (int) (a.charAt(i) - oa) - (int) (a.charAt(i+1) - oa));
                        String na = a.substring(0, i) + String.valueOf(t) + String.valueOf(t) + a.substring(i+2);
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
            char c = a.charAt(i);
            if (c == 'b') {
                x += 1;
            } else if (c == 'c') {
                x += 2;
            }
        }

        int ans = 0;
        if (IntStream.range(0, l - 1).allMatch(i -> a.charAt(i) != a.charAt(i+1))) {
            ans += 1;
        }

        int mod = 998244353;
        int[] dp = {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
        for (int i = 0; i < l - 1; i++) {
            int s = (dp[11] + dp[10] + dp[9]) % mod;
            int[] nextDp = {
                (dp[3]+dp[6]) % mod, (dp[4]+dp[7]) % mod, (dp[5]+dp[8]) % mod,
                (dp[2]+dp[8]) % mod, (dp[0]+dp[6]) % mod, (dp[1]+dp[7]) % mod,
                (dp[1]+dp[4]) % mod, (dp[2]+dp[5]) % mod, (dp[0]+dp[3]) % mod,
                (dp[0]+dp[5]+dp[7]+s) % mod, (dp[1]+dp[3]+dp[8]+s) % mod, (dp[2]+dp[4]+dp[6]+s) % mod
            };
            dp = nextDp;
        }

        System.out.println((ans + dp[9+x%3]) % mod);
    }
}