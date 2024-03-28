import java.util.Scanner;

public class p03088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = 1000000007;
        int[][] memo = new int[N + 1][4];

        String last3 = "TTT";
        int ret = 0;

        for (int i = 0; i < 4; i++) {
            if (ok(last3.charAt(i))) {
                ret = (ret + dfs(N, last3.substring(1) + last3.charAt(i))) % MOD;
            }
        }

        System.out.println(ret);
    }

    public static boolean ok(char last4) {
        for (int i = 0; i < 4; i++) {
            if (last4.charAt(i) == 'A' || last4.charAt(i) == 'G' || last4.charAt(i) == 'C') {
                return false;
            }
        }
        return true;
    }

    public static int dfs(int cur, String last3) {
        if (cur == N) {
            return 1;
        }
        int ret = 0;

        for (int i = 0; i < 4; i++) {
            if (ok(last3.charAt(i))) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + last3.charAt(i))) % MOD;
            }
        }

        return ret;
    }
}