System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        final int MOD = 100000007;
        int[] pow2 = new int[M + 10];
        int[] ipow2 = new int[M + 10];
        pow2[0] = 1;
        ipow2[0] = 1;
        int a = 2;
        for (int i = 1; i < M + 10; i++) {
            pow2[i] = (int) ((long) pow2[i - 1] * a % MOD);
            ipow2[i] = (int) ((long) ipow2[i - 1] * (a + 1) / 2 % MOD);
            a = (int) ((long) a * a % MOD);
        }

        int[] dp = new int[M + 1];
        for (int i = 0; i < M + 1; i++) {
            dp[i] = pow2[i];
        }
        for (int i = 0; i < N - 1; i++) {
            int[] next = new int[M + 1];
            for (int j = 1; j < M + 1; j++) {
                next[j] = (int) ((long) dp[j] * j % MOD);
            }
            for (int j = 1; j < M + 1; j++) {
                next[j] = (next[j] + next[j - 1]) % MOD;
            }
            for (int j = 1; j < M + 1; j++) {
                next[j] = (int) ((long) next[j] * pow2[M - j] % MOD);
            }
            for (int j = 1; j < M + 1; j++) {
                next[j] = (next[j] + dp[j - 1] * (j + 1)) % MOD;
            }
            dp = next;
        }

        System.out.println(dp[M]);
    }
}
```<|endoftext|>
