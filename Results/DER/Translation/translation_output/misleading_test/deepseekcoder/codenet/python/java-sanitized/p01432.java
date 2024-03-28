import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p01432 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int S = Math.abs(Integer.parseInt(input[0]));
        int N = Integer.parseInt(input[1]);
        int K = Integer.parseInt(input[2]);
        if (S == 0) {
            System.out.println(0);
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                System.out.println(-1);
            } else {
                System.out.printf("%.16f\n", (double) S / K);
            }
            return;
        }
        int M = N * K;
        long[] dp = new long[M + 1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                dp[i] = Arrays.stream(dp, Math.max(0, i - N), Math.min(M + 1, i + N)).sum();
            }
        }
        long s = Arrays.stream(dp).sum();
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
        for (int i = 0; i <= M; i++) {
            double v = mat[i][i];
            for (int j = 0; j <= M + 1; j++) {
                mat[i][j] /= v;
            }
            for (int k = 0; k <= M; k++) {
                if (k == i) {
                    continue;
                }
                double e = mat[k][i];
                for (int j = 0; j <= M + 1; j++) {
                    mat[k][j] -= e * mat[i][j];
                }
            }
        }
        double[] C = new double[M + 1];
        C[M] = 1;
        if (S <= M) {
            System.out.printf("%.16f\n", C[M - S]);
            return;
        }
        double[][] mat2 = new double[M + 1][M + 1];
        for (int i = 0; i < M; i++) {
            mat2[0][i] = (double) dp[i + 1] / s;
        }
        for (int i = 0; i < M - 1; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;
        double[] C1 = fastPow(M + 1, mat2, C, S - M);
        System.out.printf("%.16f\n", C1[0]);
    }

    private static double[] fastPow(int n, double[][] MA, double[] A, int k) {
        double[][] R = new double[n][n];
        while (k > 0) {
            if ((k & 1) != 0) {
                A = multiply(MA, A, n);
            }
            R = multiply(MA, MA, n);
            MA = R;
            k >>= 1;
        }
        return A;
    }

    private static double[] multiply(double[][] MA, double[] A, int n) {
        double[] C = new double[n];
        for (int i = 0; i < n; i++) {
            C[i] = Arrays.stream(MA[i]).map(a -> a * A[i]).sum();
        }
        return C;
    }
}