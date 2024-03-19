import java.util.Scanner;

public class p01593 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        double[] dp = new double[1001];
        dp[1] = 1;

        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i + 1);
                j++;
            }
        }

        System.out.printf("%.10f", dp[n]);
    }
}