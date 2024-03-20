Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().trim().split(" ")[0]);
        int M = Integer.parseInt(br.readLine().trim().split(" ")[1]);

        int MOD = (int) Math.pow(10, 9) + 7;

        int[] pow2 = new int[M + 10];
        pow2[0] = 1;
        for (int i = 1; i <= M; i++) {
            pow2[i] = (int) ((pow2[i - 1] * 2) % MOD);
        }

        int[] ipow2 = new int[M + 10];
        ipow2[0] = 1;
        for (int i = 1; i <= M; i++) {
            ipow2[i] = (int) ((ipow2[i - 1] * (1 + MOD) / 2) % MOD);
        }

        int[] dp = new int[M + 10];
        for (int i = 0; i <= M; i++) {
            dp[i] = pow2[i];
        }

        for (int i = 0; i < N - 1; i++) {
            update(dp, M, pow2, ipow2, MOD);
        }

        bw.write(dp[M] + "\n");

        bw.close();
        br.close();
    }

    public static void update(int[] dp, int M, int[] pow2, int[] ipow2, int MOD) {
        int[] B = Arrays.copyOf(dp, M + 10);
        int[] C = new int[M + 10];
        for (int i = 0; i <= M; i++) {
            C[i] = (int) ((dp[i] * i * ipow2[i]) % MOD);
        }
        for (int i = 1; i <= M; i++) {
            C[i] = (int) ((C[i] + C[i - 1]) % MOD);
        }
        for (int i = 1; i <= M; i++) {
            dp[i] = (int) ((C[i] * pow2[i - 1]) % MOD);
        }
        for (int i = 1; i <= M; i++) {
            dp[i] = (int) ((dp[i] + i * B[i]) % MOD);
        }
    }
}
```<|endoftext|>
