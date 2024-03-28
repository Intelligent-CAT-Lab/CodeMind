Here's the given Python code translated into Java:

```java
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    private static void mul(int n, double[][] A, double[][] B, double[][] C) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
    }

    private static double[] fast_pow(int n, double[][] MA, double[] A, int k) {
        double[][] R = new double[n][n];
        double[] newA = new double[n];
        while (k > 0) {
            if ((k & 1) != 0) {
                for (int i = 0; i < n; i++) {
                    double sum = 0;
                    for (int j = 0; j < n; j++) {
                        sum += MA[i][j] * A[j];
                    }
                    newA[i] = sum;
                }
                A = newA.clone();
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
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        S = Math.abs(S);

        if (S == 0) {
            writer.write("0.0000000000000000\n");
            return;
        }
        if (N == 1) {
            if (S % K > 0) {
                writer.write("-1\n");
            } else {
                writer.write(String.format("%.16f\n", (double) S / K));
            }
            return;
        }

        int M = N * K;
        double[] dp = new double[M+1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                dp[i] = 0;
                for (int k = 1; k <= N; k++) {
                    if (i >= k) dp[i] += dp[i - k];
                }
            }
        }
        double s = Arrays.stream(dp).sum();

        double[][] mat = new double[M + 1][M + 2];
        for (int i = 0; i <= M; i++) {
            Arrays.fill(mat[i], 0);
            mat[i][M + 1] = 1;
        }
        mat[0][0] = 1;
        for (int i = 1; i <= M; i++) {
            for (int j = 0; j <= M; j++) {
                mat[i][Math.abs(i - j)] -= dp[j];
            }
            mat[i][i] += s;
            // Normalize the row.
            for (int j = 0; j <= M+1; j++) {
                mat[i][j] /= s;
            }
        }

        // Gaussian elimination
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
        for (int i = M; i >= 0; i--) {
            C[i] = mat[M - i][M + 1];
        }
        C[M] = 1;

        if (S <= M) {
            writer.write(String.format("%.16f\n", C[M - S]));
            return;
        }

        double[][] mat2 = new double[M + 1][M + 1];
        for (int i = 0; i < M; i++) {
            Arrays.fill(mat2[i], 0);
            mat2[0][i] = dp[i + 1] / s;
        }
        mat2[M][M] = mat2[0][M] = 1;
        for (int i = 1; i < M; i++) {
            mat2[i][i - 1] = 1;
        }

        double[] C1 = fast_pow(M + 1, mat2, C, S - M);
        writer.write(String.format("%.16f\n", C1[0]));
    }

    public static void main(String[] args) throws IOException {
        solve();
        writer.flush();
    }
}
```

I have adapted the code to Java narrowing the variable types and using Java's I/O classes. Note that in Java, numeric types must be declared with a precise type (e.g. `int`, `double`). Unlike Python, Java doesn't have a built-in `sum` function for arrays or other collections, so I used a manual `for` loop to compute the sums. Floating-point division `/` in Java is not integer division like in Python, so there is no need for explicit float conversion. Also, I kept the `BufferedReader` and `BufferedWriter` setup for reading inputs and writing outputs in a similar fashion to the original Python code. The formatted printing `% .16f` in Java produces output similar to the Python equivalent.
