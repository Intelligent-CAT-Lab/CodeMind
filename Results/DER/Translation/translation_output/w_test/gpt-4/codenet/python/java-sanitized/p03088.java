import java.util.HashMap;
import java.util.Scanner;

public class p03088 {
    private static final int MOD = 1000000007;
    private static HashMap<String, Integer>[] memo;

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();

            if (i >= 1) {
                // Swap characters
                char temp = t[i - 1];
                t[i - 1] = t[i];
                t[i] = temp;
            }

            if (String.valueOf(t).contains("AGC")) {
                return false;
            }
        }

        return true;
    }

    public static int dfs(int cur, String last3, int N) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }

        if (cur == N) {
            return 1;
        }
        int ret = 0;

        for (char c : new char[]{'A', 'C', 'G', 'T'}) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, N)) % MOD;
            }
        }
        memo[cur].put(last3, ret);

        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        memo = new HashMap[N + 1];

        for (int i = 0; i <= N; i++) {
            memo[i] = new HashMap<>();
        }

        System.out.println(dfs(0, "TTT", N));
        scanner.close();
    }
}