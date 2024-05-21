import java.util.*;

public class atcoder_ABC122_D {
    static int n, mod;
    static Map<Integer, Map<String, Integer>> memo;

    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();
            if (i >= 1) {
                char temp = t[i];
                t[i] = t[i - 1];
                t[i - 1] = temp;
            }
            if (new String(t).replaceAll("AGC", "").length() == 0) {
                return false;
            }
        }
        return true;
    }

    static int dfs(int cur, String last3) {
        if (memo.getOrDefault(cur, new HashMap<>()).containsKey(last3)) {
            return memo.get(cur).get(last3);
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % mod;
            }
        }
        memo.get(cur).put(last3, ret);
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        mod = (int) 1e9 + 7;
        memo = new HashMap<>();
        System.out.println(dfs(0, "TTT"));
    }
}