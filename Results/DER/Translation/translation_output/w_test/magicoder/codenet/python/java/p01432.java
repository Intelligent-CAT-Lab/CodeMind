<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 6 1

Expected output:
6.00000000


```
import sys
readline = sys.stdin.readline
write = sys.stdout.write

def mul(n, A, B, C):
    for i in range(n):
        for j in range(n):
            C[i][j] = sum(A[i][k] * A[k][j] for k in range(n))
def fast_pow(n, MA, A, k):
    R = [[0]*n for i in range(n)]
    while k:
        if k & 1:
            A = [sum(e*a for e, a in zip(MA[i], A)) for i in range(n)]
        mul(n, MA, MA, R)
        MA, R = R, MA
        k >>= 1
    return A

def solve():
    S, N, K = map(int, readline().split())
    S = abs(S)
    if S == 0:
        write("0\n")
        return
    if N == 1:
        if S % K:
            write("-1\n")
        else:
            write("%.16f\n" % (S // K))
        return
    M = N*K
    dp = [0]*(M+1)
    dp[0] = 1
    for t in range(K):
        for i in range(N*K, -1, -1):
            dp[i] = sum(dp[i-k] for k in range(1, N+1) if i >= k)
    s = sum(dp)
    mat = [[0]*(M+2) for i in range(M+1)]
    mat[0][0] = 1
    for i in range(1, M+1):
        mi = mat[i]
        for j in range(M+1):
            mi[abs(i-j)] -= dp[j]
        mi[i] += s
        for j in range(M+1):
            mi[j] /= s
        mi[M+1] = 1
    for i in range(M+1):
        v = mat[i][i]
        for j in range(M+2):
            mat[i][j] /= v
        for k in range(M+1):
            if k == i:
                continue
            e = mat[k][i]
            for j in range(M+2):
                mat[k][j] -= e * mat[i][j]
    C = [mat[i][M+1] for i in range(M, -1, -1)]
    C[-1] = 1
    if S <= M:
        write("%.16f\n" % C[M-S])
        return

    mat2 = [[0]*(M+1) for i in range(M+1)]
    for i in range(M):
        mat2[0][i] = dp[i+1] / s
    for i in range(M-1):
        mat2[i+1][i] = 1
    mat2[0][M] = mat2[M][M] = 1
    C1 = fast_pow(M+1, mat2, C, S-M)
    write("%.16f\n" % C1[0])
solve()

```

@@ Response
```java
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out);

    static void mul(int n, double[][] A, double[][] B, double[][] C) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    static double[][] fast_pow(int n, double[][] MA, double[] A, int k) {
        double[][] R = new double[n][n];
        while (k > 0) {
            if ((k & 1) == 1) {
                for (int i = 0; i < n; i++) {
                    A[i] = 0;
                    for (int j = 0; j < n; j++) {
                        A[i] += MA[i][j] * A[j];
                    }
                }
            }
            mul(n, MA, MA, R);
            double[][] temp = MA;
            MA = R;
            R = temp;
            k >>= 1;
        }
        return MA;
    }

    static void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Math.abs(Integer.parseInt(st.nextToken()));
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if (S == 0) {
            pw.println("0.00000000");
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                pw.println("-1");
            } else {
                pw.printf("%.8f\n", (double) S / K);
            }
            return;
        }
        int M = N * K;
        double[] dp = new double[M + 1];
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
        C[M] = 1;
        if (S <= M) {
            pw.printf("%.8f\n", C[M - S]);
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
        double[] C1 = fast_pow(M + 1, mat2, C, S - M)[0];
        pw.printf("%.8f\n", C1[0]);
    }

    public static void main(String[] args) throws IOException {
        solve();
        pw.close();
    }
}
```

Please note that the Java code is not exactly the same as the Python code. The main differences are:

1. Java does not have a built-in `readline` function like Python. So,
