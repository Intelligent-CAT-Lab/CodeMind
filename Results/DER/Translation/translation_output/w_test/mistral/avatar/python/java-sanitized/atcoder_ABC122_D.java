import java.util.*;

public class atcoder_ABC122_D {
    static int n, mod;
    static Map<String, Integer> memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        mod = (int) Math.pow(10, 9) + 7;
        memo = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            memo.put(i, new HashMap<>());
        }
        System.out.println(dfs(0, "TTT"));
    }

    static int dfs(int cur, String last3) {
        if (last3.equals("TTT")) {
            return 1;
        }
        if (memo.containsKey(cur) && memo.get(cur).containsKey(last3)) {
            return memo.get(cur).get(last3);
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

    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();
            if (i >= 1) {
                t[i] = t[i - 1];
                t[i - 1] = t[i];
            }
            if (Arrays.toString(t).contains("AGC")) {
                return false;
            }
        }
        return true;
    }
}