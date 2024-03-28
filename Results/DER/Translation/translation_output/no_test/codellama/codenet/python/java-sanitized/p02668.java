import java.util.Scanner;
import java.util.Arrays;

public class p02668 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        long[] pow2 = new long[M + 10];
        long[] ipow2 = new long[M + 10];
        long[] dp = new long[M + 1];

        pow2[0] = 1;
        ipow2[0] = 1;
        for (int i = 1; i <= M; i++) {
            pow2[i] = pow2[i - 1] * 2 % 1000000007;
            ipow2[i] = (1000000007 + pow2[i - 1]) / 2;
        }

        dp[0] = 1;
        for (int i = 1; i <= N - 1; i++) {
            long[] B = Arrays.copyOf(dp, dp.length);
            long[] C = new long[M + 1];
            for (int j = 0; j < M; j++) {
                C[j] = dp[j] * (j + 1) % 1000000007 * ipow2[j] % 1000000007;
            }
            for (int j = 1; j < M; j++) {
                dp[j] = (dp[j - 1] + C[j - 1]) % 1000000007;
            }
            dp[0] = (dp[M - 1] + B[M - 1]) % 1000000007;
        }

        System.out.println(dp[M - 1]);
    }
}