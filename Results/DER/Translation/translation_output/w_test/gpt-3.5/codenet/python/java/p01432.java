```java
import java.util.Scanner;

public class Main {

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
                System.out.printf("%.8f\n", (double) S / K);
            }
            return;
        }

        int M = N * K;
        double[] dp = new double[M + 1];
        dp[0] = 1;

        for (int t = 0; t < K; t++) {
            for (int i = N * K; i >= 0; i--) {
                for (int k = 1; k <= N; k++) {
                    if (i >= k) {
                        dp[i] += dp[i - k];
                    }
                }
            }
        }

        double s = 0;
        for (double value : dp) {
            s += value;
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
            System.out.printf("%.8f\n", C[M - S]);
            return;
        }

        double[][] mat2 = new double[M + 1][M + 2];
        for (int i = 0; i < M; i++) {
            mat2[0][i] = dp[i + 1] / s;
        }
        for (int i = 0; i < M - 1; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;

        double[] C1 = fastPow(M + 1, mat2, C, S - M);
        System.out.printf("%.8f\n", C1[0]);
    }

    private static double[] fastPow(int n, double[][] MA, double[] A, int k) {
        double[] R = new double[n];
        while (k > 0) {
            if ((k & 1) == 1) {
                double[] temp = new double[n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        temp[i] += MA[i][j] * A[j];
                    }
                }
                A = temp;
            }
            MA = mul(n, MA, MA);
            k >>= 1;
        }
        return A;
    }

    private static double[][] mul(int n, double[][] A, double[][] B) {
        double[][] C = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
}
```

