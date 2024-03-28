<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
    static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] dp = new int[M + 1][N + 1];
        Arrays.fill(dp, 0);

        for (int i = 1; i <= M; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= N; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                dp[j][i] = (dp[j][i - 1] + dp[j - 1][i - 1]) % MOD;
            }
        }

        int ans = dp[M][N];
        ans %= MOD;

        System.out.println(ans);
    }
}
```</s>
