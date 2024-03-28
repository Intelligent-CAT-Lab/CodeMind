import java.util.*;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][] memo = new int[n][1000];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }
        System.out.println(dfs(0, "TTT", memo, mod));
    }

    public static int dfs(int cur, String last3, int[][] memo, int mod) {
        if (memo[cur][last3.hashCode()]!= -1) {
            return memo[cur][last3.hashCode()];
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c = 'A'; c <= 'T'; c++) {
            if (ok(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, memo, mod)) % mod;
            }
        }
        memo[cur][last3.hashCode()] = ret;
        return ret;
    }

    public static boolean ok(String last4) {
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
}