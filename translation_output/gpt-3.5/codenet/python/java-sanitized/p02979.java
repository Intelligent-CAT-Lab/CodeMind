import java.util.Scanner;

public class p02979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();

        int L = (N + 1) / 2 + 1;

        System.out.println(even(N / 2, K / 2, M) * even((N + 1) / 2, K / 2, M) % M);
    }

    public static int even(int n, int k, int M) {
        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i + 1][0] = (dp[i + 1][0] + dp[i][j]) % M;
                if (j != k) {
                    dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j]) % M;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i <= k; i++) {
            sum = (sum + dp[n][i]) % M;
        }

        return sum;
    }

    public static boolean loop(int x, int y, int K) {
        return (2 * x >= K + 1) && (2 * y >= K + 3);
    }
}