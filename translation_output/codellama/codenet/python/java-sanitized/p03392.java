import java.util.Scanner;
import java.util.Set;
import java.util.Queue;

public class p03392 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().strip();
        int length = input.length();
        if (length < 6) {
            Set<String> set = new HashSet<>();
            Queue<String> queue = new LinkedList<>();
            queue.add(input);
            int oa = 'a';
            while (!queue.isEmpty()) {
                String a = queue.poll();
                for (int i = 0; i < length - 1; i++) {
                    if (a.charAt(i) != a.charAt(i + 1)) {
                        char t = (char) (oa + 3 - (a.charAt(i) - oa) - (a.charAt(i + 1) - oa));
                        String na = a.substring(0, i) + t + a.substring(i + 2);
                        if (!set.contains(na)) {
                            set.add(na);
                            queue.add(na);
                        }
                    }
                }
            }
            System.out.println(set.size());
            return;
        }
        String t = input.charAt(0) + "";
        if (t.equals(input)) {
            System.out.println(1);
            return;
        }
        int x = 0;
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == 'b') {
                x++;
            } else if (input.charAt(i) == 'c') {
                x += 2;
            }
        }
        int ans = 0;
        if (all(input.charAt(i) != input.charAt(i + 1) for i in range(length - 1))) {
            ans++;
        }
        int mod = 998244353;
        int[] dp = new int[10];
        for (int i = 0; i < length - 1; i++) {
            int s = (dp[9] + dp[6] + dp[3]) % mod;
            dp = new int[] {
                (dp[3] + dp[6]) % mod,
                (dp[4] + dp[7]) % mod,
                (dp[5] + dp[8]) % mod,
                (dp[2] + dp[8]) % mod,
                (dp[0] + dp[6]) % mod,
                (dp[1] + dp[7]) % mod,
                (dp[1] + dp[4]) % mod,
                (dp[2] + dp[5]) % mod,
                (dp[0] + dp[3]) % mod,
                (dp[0] + dp[5] + dp[7] + s) % mod,
                (dp[1] + dp[3] + dp[8] + s) % mod,
                (dp[2] + dp[4] + dp[6] + s) % mod
            };
        }
        System.out.println((ans + dp[9 + x % 3]) % mod);
    }
}