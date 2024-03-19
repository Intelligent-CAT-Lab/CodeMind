import java.util.Scanner;

public class atcoder_ABC122_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mod = 1000000007;
        int[][] memo = new int[n + 1][4];

        System.out.println(dfs(0, "TTT", memo));
    }

    private static int dfs(int cur, String last3, int[][] memo) {
        if (memo[cur][last3.charAt(0) - 'A'] != 0) {
            return memo[cur][last3.charAt(0) - 'A'];
        }

        if (cur == n) {
            return 1;
        }

        int ret = 0;
        for (int i = 0; i < 4; i++) {
            if (ok(last3 + (char) ('A' + i))) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + (char) ('A' + i), memo)) % mod;
            }
        }

        memo[cur][last3.charAt(0) - 'A'] = ret;
        return ret;
    }

    private static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            if (i >= 1 && last4.charAt(i) != last4.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}