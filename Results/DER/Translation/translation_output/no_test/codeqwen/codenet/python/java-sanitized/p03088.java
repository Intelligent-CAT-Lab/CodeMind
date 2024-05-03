import java.util.*;

public class p03088 {
    static int N, MOD = (int) (Math.pow(10, 9) + 7);
    static Map<Integer, Map<String, Integer>> memo = new HashMap<>();

    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            // reverse
            char[] t = last4.toCharArray();

            if (i >= 1) {
                // swap adjacent characters
                char temp = t[i - 1];
                t[i - 1] = t[i];
                t[i] = temp;
            }

            if (Arrays.toString(t).contains("AGC")) {
                return false;
            }
        }

        return true;
    }

    static int dfs(int cur, String last3) {
        // memoization
        if (memo.containsKey(cur) && memo.get(cur).containsKey(last3)) {
            return memo.get(cur).get(last3);
        }

        if (cur == N) {
            return 1;
        }
        int ret = 0;

        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                // ok condition
                // 1 plus the result of dfs with cur + 1 and last3 shifted
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % MOD;
            }
        }
        // memoization
        if (!memo.containsKey(cur)) {
            memo.put(cur, new HashMap<>());
        }
        memo.get(cur).put(last3, ret);

        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        System.out.println(dfs(0, "TTT"));
    }
}