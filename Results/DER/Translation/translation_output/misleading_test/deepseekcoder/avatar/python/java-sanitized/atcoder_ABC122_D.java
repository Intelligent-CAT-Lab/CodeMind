import java.util.*;

public class atcoder_ABC122_D {
    static int mod = (int)Math.pow(10, 9) + 7;
    static Map<String, Integer>[] memo;
    static int n;

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            String[] t = last4.split("");
            if (i >= 1) {
                String temp = t[i];
                t[i] = t[i - 1];
                t[i - 1] = temp;
            }
            if (String.join("", t).replace(" ", "").contains("AGC"))
                return false;
        }
        return true;
    }

    public static int dfs(int cur, String last3) {
        if (memo[cur].containsKey(last3))
            return memo[cur].get(last3);
        if (cur == n)
            return 1;
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3.substring(1) + c))
                ret = (ret + dfs(cur + 1, last3.substring(1) + c)) % mod;
        }
        memo[cur].put(last3, ret);
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        memo = new HashMap[n + 1];
        for (int i = 0; i <= n; i++)
            memo[i] = new HashMap<>();
        System.out.println(dfs(0, "TTT"));
    }
}