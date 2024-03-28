import java.util.Scanner;

public class p03291 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        long[][] dp = new long[n+1][4];
        dp[0][0] = 1;
        String[] string = {"A", "B", "C"};
        long num = (long) Math.pow(10, 9) + 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                long m = 0, b = 1;
                if (s.charAt(i) == '?') b = 3;
                if (j == 0) {
                    if (s.charAt(i) == '?') dp[i+1][j] = (dp[i][j] * 3) % num;
                    else dp[i+1][j] = (dp[i][j]) % num;
                    continue;
                }
                if (s.charAt(i) == string[j-1].charAt(0) || s.charAt(i) == '?') m = 1;
                dp[i+1][j] = (m*dp[i][j-1] + b*dp[i][j]) % num;
            }
        }
        System.out.println(dp[n][3]);
    }
}