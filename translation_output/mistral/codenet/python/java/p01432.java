<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
    static int mul(int n, int[][] A, int[][] B, int[][] C) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    static int fast_pow(int n, int[][] MA, int[][] A, int k) {
        int[][] R = new int[n][n];
        while (k != 0) {
            if (k % 2 == 1) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        R[i][j] = 0;
                        for (int k = 0; k < n; k++) {
                            R[i][j] += MA[i][k] * A[k][j];
                        }
                    }
                }
            }
            int[][] tmp = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    tmp[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        tmp[i][j] += R[i][k] * A[k][j];
                    }
                }
            }
            R = tmp;
            MA = tmp;
            k >>= 1;
        }
        return R;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S, N, K;
        S = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();
        S = Math.abs(S);
        if (S == 0) {
            System.out.println(0);
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                System.out.println(-1);
            } else {
                System.out.printf("%.16f", (double) S / K);
            }
            return;
        }
        int M = N * K;
        int[][] dp = new int[M + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 1; i--) {
                dp[i] = 0;
                for (int j = 1; j <= N; j++) {
                    dp[i] += dp[i - j];
                }
            }
        }
        int sum = 0;
        for (int i = 0; i <= M; i++) {
            sum += dp[i];
        }
        int[][] mat = new int[M + 1][M + 2];
        mat[0][0] = 1;
        for (int i = 1; i <= M; i++) {
            int[] row = mat[i];
            for (int j = 0; j <= M; j++) {
                row[j] = 0;
                if (Math.abs(i - j) == 1) {
                    row[j] = dp[j];
                }
            }
            row[i] = sum - dp[i];
            for (int j = 0; j <= M; j++) {
                row[j] /= sum;
            }
            row[M + 1] = 1;
        }
        int[] C = new int[M];
        for (int i = M - 1; i >= 0; i--) {
            C[i] = mat[i][M + 1];
        }
        C[M] = 1;
        if (S <= M) {
            System.out.printf("%.16f", (double) C[M - S]);
            return;
        }
        int[][] mat2 = new int[M + 1][M];
        for (int i = 0; i <= M; i++) {
            mat2[0][i] = dp[i + 1] / sum;
        }
        for (int i = 1; i <= M - 1; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;
        int[][] C1 = fast_pow(M + 
