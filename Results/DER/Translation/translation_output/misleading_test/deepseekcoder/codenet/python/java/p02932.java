<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2 3 7

Expected output:
122

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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;
import java.math.BigInteger;

public class Main {
    static final BigInteger MOD = BigInteger.valueOf(1_000_000_007);
    static final int U = 6*1000*1000 + 100;
    static BigInteger[] fact = new BigInteger[U+1];
    static BigInteger[] fact_inv = new BigInteger[U+1];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int L = in.nextInt();
        int R = in.nextInt();

        fact[0] = BigInteger.ONE;
        for (int n = 1; n <= U; ++n) {
            fact[n] = fact[n-1].multiply(BigInteger.valueOf(n)).mod(MOD);
        }

        fact_inv[U] = fact[U].modInverse(MOD);
        for (int n = U; n > 0; --n) {
            fact_inv[n-1] = fact_inv[n].multiply(BigInteger.valueOf(n)).mod(MOD);
        }

        BigInteger[] comb = new BigInteger[U+1];
        for (int i = 0; i <= U; ++i) {
            comb[i] = fact[i].multiply(fact_inv[i]).mod(MOD);
        }

        for (int i = 1; i <= U; i += 2) {
            comb[i] = comb[i].multiply(BigInteger.valueOf(-1)).mod(MOD);
        }

        BigInteger[] P = new BigInteger[R+1];
        for (int i = M, x = 0; i <= U; ++i) {
            P[x++ % (R+1)] = P[x++ % (R+1)].add(comb[i]).mod(MOD);
        }

        BigInteger[] Q = new BigInteger[R+1];
        Q[0] = fact[N].mod(MOD);
        for (int i = 1; i <= R; ++i) {
            Q[i] = Q[i-1].multiply(BigInteger.valueOf(N+i)).mod(MOD).multiply(fact_inv[i]).mod(MOD);
        }

        System.out.println(f(R).subtract(f(L-1)).mod(MOD));
    }

    static BigInteger f(int R) {
        BigInteger total = fact[R+N].multiply(fact_inv[R]).mod(MOD).multiply(fact_inv[N]).mod(MOD);
        BigInteger x = BigInteger.ZERO;
        for (int i = 0; i < R; ++i) {
            x = x.add(Q[i].multiply(P[i]).mod(MOD));
        }
        BigInteger coef = fact[N].mod(MOD);
        return total.subtract(x.multiply(coef)).mod(MOD);
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the standard input, calculates the factorial and inverse factorial of a large number, and then calculates the combination of these numbers. It then calculates a series of numbers using these combinations and a series of factorials, and finally calculates and prints the result of a function `f`.
<|EOT|>
