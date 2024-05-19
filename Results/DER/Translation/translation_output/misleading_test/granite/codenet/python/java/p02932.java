System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int MOD = 100000007;
    static int MAX = 600000;
    static long[] fact = new long[MAX + 1];
    static long[] inv = new long[MAX + 1];
    static long[] finv = new long[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        fact[0] = fact[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }

        long[] comb = new long[N - M + 1];
        comb[0] = 1;
        for (int i = 1; i <= N - M; i++) {
            comb[i] = comb[i - 1] * (N - M + i) % MOD * inv[i] % MOD;
            if (i % 2 == 1) {
                comb[i] = -comb[i];
            }
        }

        long[] P = new long[R + 1];
        for (int i = M; i <= N; i++) {
            for (int j = i; j <= R; j += i) {
                P[j] += comb[i - M];
                if (P[j] >= MOD) {
                    P[j] -= MOD;
                }
            }
        }

        for (int i = 1; i <= R; i++) {
            P[i] += P[i - 1];
            if (P[i] >= MOD) {
                P[i] -= MOD;
            }
        }

        long[] Q = new long[R + 1];
        for (int i = 0; i <= R; i++) {
            Q[i] = fact[N + i] * finv[N] % MOD * finv[i] % MOD;
        }

        long ans = 0;
        for (int i = 0; i <= R; i++) {
            ans += Q[i] * P[R - i] % MOD;
            if (ans >= MOD) {
                ans -= MOD;
            }
        }

        long total = fact[N + R] * finv[N] % MOD * finv[R] % MOD;
        ans = (total - ans + MOD) % MOD;
        System.out.println(ans);
    }
}
```<|endoftext|>
