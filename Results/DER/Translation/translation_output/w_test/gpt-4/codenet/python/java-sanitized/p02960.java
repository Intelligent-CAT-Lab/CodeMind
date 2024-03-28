import java.util.Scanner;

public class p02960 {
    static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int l = S.length();
        int[][] dp = new int[l + 1][13];
        dp[0][0] = 1;

        for (int i = 0; i < l; i++) {
            char s = S.charAt(i);
            for (int j = 0; j < 13; j++) {
                if (s == '?') {
                    for (int k = 0; k < 10; k++) {
                        dp[i + 1][(j * 10 + k) % 13] += dp[i][j];
                        dp[i + 1][(j * 10 + k) % 13] %= MOD;
                    }
                } else {
                    dp[i + 1][(j * 10 + (s - '0')) % 13] += dp[i][j];
                    dp[i + 1][(j * 10 + (s - '0')) % 13] %= MOD;
                }
            }
        }
        System.out.println(dp[l][5]);
    }
}