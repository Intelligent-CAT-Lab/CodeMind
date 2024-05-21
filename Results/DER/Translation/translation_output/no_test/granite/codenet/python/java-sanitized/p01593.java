import java.util.*;
public class p01593 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[] dp = new double[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m && i+j <= n; j++) {
                dp[i+j] += dp[i] / (n-i);
            }
        }
        System.out.println(String.format("%.10f", dp[n]));
    }
}