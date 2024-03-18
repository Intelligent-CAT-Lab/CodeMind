import java.util.Scanner;

public class p02960 {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int l = S.length();
        long[][] dp = new long[l + 1][13];
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
                    int num = Character.getNumericValue(s);
                    dp[i + 1][(j * 10 + num) % 13] += dp[i][j];
                    dp[i + 1][(j * 10 + num) % 13] %= MOD;
                }
            }
        }
        System.out.println(dp[l][5]);
        scanner.close();
    }
}