Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, M, L, R;
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        L = Integer.parseInt(input[2]);
        R = Integer.parseInt(input[3]);

        int MOD = (int) Math.pow(10, 9) + 7;

        int U = 6*100000 + 100;
        int[] fact = new int[U+1];
        fact[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = (fact[i-1] * i) % MOD;
        }
        int[] fact_inv = new int[U+1];
        fact_inv[U] = pow(fact[U], MOD-2, MOD);
        for (int i = U-1; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i+1] * (i+1)) % MOD;
        }

        int[][] comb = new int[N+1][N+1];
        for (int i = M; i <= N; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i][j] = (fact[i] * fact_inv[j] % MOD * fact_inv[i-j] % MOD) % MOD;
            }
        }

        int[] P = new int[R+1];
        for (int i = M; i <= R; i++) {
            for (int j = 0; j <= i; j++) {
                P[j] = (P[j] + comb[i][j]) % MOD;
            }
        }

        for (int i = M; i <= R; i++) {
            P[i] = (P[i] - P[i-M]) % MOD;
        }

        int[] Q = new int[R+1];
        for (int i = N; i <= N+R; i++) {
            Q[i-N] = (fact[i] * fact_inv[i-N] % MOD * fact_inv[N] % MOD) % MOD;
        }

        long answer = 0;
        for (int i = L; i <= R; i++) {
            long coef = (fact[N] * fact_inv[M] % MOD * fact_inv[N-M] % MOD) % MOD;
            long x = (Q[i-L] * P[i-L] % MOD) % MOD;
            answer = (answer + (fact[i-L+N] * fact_inv[i-L] % MOD * fact_inv[N] % MOD) % MOD - x*coef) % MOD;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    public static int pow(int a, int b, int mod) {
        int res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }
}
```<|endoftext|>
