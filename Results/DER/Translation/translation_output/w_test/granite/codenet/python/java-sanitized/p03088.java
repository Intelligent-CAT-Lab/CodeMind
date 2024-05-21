import java.util.*;

public class p03088 {
    static int N, MOD = 100000007;
    static Map<String, Integer>[][] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        memo = new HashMap[N + 1][4];

        System.out.println(dfs(0, "TTT"));
        sc.close();
    }

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            // tã®åæå
            char[] t = last4.toCharArray();

            if (i >= 1) {
                // æå­ã®å¥ãæ¿ã
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

    public static int dfs(int cur, String last3) {
        // æ·±ãã¨ããããæ»ã£ã¦ããéç¨ã§
        // ä»ã¾ã§ã®last3 ã®ãã¿ã¼ã³ã¨åæ§ãªãåå©ç¨
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }

        if (cur == N) {
            return 1;
        }
        int ret = 0;

        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                // ok ã®å ´åcount ãå¢ãã
                // 1åãããã¦ curãå¢ãã
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
            }
        }
        memo[cur].put(last3, ret);

        return ret;
    }
}