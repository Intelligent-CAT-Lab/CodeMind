<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BigInteger pow2 = BigInteger.ONE;
        BigInteger ipow2 = BigInteger.ONE;
        BigInteger[] dp = new BigInteger[M + 1];
        for (int i = 0; i <= M; i++) {
            dp[i] = pow2.multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(1000000007));
        }
        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }
        System.out.println(dp[M]);
    }

    public static void update(BigInteger[] dp) {
        BigInteger[] B = new BigInteger[dp.length];
        BigInteger[] C = new BigInteger[dp.length];
        for (int i = 0; i < dp.length; i++) {
            B[i] = dp[i].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(1000000007));
            C[i] = dp[i].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(1000000007));
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i].add(B[i - 1]).mod(BigInteger.valueOf(1000000007));
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i].multiply(pow2[i]).mod(BigInteger.valueOf(1000000007));
        }
    }
}
```
This is the Java code for the given Python code. The code uses the `BigInteger` class from the `java.math` package to handle large numbers. The `pow2` and `ipow2` variables are initialized to 1 and the `dp` array is initialized to the powers of 2 and the inverse of the powers of 2 modulo 1000000007. The `update` function is called `N - 1` times to update the `dp` array. Finally, the last element of the `dp` array is printed as the output.</s>
