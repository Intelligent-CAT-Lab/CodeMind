import java.util.*;

public class atcoder_ABC122_D {
    static int n;
    static int mod = (int) Math.pow(10, 9) + 7;
    static Map<String, Integer>[] memo;

    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            StringBuilder t = new StringBuilder(last4);
            if (i >= 1) {
                char temp = t.charAt(i);
                t.setCharAt(i, t.charAt(i - 1));
                t.setCharAt(i - 1, temp);
            }
            if (Collections.frequency(Arrays.asList(t.toString().split("")), "A") +
                    Collections.frequency(Arrays.asList(t.toString().split("")), "C") +
                    Collections.frequency(Arrays.asList(t.toString().split("")), "G") >= 1) {
                return false;
            }
        }
        return true;
    }

    static int dfs(int cur, String last3) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c : "ACGT ".toCharArray()) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % mod;
            }
        }
        memo[cur].put(last3, ret);
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        memo = new HashMap[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = new HashMap<>();
        }
        System.out.println(dfs(0, "TTT"));
    }
}