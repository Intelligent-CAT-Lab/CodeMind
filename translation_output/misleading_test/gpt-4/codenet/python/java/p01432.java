Here is the translated Java code:

```java
import java.io.*;
import java.util.*;

public class MatrixExponentiation {

    public static void mul(int n, double[][] A, double[][] B, double[][] C) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * A[k][j];
                }
            }
        }
    }

    public static double[] fastPow(int n, double[][] MA, double[] A, long k) {
        double[][] R = new double[n][n];
        while (k > 0) {
            if ((k & 1) != 0) {
                double[] temp = new double[n];
                for (int i = 0; i < n; i++) {
                    temp[i] = 0;
                    for (int j = 0; j < n; j++) {
                        temp[i] += MA[i][j] * A[j];
                    }
                }
                A = temp;
            }
            mul(n, MA, MA, R);
            double[][] T = MA;
            MA = R;
            R = T;
            k >>= 1;
        }
        return A;
    }

    public static void solve(BufferedReader reader, PrintWriter writer) throws IOException {
        StringTokenizer st = new StringTokenizer(reader.readLine());
        long S = Math.abs(Long.parseLong(st.nextToken()));
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        if (S == 0L) {
            writer.println("0");
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                writer.println("-1");
            } else {
                writer.printf("%.16f\n", (double) (S / K));
            }
            return;
        }
        int M = (int) (N * K);
        int[] dp = new int[M + 1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                for (int k = 1; k <= N && i >= k; k++) {
                    dp[i] += dp[i - k];
                }
            }
        }
        int s = Arrays.stream(dp).sum();
        double[][] mat = new double[M + 1][M + 2];
        mat[0][0] = 1;
        for (int i = 1; i <= M; i++) {
            for (int j = 0; j <= M; j++) {
                mat[i][Math.abs(i-j)] -= dp[j];
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
                if (k == i) continue;
                double e = mat[k][i];
                for (int j = 0; j <= M + 1; j++) {
                    mat[k][j] -= e * mat[i][j];
                }
            }
        }
        double[] C = new double[M+1];
        for (int i = 0; i <= M; i++) {
            C[M - i] = mat[i][M + 1];
        }
        C[M] = 1;
        if (S <= M) {
            writer.printf("%.16f\n", C[M - (int) S]);
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
        double[] C1 = fastPow(M + 1, mat2, C, S - M);
        writer.printf("%.16f\n", C1[0]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        solve(reader, writer);
        writer.flush();
    }
}
```

Please note that this translation considers the nuances of Java syntax and type handling. Also, in Java, there isn't a direct equivalent to Python's `sum` generator, so loops are used instead to calculate sums. The code requires reading input from `System.in` and writing output to `System.out`, performed by `BufferedReader` and `PrintWriter` respectively. Additionally, some optimizations may be needed for dealing with large numbers or high-performance requirements, as the Python version and Java version may handle these scenarios differently.
