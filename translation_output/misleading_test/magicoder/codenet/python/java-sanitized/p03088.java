import java.util.*;

public class p03088 {
    static int N, MOD;
    static Map<String, Integer>[] memo;

    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            StringBuilder t = new StringBuilder(last4);

            if (i >= 1) {
                char temp = t.charAt(i - 1);
                t.setCharAt(i - 1, t.charAt(i));
                t.setCharAt(i, temp);
            }

            if (t.toString().replace("AGC", "").length() < t.length()) {
                return false;
            }
        }

        return true;
    }

    static int dfs(int cur, String last3) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }

        if (cur == N) {
            return 1;
        }
        int ret = 0;

        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
            }
        }
        memo[cur].put(last3, ret);

        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        MOD = (int) Math.pow(10, 9) + 7;
        memo = new HashMap[N + 1];
        for (int i = 0; i <= N; i++) {
            memo[i] = new HashMap<>();
        }

        System.out.println(dfs(0, "TTT"));
    }
}