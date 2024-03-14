<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final long MOD = 1_000_000_007;
    static long[][] C, dp;
    static int U = 2010;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        init();
        System.out.println(main(N, K));
    }

    static void init() {
        C = new long[U][U];
        dp = new long[U][U];
        C[0][0] = 1;
        for (int n = 1; n < U; n++) {
            C[n] = java.util.Arrays.copyOf(C[n - 1], U);
            for (int i = 1; i < U - n; i++) {
                C[n][i] += C[n - 1][i - 1];
                C[n][i] %= MOD;
            }
        }
        dp[0][0] = 1;
        for (int n = 1; n < U; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m < U; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = U - 1; n > 0; n--) {
            dp[n] = java.util.Arrays.copyOf(dp[n - 1], U);
            dp[n][n] -= dp[n - 1][n];
            dp[n][n] %= MOD;
        }
    }

    static long main(int N, int K) {
        K -= 1;
        long ans = 0;
        if (K == N - 1) {
            for (int i = 0; i < N; i++) {
                ans += dp[i][N - 1];
                ans %= MOD;
            }
            return ans;
        }
        for (int r = N - K; r <= N; r++) {
            long x = C[r - 2][N - K - 2];
            int a = N - r;
            int b = K - a;
            if (b == 0) {
                x = x * (dp[a + 1][a] % MOD) % MOD;
            } else {
                long[] temp = new long[a + 2];
                for (int i = 1; i <= a + 1; i++) {
                    temp[i] = dp[i][a + 1];
                }
                for (int i = 0; i < b; i++) {
                    temp[a + i + 1] *= C[b - 1][b - 1 - i];
                    temp[a + i + 1] %= MOD;
                }
                x *= sum(temp, a + 1, a + b + 1);
                x %= MOD;
            }
            ans += x;
            ans %= MOD;
        }
        for (int i = 0; i < N - K - 2; i++) {
            ans = ans * 2 % MOD;
        }
        return ans % MOD;
    }

    static long sum(long[] arr, int start, int end) {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
            sum %= MOD;
        }
        return sum;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calls the `main` function with these integers as arguments, and prints the result. The `main` function calculates the number of ways to choose `K` elements from a set of `N` elements, taking into account the modulo operation. The `init` function initializes the `C` and `dp` arrays, which are used in the `main` function. The `sum` function calculates the sum of elements in a given range in the `dp` array.
<|EOT|>
