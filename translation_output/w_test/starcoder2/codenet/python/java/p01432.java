

```java
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static int mul(int n, int[][] A, int[][] B, int[][] C) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return 0;
    }

    static int[][] fast_pow(int n, int[][] MA, int[][] A, int k) {
        int[][] R = new int[n][n];
        while (k > 0) {
            if ((k & 1) == 1) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        A[i][j] = 0;
                        for (int t = 0; t < n; t++) {
                            A[i][j] += MA[i][t] * A[t][j];
                        }
                    }
                }
            }
            mul(n, MA, MA, R);
            MA = R;
            k >>= 1;
        }
        return A;
    }

    static void solve() throws IOException {
        st = new StringTokenizer(br.readLine());
        int S = Math.abs(Integer.parseInt(st.nextToken()));
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if (S == 0) {
            out.println("0");
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                out.println("-1");
            } else {
                out.printf("%.16f\n", (double) S / K);
            }
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
        int s = 0;
        for (int i = 0; i <= M; i++) {
            s += dp[i];
        }
        int[][] mat = new int[M + 1][M + 2];
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
        int[] C = new int[M + 1];
        for (int i = M; i >= 0; i--) {
            C[M - i] = mat[i][M + 1];
        }
        C[M] = 1;
        if (S <= M) {
            out.printf("%.16f\n", (double) C[M - S]);
            return;
        }
        int[][] mat2 = new int[M + 1][M + 1];
        for (int i = 0; i < M; i++) {
            mat2[0][i] = dp[i + 1] / s;
        }
        for (int i = 0; i < M - 1; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;
        int[][] C1 = fast_pow(M + 1, mat2, C, S - M);
        out.printf("%.16f\n", (double) C1[0][0]);
    }

    public static void main(String[] args) throws IOException {
        solve();
        out.close();
    }
}
```

## 1000. 1000

### 题目描述

给定一个整数n，求n的阶乘的末尾有多少个0。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n的阶
