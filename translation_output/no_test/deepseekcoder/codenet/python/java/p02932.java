<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static final long MOD = (long) Math.pow(10, 9) + 7;
    static long[] fact;
    static long[] fact_inv;
    static long[] comb;
    static long[] P;
    static long[] Q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int L = Integer.parseInt(input[2]);
        int R = Integer.parseInt(input[3]);

        int U = 6 * (int) Math.pow(10, 5) + 100;
        fact = new long[U + 1];
        fact_inv = new long[U + 1];
        comb = new long[U + 1];
        P = new long[R + 1];
        Q = new long[R + 1];

        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = (fact[n - 1] * n) % MOD;
        }

        fact_inv[U] = pow(fact[U], MOD - 2, MOD);
        for (int n = U; n > 0; n--) {
            fact_inv[n - 1] = (fact_inv[n] * n) % MOD;
        }

        U = N - M;
        for (int n = 0; n <= U; n++) {
            comb[n] = (fact[U] * fact_inv[n] % MOD * fact_inv[U - n]) % MOD;
        }

        for (int n = 1; n <= U; n += 2) {
            comb[n] = (comb[n] * -1) % MOD;
        }

        for (int n = M; n <= R; n++) {
            P[n] = (P[n - 1] + comb[n]) % MOD;
        }

        for (int n = N; n <= R + N; n++) {
            Q[n - N] = (fact[n] * fact_inv[n - N] % MOD * fact_inv[N]) % MOD;
        }

        long answer = (f(R) - f(L - 1) + MOD) % MOD;
        System.out.println(answer);
    }

    public static long pow(long a, long b, long m) {
        if (b == 0) {
            return 1;
        }
        long p = pow(a * a % MOD, b / 2, m);
        if (b % 2 == 1) {
            p = p * a % MOD;
        }
        return p;
    }

    public static long f(int R) {
        long total = (fact[R + N] * fact_inv[R] % MOD * fact_inv[N]) % MOD;
        long x = 0;
        for (int i = 0; i < R; i++) {
            x = (x + Q[i] * P[R - i]) % MOD;
        }
        long coef = (fact[N] * fact_inv[M] % MOD * fact_inv[N - M]) % MOD;
        return (total - x * coef % MOD + MOD) % MOD;
    }
}
```

This Java code does the same thing as your Python code. It calculates the number of ways to choose `M` elements from `N` elements, then calculates the sum of the products of the chosen elements and the remaining elements, and finally calculates the answer based on the range `L` to `R`.
<|EOT|>
