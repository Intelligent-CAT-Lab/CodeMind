<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    static int MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] pow2 = new int[M + 10];
        pow2[0] = 1;
        for (int i = 1; i <= M; i++) {
            pow2[i] = pow2[i - 1] * 2 % MOD;
        }

        int[] ipow2 = new int[M + 10];
        ipow2[0] = 1;
        for (int i = 1; i <= M; i++) {
            ipow2[i] = ipow2[i - 1] * (1 + MOD) % MOD;
            ipow2[i] = ipow2[i] * ipow2[i - 1] % MOD;
            ipow2[i] = ipow2[i] * ipow2[i - 1] % MOD;
        }

        int[] dp = new int[M + 10];
        dp[0] = 1;
        for (int i = 0; i < N - 1; i++) {
            int[] dp2 = new int[M + 10];
            for (int j = 0; j < M; j++) {
                dp2[j + 1] = (dp2[j + 1] + dp[j] * pow2[j] % MOD) % MOD;
                dp2[j + 1] = (dp2[j + 1] + dp[j] * j * ipow2[j] % MOD) % MOD;
            }
            dp = dp2;
        }

        System.out.println(dp[M]);
    }
}
```
'''
<|endoftext|>
