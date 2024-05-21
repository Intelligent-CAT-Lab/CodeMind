import java.util.Scanner;

public class p01432 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        S = Math.abs(S);
        if (S == 0) {
            System.out.println("0");
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                System.out.println("-1");
            } else {
                System.out.printf("%.16f\n", (double) S / K);
            }
            return;
        }
        int M = N * K;
        double[] dp = new double[M + 1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                dp[i] = 0;
                for (int k = 1; k <= N && i >= k; k++) {
                    dp[i] += dp[i - k];
                }
            }
        }
        double s = 0;
        for (double v : dp) {
            s += v;
        }
        double[][] mat = new double[M + 1][M + 2];
        mat[0][0] = 1;
        for (int i = 1; i <= M; i++) {
            double[] mi = mat[i];
            for (int j = 1; j <= M; j++) {
                mi[Math.abs(i - j)] -= dp[j] / s;
            }
            mi[i] += s;
            for (int j = 1; j <= M; j++) {
                mi[j] /= s;
            }
            mi[M + 1] = 1;
        }