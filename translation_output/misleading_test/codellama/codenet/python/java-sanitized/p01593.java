public class p01593 {
    public static void main(String[] args) {
        int n = 2;
        int m = 1;
        double[] dp = new double[1001];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i);
                j++;
            }
        }
        System.out.println(String.format("%.10f", dp[n]));
    }
}