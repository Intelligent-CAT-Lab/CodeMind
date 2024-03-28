import java.util.*;

public class p03392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().strip();
        int l = a.length();
        if (l < 6) {
            Set<String> s = new HashSet<>();
            s.add(a);
            Queue<String> q = new LinkedList<>();
            q.offer(a);
            int oa = 'a';
            while (!q.isEmpty()) {
                String t = q.poll();
                for (int i = 0; i < l - 1; i++) {
                    if (t.charAt(i)!= t.charAt(i+1)) {
                        char c = (char) (oa + 3 - (t.charAt(i) - oa) - (t.charAt(i+1) - oa));
                        String na = t.substring(0, i) + c + c + t.substring(i+2);
                        if (!s.contains(na)) {
                            s.add(na);
                            q.offer(na);
                        }
                    }
                }
            }
            System.out.println(s.size());
            return;
        }
        String t = a.charAt(0) + a.repeat(l-1);
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
        if (Arrays.stream(a.toCharArray()).allMatch(c -> c!= a.charAt(0))) {
            ans++;
        }
        int mod = 998244353;
        int[] dp = new int[]{1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
        for (int i = 0; i < l - 1; i++) {
            int s = (dp[3] + dp[6] + dp[9]) % mod;
            dp[0] = (dp[0] + dp[6]) % mod;
            dp[1] = (dp[1] + dp[7]) % mod;
            dp[2] = (dp[2] + dp[8]) % mod;
            dp[3] = (dp[3] + dp[9]) % mod;
            dp[4] = (dp[4] + dp[6]) % mod;
            dp[5] = (dp[5] + dp[7]) % mod;
            dp[6] = (dp[6] + dp[8]) % mod;
            dp[7] = (dp[7] + dp[9]) % mod;
            dp[8] = (dp[8] + dp[6]) % mod;
            dp[9] = (dp[9] + dp[7] + s) % mod;
            dp[10] = (dp[10] + dp[8] + s) % mod;
            dp[11] = (dp[11] + dp[9] + s) % mod;
        }
        System.out.println((ans + dp[9+x%3]) % mod);
    }
}