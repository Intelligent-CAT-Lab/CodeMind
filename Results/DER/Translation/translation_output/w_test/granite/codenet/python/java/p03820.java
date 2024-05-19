System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
1


```
import sys
import numpy as np
import numba
from numba import njit, b1, i4, i8
from numba.types import Omitted

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

MOD = 1_000_000_007

@njit((i8, i8), cache=True)
def main(N, K):
    K -= 1
    U = 2010
    C = np.zeros((U, U), np.int64)
    C[0, 0] = 1
    for n in range(1, U):
        C[n] += C[n - 1]
        C[n, 1:] += C[n - 1, :-1]
        C[n] %= MOD

    dp = np.zeros((N + 10, N + 10), np.int64)
    dp[0, 0] = 1
    for n in range(1, N + 10):
        dp[n, n] = (dp[n - 1, n - 1] + dp[n - 1, n]) % MOD
        for m in range(n + 1, N + 10):
            dp[n, m] = (dp[n - 1, m] + dp[n, m - 1]) % MOD
    for n in range(N + 9, 0, -1):
        dp[n] -= dp[n - 1]
        dp[n] %= MOD
    ans = 0
    if K == N - 1:
        return dp[:N, N - 1].sum() % MOD
    for r in range(N - K, N + 1):
        x = C[r - 2, N - K - 2]
        a = N - r
        b = K - a
        if b == 0:
            x = x * (dp[:a + 1, a].sum() % MOD) % MOD
        else:
            x *= (dp[1:a + 2, a + 1] * C[b - 1:a + b, b - 1][::-1] %
                  MOD).sum() % MOD
            x %= MOD
        ans += x
    ans %= MOD
    for i in range(N - K - 2):
        ans = ans * 2 % MOD
    return ans % MOD

N, K = map(int, read().split())
print(main(N, K))

```


Answer:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1_000_000_007;
    static final int MAX = 2010;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[][] C = new long[MAX][MAX];
        C[0][0] = 1;
        for (int n = 1; n < MAX; n++) {
            C[n][0] = 1;
            for (int m = 1; m < MAX; m++) {
                C[n][m] = (C[n - 1][m] + C[n][m - 1]) % MOD;
            }
        }

        long[][] dp = new long[MAX][MAX];
        dp[0][0] = 1;
        for (int n = 1; n < MAX; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m < MAX; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = MAX - 1; n > 0; n--) {
            dp[n][n] = (dp[n][n] - dp[n - 1][n - 1] + MOD) % MOD;
        }

        long ans = 0;
        if (K == N - 1) {
            for (int n = 1; n < N; n++) {
                ans = (ans + dp[n][N - 1]) % MOD;
            }
        } else {
            for (int r = N - K; r <= N; r++) {
                long x = C[r - 2][N - K - 2];
                int a = N - r;
                int b = K - a;
                if (b == 0) {
                    x = x * (dp[0][a] + dp[1][a]) % MOD;
                } else {
                    for (int i = 1; i <= a; i++) {
                        dp[i][a] = (dp[i - 1][a] + dp[i][a - 1]) % MOD;
                    }
                    x *= (dp[1][a] * C[b - 1][a + b - 2] % MOD + dp[0][a] * C[b - 1][a + b - 1] % MOD) % MOD;
                    x %= MOD;
                }
                ans = (ans + x) % MOD;
            }
        }
        for (int i = 1; i <= N - K - 2; i++) {
            ans = ans * 2 % MOD;
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
