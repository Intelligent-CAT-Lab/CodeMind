import java.io.*;
import java.util.*;

public class p01432 {
    static StreamTokenizer in;
    static PrintWriter out;

    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    static String next() throws IOException {
        in.nextToken();
        return in.sval;
    }

    public static void main(String[] args) throws Exception {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);

        int S = nextInt();
        int N = nextInt();
        int K = nextInt();

        S = Math.abs(S);
        if (S == 0) {
            out.println(0);
            out.flush();
            return;
        }
        if (N == 1) {
            if (S % K == 0) {
                out.printf("%.16f%n", (double) S / K);
            } else {
                out.println(-1);
            }
            out.flush();
            return;
        }

        int M = N * K;
        int[] dp = new int[M + 1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                for (int k = 1; k <= N; k++) {
                    if (i - k >= 0) {
                        dp[i] += dp[i - k];
                    }
                }
            }
        }

        int s = 0;
        for (int i = 0; i <= M; i++) {
            s += dp[i];
        }

        double[][] mat = new double[M + 1][M + 2];
        mat[0][0] = 1;
        for (int i = 1; i <= M; i++) {
            for (int j = 0; j <= M; j++) {
                mat[i][Math.abs(i - j)] -= dp[j] / (double) s;
            }
            mat[i][i] += s;
            for (int j = 0; j <= M; j++) {
                mat[i][j] /= s;
            }
            mat[i][M + 1] = 1;
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
        for (int i = M; i >= 0; i--) {
            C[i] = mat[i][M + 1];
        }
        C[M] = 1;

        if (S <= M) {
            out.printf("%.16f%n", C[M - S]);
            out.flush();
            return;
        }

        double[][] mat2 = new double[M + 1][M + 1];
        for (int i = 0; i < M; i++) {
            mat2[0][i] = dp[i + 1] / (double) s;
        }
        for (int i = 0; i < M - 1; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;

        double[] C1 = new double[M + 1];
        pow(mat2, C, C1, S - M);
        out.printf("%.16f%n", C1[0]);
        out.flush();
    }

    static void pow(double[][] mat, double[] vec, double[] res, int k) {
        int n = mat.length;
        double[][] tmp = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tmp[i][j] = mat[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            res[i] = vec[i];
        }
        while (k > 0) {
            if (k % 2 == 1) {
                mul(res, tmp, n);
            }
            mul(tmp, tmp, n);
            k /= 2;
        }
    }

    static void mul(double[] res, double[][] mat, int n) {
        double[] tmp = new double[n];
        for (int i = 0; i < n; i++) {
            tmp[i] = 0;
            for (int j = 0; j < n; j++) {
                tmp[i] += res[j] * mat[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            res[i] = tmp[i];
        }
    }
}