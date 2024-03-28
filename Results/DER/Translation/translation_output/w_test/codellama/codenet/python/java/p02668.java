<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BigInteger[] pow2 = new BigInteger[M + 10];
        BigInteger[] ipow2 = new BigInteger[M + 10];
        BigInteger[] dp = new BigInteger[M + 1];
        BigInteger[] B = new BigInteger[M + 1];
        BigInteger[] C = new BigInteger[M + 1];
        BigInteger MOD = new BigInteger("1000000007");

        pow2[0] = BigInteger.ONE;
        ipow2[0] = BigInteger.ONE;
        for (int i = 1; i <= M; i++) {
            pow2[i] = pow2[i - 1].multiply(BigInteger.valueOf(2)).mod(MOD);
            ipow2[i] = ipow2[i - 1].multiply(BigInteger.valueOf((1 + MOD) / 2)).mod(MOD);
        }

        dp[0] = pow2[0];
        for (int i = 1; i <= M; i++) {
            B[i] = dp[i - 1];
            C[i] = dp[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD).multiply(ipow2[i]).mod(MOD);
            dp[i] = dp[i - 1].add(C[i]).mod(MOD);
        }

        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }

        System.out.println(dp[M]);
    }

    public static void update(BigInteger[] dp) {
        BigInteger[] B = new BigInteger[dp.length];
        BigInteger[] C = new BigInteger[dp.length];
        for (int i = 1; i < dp.length; i++) {
            B[i] = dp[i - 1];
            C[i] = dp[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD).multiply(ipow2[i]).mod(MOD);
            dp[i] = dp[i - 1].add(C[i]).mod(MOD);
        }
    }
}
```
This is the Java code for the given Python code. It uses the `BigInteger` class to handle large numbers and the `Scanner` class to read input from the user. The code first defines the `pow2` and `ipow2` arrays, which are used to calculate the powers of 2 and (1 + MOD) / 2, respectively. The `dp` array is then initialized with the values of `pow2` and the `update` function is called `N - 1` times to calculate the final result. Finally, the result is printed to the console.

Note that the `update` function is defined separately from the `main` function, and it is called with the `dp` array as an argument. This is because the `update` function is used multiple times in the `main` function, and it is more efficient to define it separately and call it multiple times rather than redefining it each time it is used.</s>
