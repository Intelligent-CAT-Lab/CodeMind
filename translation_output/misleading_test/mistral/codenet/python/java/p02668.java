<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5

Expected output:
384

```
import sys
import numpy as np

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

MOD = 10**9 + 7

N, M = map(int, read().split())

def make_power(a, L, MOD=MOD):
    B = L.bit_length()
    x = np.empty(1 << B, np.int64)
    x[0] = 1
    for n in range(B):
        x[1 << n:1 << (n + 1)] = x[:1 << n] * a % MOD
        a *= a
        a %= MOD
    x = x[:L]
    x.flags.writeable = False
    return x

pow2 = make_power(2, M + 10)
ipow2 = make_power((1 + MOD) // 2, M + 10)

def update(dp):
    B = dp.copy()
    C = dp * np.arange(M + 1) % MOD * ipow2[:M + 1] % MOD
    dp[1:] = np.cumsum(C[:-1]) % MOD
    dp[1:] *= pow2[:M]
    dp %= MOD
    dp += np.arange(1, M + 2) * B
    dp %= MOD

dp = pow2[:M + 1].copy()
for _ in range(N - 1):
    update(dp)

print(dp[-1])
```
[/INST]
```java
import java.util.*;

public class Main {
    final static int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        while (sc.hasNextInt()) {
            N = sc.nextInt();
            M = sc.nextInt();
            if (N == 0 || M == 0)
                continue;
            int[][] dp = new int[N + 1][M + 1];
            Arrays.fill(dp, 0);
            dp[1][0] = 1;
            for (int i = 2; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
                }
            }
            int ans = 0;
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    ans = (ans + dp[i][j] * (1 << j)) % MOD;
                }
            }
            System.out.println(ans);
        }
    }
}
```</s>
