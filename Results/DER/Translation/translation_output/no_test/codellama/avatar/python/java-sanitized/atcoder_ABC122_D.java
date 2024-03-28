import java.util.Scanner;

public class atcoder_ABC122_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 1000000007;
        int[][] memo = new int[n + 1][4];
        System.out.println(dfs(0, "TTT", memo));
    }

    public static int dfs(int cur, String last3, int[][] memo) {
        if (memo[cur][last3] != 0) {
            return memo[cur][last3];
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (int i = 0; i < 4; i++) {
            if (ok(last3 + "ACGT"[i])) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + "ACGT"[i], memo)) % mod;
            }
        }
        memo[cur][last3] = ret;
        return ret;
    }

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            if (i >= 1) {
                char t = last4.charAt(i);
                last4.setCharAt(i, last4.charAt(i - 1));
                last4.setCharAt(i - 1, t);
            }
            if (last4.count("AGC") >= 1) {
                return false;
            }
        }
        return true;
    }
}