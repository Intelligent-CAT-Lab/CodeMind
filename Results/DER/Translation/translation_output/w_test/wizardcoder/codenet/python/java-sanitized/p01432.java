import java.io.*;
import java.util.*;

public class p01432 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int S, N, K;
        String[] input = br.readLine().split(" ");
        S = Math.abs(Integer.parseInt(input[0]));
        N = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]);

        if (S == 0) {
            bw.write("0\n");
            bw.close();
            return;
        }

        if (N == 1) {
            if (S % K!= 0) {
                bw.write("-1\n");
            } else {
                bw.write(String.format("%.16f\n", (double) S / K));
            }
            bw.close();
            return;
        }

        int M = N * K;
        int[] dp = new int[M + 1];
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
            for (int j = 0; j <= M; j++) {
                mi[Math.abs(i - j)] -= dp[j];
            }
            mi[i] += s;
            for (int j = 0; j <= M; j++) {
                mi[j] /= s;
            }
            mi[M + 1] = 1;
        }

        double[] C = new double[M + 1];
        for (int i = M; i >= 0; i--) {
            C[i] = mat[i][M + 1];
        }

        if (S <= M) {
            bw.write(String.format("%.16f\n", C[M - S]));
            bw.close();
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
        double[] C1 = fast_pow(M + 1, mat2, C, S - M);
        bw.write(String.format("%.16f\n", C1[0]));
        bw.close();
    }

    public static double[] fast_pow(int n, double[][] mat, double[] vec, int k) {
        double[] res = new double[n];
        for (int i = 0; i < n; i++) {
            res[i] = vec[i];
        }
        while (k > 0) {
            if ((k & 1) == 1) {
                res = mul(n, mat, res);
            }
            mat = mul(n, mat, mat);
            k >>= 1;
        }
        return res;
    }

    public static double[] mul(int n, double[][] mat, double[] vec) {
        double[] res = new double[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i] += mat[i][j] * vec[j];
            }
        }
        return res;
    }
}