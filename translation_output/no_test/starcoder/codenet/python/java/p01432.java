<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
    class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
        String next() {
            while (st == null ||!st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    void run() {
        FastReader in = new FastReader();
        int S = Math.abs(in.nextInt());
        int N = in.nextInt();
        int K = in.nextInt();
        if (S == 0) {
            System.out.println("0");
            return;
        }
        if (N == 1) {
            if (S % K!= 0) {
                System.out.println("-1");
            } else {
                System.out.println((double)S / K);
            }
            return;
        }
        int M = N * K;
        double[] dp = new double[M + 1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                dp[i] += dp[i - 1];
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
            System.out.println(C[M - S]);
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
        double[] C1 = new double[M + 1];
        for (int i = 0; i <= M; i++) {
            C1[i] = C[i];
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j <= M; j++) {
                C1[i] += mat2[i][j] * C[j];
            }
        }
        System.out.println(C1[0]);
    }
}
```
'''
<|endoftext|>
