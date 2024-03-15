import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atcoder_ABC122_D {
    private static final int MOD = 1000000007;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        Map<String, Integer>[] memo = new HashMap[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = new HashMap<>();
        }

        System.out.println(dfs(0, "TTT", n, memo));
    }

    private static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            StringBuilder t = new StringBuilder(last4);
            if (i >= 1) {
                char temp = t.charAt(i);
                t.setCharAt(i, t.charAt(i - 1));
                t.setCharAt(i - 1, temp);
            }
            if (t.toString().contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    private static int dfs(int cur, String last3, int n, Map<String, Integer>[] memo) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, n, memo)) % MOD;
            }
        }
        memo[cur].put(last3, ret);
        return ret;
    }
}