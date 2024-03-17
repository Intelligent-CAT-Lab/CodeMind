<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2 3 7

Expected output:
105


```
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10 ** 7)

import numpy as np

N,M,L,R = map(int,input().split())

MOD = 10 ** 9 + 7

U = 6*10**5 + 100
fact = [1] * (U+1)
for n in range(1,U+1):
    fact[n] = fact[n-1]*n%MOD
fact_inv = [1] * (U+1)
fact_inv[U] = pow(fact[U],MOD-2,MOD)
for n in range(U,0,-1):
    fact_inv[n-1] = fact_inv[n] * n % MOD

fact = np.array(fact,dtype=np.int64)
fact_inv = np.array(fact_inv,dtype=np.int64)


U = N - M
comb = fact[U] * fact_inv[:U+1] % MOD * fact_inv[U::-1] % MOD
comb[1::2] *= (-1)

P = np.zeros(R+1,dtype=np.int64)
for i,x in enumerate(comb,M):
    P[::i] += x


P[M:] -= P.copy()[:-M]
P %= MOD

# (1-x)^{N+1}ã§å²ã
Q = fact[N:N+R+1] * fact_inv[:R+1] % MOD * fact_inv[N] % MOD

def f(R):
    total = fact[R+N] * fact_inv[R] % MOD * fact_inv[N] % MOD
    x = (Q[R::-1] * P[:R+1] % MOD).sum() % MOD
    coef = fact[N] * fact_inv[M] % MOD * fact_inv[N-M] % MOD
    return (total - x*coef)%MOD

answer = (f(R) - f(L-1))%MOD
print(answer)

```
[/INST]

Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int MOD = 1000000007;

        BigInteger[] fact = new BigInteger[N + 1];
        BigInteger[] fact_inv = new BigInteger[N + 1];
        BigInteger[] comb = new BigInteger[N + 1];
        BigInteger[] P = new BigInteger[R + 1];
        BigInteger[] Q = new BigInteger[R + 1];

        fact[0] = BigInteger.ONE;
        fact_inv[0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            fact[n] = fact[n - 1].multiply(BigInteger.valueOf(n));
            fact_inv[n] = fact_inv[n - 1].multiply(BigInteger.valueOf(n)).mod(MOD);
        }

        for (int n = 0; n <= N; n++) {
            comb[n] = fact[n].multiply(fact_inv[n]).mod(MOD);
        }

        for (int i = M; i <= R; i++) {
            P[i] = comb[i].multiply(fact_inv[i]).mod(MOD);
        }

        for (int i = 0; i <= R; i++) {
            Q[i] = fact[i + N].multiply(fact_inv[i]).mod(MOD);
        }

        BigInteger total = fact[R + N].multiply(fact_inv[R]).mod(MOD).multiply(fact_inv[N]).mod(MOD);
        BigInteger x = Q[R].multiply(P[R]).mod(MOD);
        BigInteger coef = fact[N].multiply(fact_inv[M]).mod(MOD).multiply(fact_inv[N - M]).mod(MOD);
        BigInteger answer = (total.subtract(x.multiply(coef))).mod(MOD);

        System.out.println(answer);
    }
}
```
Note that this code uses the `BigInteger` class from the `java.math` package to handle large numbers, which is necessary for the modular arithmetic operations.</s>
