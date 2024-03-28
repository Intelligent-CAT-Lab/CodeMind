import java.util.HashMap;
import java.util.Scanner;

public class atcoder_ABC122_D {
    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();
            if (i >= 1) {
                char temp = t[i];
                t[i] = t[i - 1];
                t[i - 1] = temp;
            }
            if (String.valueOf(t).contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    static long dfs(int cur, String last3, int n, long[][] memo, int mod) {
        if (memo[cur][last3.length()] != 0) {
            return memo[cur][last3.length()];
        }
        if (cur == n) {
            return 1;
        }
        long ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, n, memo, mod)) % mod;
            }
        }
        memo[cur][last3.length()] = ret;
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mod = 1000000007;
        long[][] memo = new long[n + 1][4];
        System.out.println(dfs(0, "TTT", n, memo, mod));
    }
}