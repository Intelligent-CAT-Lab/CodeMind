<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer tokenizer = new StringTokenizer("");

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(in.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

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

    static double[][] fastPow(int n, double[][] MA, double[][] A, int k) {
        double[][] R = new double[n][n];
        while (k > 0) {
            if ((k & 1) == 1) {
                A = mul(n, MA, A, R);
            }
            mul(n, MA, MA, R);
            MA = R;
            R = new double[n][n];
            k >>= 1;
        }
        return A;
    }

    static void solve() throws IOException {
        int S = Math.abs(nextInt());
        int N = nextInt();
        int K = nextInt();
        if (S == 0) {
            out.println("0.00000000");
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                out.println("-1");
            } else {
                out.printf("%.8f\n", (double) S / K);
            }
            return;
        }
        int M = N * K;
        double[] dp = new double[M + 1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                dp[i] = 0;
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
            Arrays.fill(mi, 0);
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
            out.printf("%.8f\n", C[M - S]);
            return;
        }
        double[][] mat2 = new double[M + 1][M + 1
