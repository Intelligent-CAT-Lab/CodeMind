<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5

Expected output:
352


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
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        long[] dp = new long[m + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            long[] dp2 = new long[m + 1];
            for (int j = 0; j < m; j++) {
                dp2[j + 1] = (dp2[j + 1] + dp[j] * j * (j + 1) % 1000000007) % 1000000007;
                dp2[j + 1] = (dp2[j + 1] + dp[j] * j * (j + 1) % 1000000007) % 1000000007;
            }
            dp = dp2;
        }
        System.out.println(dp[m]);
    }
}
```
'''
<|endoftext|>
