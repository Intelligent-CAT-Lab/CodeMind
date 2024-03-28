import java.util.Scanner;

public class p02339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i + 1][j + 1] = (j + 1) * dp[i][j] + dp[i][j + 1];
                dp[i + 1][j + 1] %= 1000000007;
            }
        }

        System.out.println(dp[n][k]);
    }
}