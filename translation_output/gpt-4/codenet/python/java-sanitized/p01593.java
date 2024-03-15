import java.util.Scanner;

public class p01593 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] dp = new double[1001];
        dp[0] = 1;

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i);
                j++;
            }
        }

        System.out.printf("%.10f\n", dp[n]);
        sc.close();
    }
}