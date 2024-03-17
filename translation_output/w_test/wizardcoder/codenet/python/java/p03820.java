Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().trim());
        int K = Integer.parseInt(br.readLine().trim());

        int MOD = 1_000_000_007;

        int[][] C = new int[2011][2011];
        C[0][0] = 1;
        for (int i = 1; i <= 2010; i++) {
            for (int j = 0; j <= i; j++) {
                C[i][j] = (C[i - 1][j] + C[i - 1][j - 1]) % MOD;
            }
        }

        int[][] dp = new int[N + 10][N + 10];
        dp[0][0] = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
            }
        }

        for (int i = N; i >= 1; i--) {
            for (int j = i; j <= N; j++) {
                dp[i][j] -= dp[i - 1][j];
                dp[i][j] %= MOD;
            }
        }

        int ans = 0;
        if (K == N - 1) {
            ans = dp[N][N - 1];
        } else {
            for (int r = N - K; r <= N; r++) {
                int x = C[r - 2][N - K - 2];
                int a = N - r;
                int b = K - a;
                if (b == 0) {
                    x = x * dp[a][a] % MOD;
                } else {
                    int[] temp = new int[a + b];
                    for (int i = 0; i < a + b; i++) {
                        temp[i] = dp[i + 1][a + i];
                    }
                    for (int i = 0; i < a + b; i++) {
                        temp[i] = (temp[i] * C[b - 1 + i][b - 1]) % MOD;
                    }
                    Arrays.sort(temp);
                    for (int i = 0; i < a + b; i++) {
                        temp[i] = (temp[i] * C[b - 1][b - 1 - i]) % MOD;
                    }
                    Arrays.sort(temp);
                    for (int i = 0; i < a + b; i++) {
                        x = (x + temp[i]) % MOD;
                    }
                }
                ans = (ans + x) % MOD;
            }
        }

        ans = (ans * pow(2, N - K - 2, MOD)) % MOD;
        bw.write(ans + "\n");

        bw.close();
        br.close();
    }

    public static int pow(int a, int b, int mod) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}
```<|endoftext|>
