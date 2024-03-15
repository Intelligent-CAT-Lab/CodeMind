import java.util.*;

public class p03088 {
    final static int MOD = (int) 1e9 + 7;
    final static int N = 100000;
    final static int[] memo = new int[N + 1];

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            // tã®åæå
            char[] t = last4.toCharArray();

            if (i > 0) {
                // æå­ã®åญ¥ãæ¿ã
                t[i - 1], t[i] = t[i], t[i - 1];
            }

            if (Arrays.toString(t).contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    public static int dfs(int cur, String last3) {
        // æ·±ãã¨ããããæ»ã£ã¦ããéç¨ã§
        // ä»ã¾ã§ã®last3 ã®ãã¿ã¼ã³ã¨åæ§ãªãåodiå©çuce
        if (last3.equals(memo[cur])) {
            return memo[cur];
        }

        if (cur == N) {
            return 1;
        }
        int ret = 0;

        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                // ok ã®å ´åatscount ãå¢ãã
                // 1åãããã¦ curãå¢ãã
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
            }
        }
        memo[cur] = ret;

        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(dfs(0, "TTT"));
    }
}