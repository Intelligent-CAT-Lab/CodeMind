import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long M = 1_000_000_007;
        char[] s = scanner.next().toCharArray();
        long[][] dp = new long[s.length + 1][13];
        int[] map = {0, 4, 8, 12, 3, 7, 11, 2, 6, 10, 1, 5, 9};

        dp[0][0] = 1;

        for (int i = 1; i <= s.length; i++) {
            char ch = s[i - 1];
            for (int j = 0; j < 13; j++) {
                if (ch == '?') {
                    for (int k = 0; k < 10; k++) {
                        int l = j - k;
                        if (l < 0) {
                            l += 13;
                        }
                        dp[i][j] += dp[i - 1][map[l]];
                        if (dp[i][j] >= M) {
                            dp[i][j] -= M;
                        }
                    }
                } else {
                    int l = j - (ch - '0');
                    if (l < 0) {
                        l += 13;
                    }
                    dp[i][j] = dp[i - 1][map[l]];
                }
            }
        }

        System.out.println(dp[s.length][5]);
    }
}