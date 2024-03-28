import java.util.Scanner;

public class p02979 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int M = scanner.nextInt();
        int L = (N+1)/2+1;

        if (K % 2 == 0) {
            System.out.println(even(N/2, K/2, M) * even((N+1)/2, K/2, M) % M);
        } else {
            System.out.println(odd(N, K, M));
        }
    }

    public static int even(int n, int k, int M) {
        int[][] dp = new int[n+1][k+1];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i+1][0] = (dp[i+1][0] + dp[i][j]) % M;
                if (j != k) {
                    dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j]) % M;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i <= k; i++) {
            sum = (sum + dp[n][i]) % M;
        }
        return sum;
    }

    public static int odd(int N, int K, int M) {
        int L = (N+1)/2+1;
        int[][][] dp0 = new int[L+1][L+1][L+1];
        dp0[0][0][L] = 1;

        for (int i = 0; i < N; i++) {
            int[][][] dp1 = new int[L+1][L+1][L+1];
            for (int x = 0; x <= L; x++) {
                for (int y = 0; y <= L; y++) {
                    if (loop(x, y, K