import java.util.*;

public class p03088 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int MOD = 1000000007;
        int[][] memo = new int[N + 1][4];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < 4; j++) {
                memo[i][j] = -1;
            }
        }

        int dfs(int cur, String last3) {
            if (memo[cur][last3.charAt(0) - 'A']!= -1) {
                return memo[cur][last3.charAt(0) - 'A'];
            }
            if (cur == N) {
                return 1;
            }
            int ret = 0;
            for (char c = 'A'; c <= 'D'; c++) {
                if (ok(last3 + c)) {
                    ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
                }
            }
            memo[cur][last3.charAt(0) - 'A'] = ret;
            return ret;
        }

        int ok(String last4) {
            for (int i = 0; i < 4; i++) {
                // tã®åæå
                char[] t = last4.toCharArray();
                if (i >= 1) {
                    // æå­ã®å
¥ãæ¿ã
                    char tmp = t[i - 1];
                    t[i - 1] = t[i];
                    t[i] = tmp;
                }
                if (new String(t).contains("AGC")) {
                    return false;
                }
            }
            return true;
        }

        System.out.println(dfs(0, "TTT"));
    }
}