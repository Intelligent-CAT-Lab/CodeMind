import java.util.*;
import java.io.*;

public class p01432 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = sc.nextInt();
        int K = sc.nextInt();
        if (S == 0) {
            System.out.println("0");
            return;
        }
        if (N == 1) {
            if (S % K!= 0) {
                System.out.println("-1");
            } else {
                System.out.println((double)S / K);
            }
            return;
        }
        int M = N * K;
        double[] dp = new double[M + 1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                dp[i] = 0;
                for (int k = 1; k <= N; k++) {
                    if (i >= k) {
                        dp[i] += dp[i - k];
                    }
                }
            }
        }
        double s = 0;
        for (int i = 0; i <= M; i++) {
            s += dp[i];
        }
        double[][] mat = new double[M + 1][M + 2];
        mat[0][0] = 1;
        for (int i = 1; i <= M; i++) {
            double[] mi = mat[i];
            for (int j = 0; j <= M + 1; j++) {
                mi[Math.abs(i - j)] -= dp[j];
            }
            mi[i] += s;
            for (int j = 0; j <= M + 1; j++) {
                mi[j] /= s;
            }
            mi[M + 1] = 1;
        }
        double[] C = new double[M + 1];
        for (int i = M; i >= 0; i--) {
            C[i] = mat[i][M + 1];
        }
        C[M] = 1;
        if (S <= M) {
            System.out.println(C[M - S]);
            return;
        }
        double[][] mat2 = new double[M + 1][M + 1];
        for (int i = 0; i < M; i++) {
            mat2[0][i] = dp[i + 1] / s;
        }
        for (int i = 0; i < M - 1; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;
        double[] C1 = new double[M + 1];
        for (int i = 0; i <= M; i++) {
            C1[i] = 0;
            for (int j = 0; j <= M; j++) {
                C1[i] += mat2[i][j] * C[j];
            }
        }
        System.out.println(C1[0]);
    }
}