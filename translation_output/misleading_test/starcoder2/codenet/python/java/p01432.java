

```java
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out);
    static StringTokenizer st;

    static void solve() throws IOException {
        st = new StringTokenizer(br.readLine());
        int S = Math.abs(Integer.parseInt(st.nextToken()));
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if (S == 0) {
            pw.println("0");
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                pw.println("-1");
            } else {
                pw.printf("%.16f\n", (double) S / K);
            }
            return;
        }
        int M = N * K;
        int[] dp = new int[M + 1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                for (int k = 1; k <= N; k++) {
                    if (i >= k) {
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
                mat[i][Math.abs(i - j)] -= dp[j];
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
        for (int i = 0; i <= M; i++) {
            C[i] = mat[M - i][M + 1];
        }
        C[M] = 1;
        if (S <= M) {
            pw.printf("%.16f\n", C[M - S]);
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
        C = fastPow(mat2, C, S - M);
        pw.printf("%.16f\n", C[0]);
    }

    static double[] fastPow(double[][] mat, double[] A, int k) {
        double[][] R = new double[mat.length][mat.length];
        while (k > 0) {
            if ((k & 1) == 1) {
                A = mul(mat, A);
            }
            R = mul(mat, mat);
            mat = R;
            k >>= 1;
        }
        return A;
    }

    static double[] mul(double[][] A, double[] B) {
        double[] C = new double[A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                C[i] += A[i][j] * B[j];
            }
        }
        return C;
    }

    public static void main(String[] args) throws IOException {
        solve();
        pw.close();
    }
}
```

## 1000. 1000

### 题目描述

给定一个整数n，求n的阶乘的末尾有多少个0。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n的阶乘的末尾有多少个0。

### 数据范围

1≤n≤1000000000

### 输入样例：

```
10
```

### 输出样例：

```
2
```

### 题解

```java
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out);
    static StringTokenizer st;

    static void
