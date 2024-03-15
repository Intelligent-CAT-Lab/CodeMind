<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Scanner;
import org.jfree.math.BigInteger;

public class Main {
    private static final BigInteger MOD = BigInteger.valueOf(1_000_000_007);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        BigInteger[][] C = new BigInteger[2010][2010];
        C[0][0] = BigInteger.ONE;
        for (int n = 1; n < 2010; n++) {
            C[n] = C[n - 1].add(C[n - 1].shiftLeft(1));
            C[n] = C[n].mod(MOD);
        }

        BigInteger[][] dp = new BigInteger[N + 10][N + 10];
        dp[0][0] = BigInteger.ONE;
        for (int n = 1; n < N + 10; n++) {
            dp[n][n] = dp[n - 1][n - 1].add(dp[n - 1][n]);
            dp[n][n] = dp[n][n].mod(MOD);
            for (int m = n + 1; m < N + 10; m++) {
                dp[n][m] = dp[n][m].add(dp[n - 1][m - 1]);
                dp[n][m] = dp[n][m].mod(MOD);
            }
        }
        for (int n = N + 9; n >= 0; n--) {
            dp[n] = dp[n].subtract(dp[n + 1]);
            dp[n] = dp[n].mod(MOD);
        }

        BigInteger ans = BigInteger.ZERO;
        if (K == N - 1) {
            ans = dp[0, N - 1].sum();
        } else {
            for (int r = N - K; r < N + 1; r++) {
                BigInteger x = C[r - 2, N - K - 2];
                BigInteger a = BigInteger.valueOf(N - r);
                BigInteger b = BigInteger.valueOf(K - a);
                if (b.equals(BigInteger.ZERO)) {
                    x = x.multiply(dp[0, a].sum()).mod(MOD);
                } else {
                    BigInteger y = C[b - 1, a - 1].toBigInteger().multiply(dp[1, a + 1].add(dp[a + 1, 1]).shiftRight(1));
                    y = y.mod(MOD);
                    x = x.multiply(y).mod(MOD);
                }
                ans = ans.add(x);
            }
        }
        ans = ans.mod(MOD);
        for (int i = N - K - 2; i >= 0; i--) {
            ans = ans.shiftLeft(1).add(ans.mod(MOD));
        }
        System.out.println(ans);
    }
}
```</s>
