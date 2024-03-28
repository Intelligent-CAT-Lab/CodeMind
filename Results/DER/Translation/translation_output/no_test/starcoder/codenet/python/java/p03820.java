<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int MOD = 1_000_000_007;
        int U = 2010;
        long[][] C = new long[U][U];
        C[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int i = 0; i < U; i++) {
                C[n][i] += C[n - 1][i];
                C[n][i] %= MOD;
            }
            for (int i = 0; i < U; i++) {
                C[n][i] += C[n - 1][i - 1];
                C[n][i] %= MOD;
            }
        }
        long[][] dp = new long[N + 10][N + 10];
        dp[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m <= N; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = N; n >= 0; n--) {
            for (int m = 0; m <= n; m++) {
                dp[n][m] -= dp[n - 1][m];
                dp[n][m] %= MOD;
            }
        }
        long ans = 0;
        if (K == N - 1) {
            System.out.println(Arrays.stream(dp[0]).limit(N).sum() % MOD);
            return;
        }
        for (int r = N - K; r <= N; r++) {
            long x = C[r - 2][N - K - 2];
            int a = N - r;
            int b = K - a;
            if (b == 0) {
                x = x * (Arrays.stream(dp[0]).limit(a + 1).sum() % MOD) % MOD;
            } else {
                x *= (Arrays.stream(dp[1]).limit(a + 2).sum() * Arrays.stream(C[b - 1]).limit(a + b).map(i -> i == 0? 1 : i).reduce(1, (a, b) -> a * b) % MOD) % MOD;
            }
            ans += x;
        }
        ans %= MOD;
        for (int i = 0; i < N - K - 2; i++) {
            ans = ans * 2 % MOD;
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
