import java.io.*;
import java.util.Arrays;

public class p01432 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
        writer.flush();
    }

    public static void mul(int n, double[][] A, double[][] B, double[][] C) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    public static double[] fastPow(int n, double[][] MA, double[] A, int k) {
        double[][] R = new double[n][n];
        while (k > 0) {
            if ((k & 1) != 0) {
                double[] newA = new double[n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++)
                        newA[i] += MA[i][j] * A[j];
                }
                A = newA;
            }
            mul(n, MA, MA, R);
            double[][] temp = MA;
            MA = R;
            R = temp;
            k >>= 1;
        }
        return A;
    }

    public static void solve() throws IOException {
        String[] tokens = reader.readLine().split(" ");
        int S = Math.abs(Integer.parseInt(tokens[0]));
        int N = Integer.parseInt(tokens[1]);
        int K = Integer.parseInt(tokens[2]);

        if (S == 0) {
            writer.write("0\n");
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                writer.write("-1\n");
            } else {
                writer.write(String.format("%.8f\n", (double) S / K));
            }
            return;
        }

        int M = N * K;
        double[] dp = new double[M + 1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                for (int k = 1; k <= N && i >= k; k++) {
                    dp[i] += dp[i - k];
                }
            }
        }
        double s = Arrays.stream(dp).sum();
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
                if (k == i) continue;
                double e = mat[k][i];
                for (int j = 0; j <= M + 1; j++) {
                    mat[k][j] -= e * mat[i][j];
                }
            }
        }

        double[] C = new double[M + 1];
        for (int i = 0; i <= M; i++) {
            C[M - i] = mat[i][M + 1];
        }
        C[M] = 1;

        if (S <= M) {
            writer.write(String.format("%.8f\n", C[M - S]));
            return;
        }

        double[][] mat2 = new double[M + 1][M + 1];
        for (int i = 0; i <= M; i++) {
            Arrays.fill(mat2[i], 0);
        }
        for (int i = 0; i < M; i++) {
            mat2[0][i] = dp[i + 1] / s;
        }
        for (int i = 0; i < M - 1; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;

        double[] C1 = fastPow(M + 1, mat2, C, S - M);
        writer.write(String.format("%.8f\n", C1[0]));
    }
}