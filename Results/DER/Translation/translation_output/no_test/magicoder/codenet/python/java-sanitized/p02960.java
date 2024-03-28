import java.util.Scanner;

public class p02960 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int l = S.length();
        long mod = (long) Math.pow(10, 9) + 7;
        long[][] dp = new long[l + 1][13];
        dp[0][0] = 1;

        for (int i = 0; i < l; i++) {
            char s = S.charAt(i);
            for (int j = 0; j < 13; j++) {
                if (s == '?') {
                    for (int k = 0; k < 10; k++) {
                        dp[i + 1][((j * 10) + k) % 13] += dp[i][j];
                        dp[i + 1][((j * 10) + k) % 13] %= mod;
                    }
                } else {
                    dp[i + 1][((j * 10) + Character.getNumericValue(s)) % 13] += dp[i][j];
                    dp[i + 1][((j * 10) + Character.getNumericValue(s)) % 13] %= mod;
                }
            }
        }
        System.out.println(dp[l][5]);
    }
}