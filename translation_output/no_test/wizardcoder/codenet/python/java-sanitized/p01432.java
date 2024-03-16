import java.io.*;
import java.util.*;

public class p01432 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int S, N, K;
        String[] line = br.readLine().split(" ");
        S = Math.abs(Integer.parseInt(line[0]));
        N = Integer.parseInt(line[1]);
        K = Integer.parseInt(line[2]);

        if (S == 0) {
            bw.write("0\n");
            bw.close();
            return;
        }

        if (N == 1) {
            if (S % K!= 0) {
                bw.write("-1\n");
            } else {
                bw.write((double) S / K + "\n");
            }
            bw.close();
            return;
        }

        int M = N * K;
        double[] dp = new double[M+1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                double sum = 0;
                for (int k = 1; k <= N; k++) {
                    if (i >= k) {
                        sum += dp[i-k];
                    }
                }
                dp[i] = sum;
            }
        }

        double s = 0;
        double[][] mat = new double[M+1][M+2];
        mat[0][0] = 1;
        for (int i = 1; i <= M; i++) {
            double[] mi = mat[i];
            for (int j = 0; j <= M; j++) {
                mi[Math.abs(i-j)] -= dp[j];
            }
            mi[i] += s;
            for (int j = 0; j <= M; j++) {
                mi[j] /= s;
            }
            mi[M+1] = 1;
        }

        double[] C = new double[M+1];
        for (int i = M; i >= 0; i--) {
            C[i] = mat[i][M+1];
        }
        C[M] = 1;

        if (S <= M) {
            bw.write(C[M-S] + "\n");
            bw.close();
            return;
        }

        double[][] mat2 = new double[M+1][M+1];
        for (int i = 0; i < M; i++) {
            mat2[0][i] = dp[i+1] / s;
        }
        for (int i = 0; i < M-1; i++) {
            mat2[i+1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;
        double[] C1 = fast_pow(M+1, mat2, C, S-M);
        bw.write(C1[0] + "\n");
        bw.close();
    }

    public static double[] fast_pow(int n, double[][] MA, double[] A, int k) {
        double[][] R = new double[n][n];
        while (k > 0) {
            if ((k & 1) == 1) {
                A = mul(n, MA, A);
            }
            mul(n, MA, MA, R);
            MA = R;
            k >>= 1;
        }
        return A;
    }

    public static double[] mul(int n, double[][] A, double[] B) {
        double[] C = new double[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i] += A[i][j] * B[j];
            }
        }
        return C;
    }
}