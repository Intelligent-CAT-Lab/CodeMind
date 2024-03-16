import java.util.*;

public class p03088 {
    static int N = 0;
    static final int MOD = 1000000007;
    static List<Map<String, Integer>> memo = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            memo.add(new HashMap<>());
        }

        System.out.println(dfs(0, "TTT"));
    }

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();

            if (i >= 1) {
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
        if (memo.get(cur).containsKey(last3)) {
            return memo.get(cur).get(last3);
        }

        if (cur == N) {
            return 1;
        }
        int ret = 0;

        for (char c : new char[]{'A', 'C', 'G', 'T'}) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
            }
        }
        memo.get(cur).put(last3, ret);

        return ret;
    }
}