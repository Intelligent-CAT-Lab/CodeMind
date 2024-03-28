<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S, N, K;
        S = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();
        if (S == 0) {
            System.out.println("0");
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                System.out.println("-1");
            } else {
                System.out.printf("%.16f%n", (double) S / K);
            }
            return;
        }
        int M = N * K;
        int[] dp = new int[M + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 1; i--) {
                dp[i] = Arrays.stream(Arrays.range(1, N + 1))
                        .filter(j -> i >= j)
                        .mapToInt(j -> dp[i - j])
                        .sum();
            }
        }
        int s = Arrays.stream(dp).sum();
        int[][] mat = new int[M + 1][M + 2];
        mat[0][0] = 1;
        for (int i = 1; i < M + 1; i++) {
            int[] row = mat[i];
            for (int j = 0; j < M + 2; j++) {
                row[j] = (j == i) ? 0 : row[j - i];
            }
            row[i] = s - row[i];
            for (int j = 0; j < M + 2; j++) {
                row[j] /= s;
            }
            row[M + 1] = 1;
        }
        for (int i = 0; i < M; i++) {
            int v = mat[i][i];
            for (int j = 0; j < M + 2; j++) {
                mat[i][j] /= v;
            }
            for (int j = 0; j < M; j++) {
                int e = mat[j][i];
                for (int k = 0; k < M + 2; k++) {
                    mat[j][k] -= e * mat[i][k];
                }
            }
        }
        int[] C = new int[M];
        for (int i = M - 1; i >= 0; i--) {
            C[i] = mat[i][M + 1];
        }
        C[M] = 1;
        if (S <= M) {
            System.out.printf("%.16f%n", (double) C[M - S]);
            return;
        }
        int[][] mat2 = new int[M + 1][M + 1];
        for (int i = 0; i < M; i++) {
            mat2[0][i] = dp[i + 1] / s;
        }
        for (int i = 1; i < M; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;
        int[] C1 = fastPow(M + 1, mat2, C, S - M);
        System.out.printf("%.16f%n", (double) C1[0]);
    }

    public static int[] fastPow(int n, int[][] MA, int[] A, int k) {
        int[] R = new int[n];
        while (k != 0) {
            if (k % 2 == 1) {
                A = multiply(A, MA);
            }
            multiply(MA, MA, R);
            MA = R;
            k >>= 1;
        }
        return R;
    }

    public static int[] multiply(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

