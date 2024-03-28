import java.util.Scanner;

public class p03088 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int MOD = 1000000007;
        int[][] memo = new int[N + 1][4];

        System.out.println(dfs(0, "TTT", memo));
    }

    private static int dfs(int cur, String last3, int[][] memo) {
        if (cur == N) {
            return 1;
        }

        if (memo[cur][last3.charAt(0) - 'A'] != 0) {
            return memo[cur][last3.charAt(0) - 'A'];
        }

        int ret = 0;
        for (int i = 0; i < 4; i++) {
            if (ok(last3 + (char) ('A' + i))) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + (char) ('A' + i), memo)) % MOD;
            }
        }

        memo[cur][last3.charAt(0) - 'A'] = ret;
        return ret;
    }

    private static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            if (last4.charAt(i) == 'A' && last4.charAt(i + 1) == 'G' && last4.charAt(i + 2) == 'C') {
                return false;
            }
        }
        return true;
    }
}