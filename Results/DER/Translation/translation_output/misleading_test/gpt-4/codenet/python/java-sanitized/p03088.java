import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03088 {
    static final int MOD = 1000000007;
    static Map<String, Integer>[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        memo = new HashMap[N + 1];
        for (int i = 0; i <= N; i++) {
            memo[i] = new HashMap<>();
        }

        System.out.println(dfs(N, 0, "TTT"));
    }

    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();

            if (i >= 1) {
                // Swap characters
                char temp = t[i - 1];
                t[i - 1] = t[i];
                t[i] = temp;
            }

            if (new String(t).contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    static int dfs(int N, int cur, String last3) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }

        if (cur == N) {
            return 1;
        }

        int ret = 0;
        for (char c : new char[]{'A', 'C', 'G', 'T'}) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(N, cur + 1, last3.substring(1) + c)) % MOD;
            }
        }
        memo[cur].put(last3, ret);

        return ret;
    }
}