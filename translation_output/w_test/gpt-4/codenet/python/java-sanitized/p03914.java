import java.util.Scanner;

public class p03914 {
    static final int mod = 1000000007;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        int[][] dp = new int[N + 1][N];

        dp[1][0] = 1;

        for (int i = 0; i < M; i++) {
            int[][] dp_new = new int[N + 1][N];

            for (int j = 0; j <= N; j++) {
                for (int k = 0; k < N; k++) {
                    dp_new[j][k] = (dp_new[j][k] + (int)(((long)dp[j][k] * k) % mod)) % mod;

                    if (k + 1 < N) {
                        dp_new[j][k + 1] = (dp_new[j][k + 1] + (int)(((long)dp[j][k] * (N - j - k)) % mod)) % mod;
                    }

                    if (j + k <= N) {
                        dp_new[j + k][0] = (dp_new[j + k][0] + (int)(((long)dp[j][k] * j) % mod)) % mod;
                    }
                }
            }

            dp = dp_new;
        }

        System.out.println(dp[N][0]);

        input.close();
    }
}