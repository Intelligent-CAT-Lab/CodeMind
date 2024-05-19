System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 6 1

Expected output:
-63.0441752311487

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


Answer:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static PrintWriter writer;

    static String nextToken() throws IOException {
        while (tokenizer == null ||!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    static void mul(int n, long[][] a, long[][] b, long[][] c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    static void fastPow(int n, long[][] a, long[] b, long k) {
        long[][] r = new long[n][n];
        long[][] ma = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ma[i][j] = a[i][j];
            }
        }
        while (k > 0) {
            if (k % 2 == 1) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        r[i][j] = 0;
                        for (int l = 0; l < n; l++) {
                            r[i][j] += ma[i][l] * b[l];
                        }
                    }
                }
                long[][] t = r;
                r = ma;
                ma = t;
            }
            mul(n, ma, ma, r);
            long[][] t = r;
            r = ma;
            ma = t;
            k /= 2;
        }
        for (int i = 0; i < n; i++) {
            b[i] = r[i][0];
        }
    }

    static void solve() throws IOException {
        long s = nextLong();
        int n = nextInt();
        int k = nextInt();
        s = Math.abs(s);
        if (s == 0) {
            writer.println(0);
            return;
        }
        if (n == 1) {
            if (s % k!= 0) {
                writer.println(-1);
            } else {
                writer.println(s / k);
            }
            return;
        }
        int m = n * k;
        long[] dp = new long[m + 1];
        dp[0] = 1;
        for (int t = 0; t < k; t++) {
            for (int i = m; i >= 0; i--) {
                for (int j = 1; j <= n; j++) {
                    if (i - j >= 0) {
                        dp[i] += dp[i - j];
                    }
                }
            }
        }
        long sum = 0;
        for (int i = 0; i <= m; i++) {
            sum += dp[i];
        }
        long[][] mat = new long[m + 1][m + 2];
        mat[0][0] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j <= m; j++) {
                mat[i][Math.abs(i - j)] -= dp[j];
            }
            mat[i][i] += sum;
            for (int j = 0; j <= m; j++) {
                mat[i][j] /= sum;
            }
            mat[i][m + 1] = 1;
        }
        for (int i = 0; i <= m; i++) {
            long v = mat[i][i];
            for (int j = 0; j <= m + 1; j++) {
                mat[i][j] /= v;
            }
            for (int k = 0; k <= m; k++) {
                if (k == i) {
                    continue;
                }
                long e = mat[k][i];
                for (int j = 0; j <= m + 1; j++) {
                    mat[k][j] -= e * mat[i][j];
                }
            }
        }
        long[] c = new long[m + 1];
        for (int i = m; i >= 0; i--) {
            c[i] = mat[i][m + 1];
        }
        c[m] = 1;
        if (s <= m) {
            writer.println(c[m - (int) s]);
            return;
        }
        long[][] mat2 = new long[m + 1][m + 1];
        for (int i = 0; i < m; i++) {
            mat2[0][i] = dp[i + 1];
        }
        for (int i = 0; i < m - 1; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][m] = mat2[m][m] = 1;
        long[] c1 = new long[m + 1];
        fastPow(m + 1, mat2, c1, s - m);
        writer.println(c1[0]);
    }

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = null;
        writer = new PrintWriter(System.out);
        solve();
        reader.close();
        writer.close();
    }
}<|endoftext|>
