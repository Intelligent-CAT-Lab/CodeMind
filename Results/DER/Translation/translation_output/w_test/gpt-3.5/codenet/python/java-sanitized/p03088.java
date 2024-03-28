import java.util.*;

public class p03088 {
    static int MOD = 1_000_000_007;
    static Map<String, Integer>[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        memo = new HashMap[N + 1];

        for (int i = 0; i <= N; i++) {
            memo[i] = new HashMap<>();
        }

        System.out.println(dfs(0, "TTT"));
    }

    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();

            if (i >= 1) {
                char temp = t[i];
                t[i] = t[i - 1];
                t[i - 1] = temp;
            }

            if (new String(t).contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    static int dfs(int cur, String last3) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }

        if (cur == memo.length - 1) {
            return 1;
        }

        int ret = 0;
        String candidates = "ACGT";

        for (char c : candidates.toCharArray()) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
            }
        }
        memo[cur].put(last3, ret);

        return ret;
    }
}