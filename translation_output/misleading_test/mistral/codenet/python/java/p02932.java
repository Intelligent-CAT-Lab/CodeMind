<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    final static int mod = (int) 1e9 + 7;
    final static int U = 6 * 1000000 + 100;
    static long fact[] = new long[U + 1];
    static long fact_inv[] = new long[U + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();

        Arrays.fill(fact, 1);
        for (int i = 1; i <= U; i++)
            fact[i] = fact[i - 1] * i % mod;

        Arrays.fill(fact_inv, 1);
        fact_inv[U] = pow(fact[U], mod - 2, mod);
        for (int i = U; i >= 1; i--)
            fact_inv[i - 1] = fact_inv[i] * i % mod;

        Arrays.copy(fact, fact_inv, U);

        long comb = fact[N - M] * fact_inv[0, U] % mod * fact_inv[N - M, U] % mod;
        for (int i = 1; i < N - M; i++)
            comb = comb * fact[i] % mod;
        for (int i = N - M; i >= 1; i--)
            comb = comb * fact_inv[i] % mod;

        long P[] = new long[R + 1];
        Arrays.fill(P, 0);
        for (int i = 0, x = comb; i <= R; i++) {
            P[i] += x;
            x %= mod;
        }

        Arrays.copy(P, P, R);
        for (int i = R + 1; i <= R + N; i++)
            P[i] -= P[i - R];
        P %= mod;

        long Q[] = new long[N + R];
        Arrays.fill(Q, 0);
        for (int i = 0; i <= N; i++)
            Q[i] = fact[i + R] * fact_inv[i] % mod * fact_inv[N] % mod;

        long total = 0;
        long x = 0;
        for (int i = N - 1; i >= 0; i--) {
            x = (Q[i + 1, U] * P[0, U] % mod).sum() % mod;
            total += fact[N] * fact_inv[M] % mod * fact_inv[N - M] % mod;
            total -= x * total;
        }

        System.out.println(total % mod);
    }
}
```</s>
