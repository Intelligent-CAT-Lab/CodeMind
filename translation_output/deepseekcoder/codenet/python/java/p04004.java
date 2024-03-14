<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

import numpy as np

N,M,K = map(int,read().split())

MOD = 10 ** 9 + 7

def cumprod(arr,MOD):
    L = len(arr); Lsq = int(L**.5+1)
    arr = np.resize(arr,Lsq**2).reshape(Lsq,Lsq)
    for n in range(1,Lsq):
        arr[:,n] *= arr[:,n-1]; arr[:,n] %= MOD
    for n in range(1,Lsq):
        arr[n] *= arr[n-1,-1]; arr[n] %= MOD
    return arr.ravel()[:L]

def make_fact(U,MOD):
    x = np.arange(U,dtype=np.int64); x[0] = 1
    fact = cumprod(x,MOD)
    x = np.arange(U,0,-1,dtype=np.int64); x[0] = pow(int(fact[-1]),MOD-2,MOD)
    fact_inv = cumprod(x,MOD)[::-1]
    return fact,fact_inv

def make_power(a,L,MOD):
    B = L.bit_length()
    x = np.empty(1 + (1<<B),np.int64)
    x[0] = 1; x[1] = a
    for n in range(B):
        x[1<<n:1<<(n+1)] = x[:1<<n] * (a * x[(1<<n)-1] % MOD) % MOD
    return x[:L]

U = 10 ** 6
power2 = make_power(2,U,MOD)
power2_inv = make_power(pow(2,MOD-2,MOD),U,MOD)
power3 = make_power(3,U,MOD)
power3_inv = make_power(pow(3,MOD-2,MOD),U,MOD)
fact,fact_inv = make_fact(U,MOD)

x = np.zeros(N+M,np.int64)
x[1:] = (-1) * power2[:N+M-1] * power3_inv[K+1:N+M+K] % MOD
x[1:] *= fact[K+1:N+M+K] * fact_inv[K] % MOD * fact_inv[1:N+M] % MOD
x %= MOD
x[0] = 3 * (1 - power3_inv[K+1]) % MOD * power2_inv[1] % MOD
np.cumsum(x, out=x); x %= MOD
x *= power3[:N+M] * power2_inv[:N+M] % MOD; x %= MOD

coef = fact[N-1:N+M] * fact_inv[:M+1] % MOD * fact_inv[N-1] % MOD
coef *= power3[K:K+M+1][::-1]; coef %= MOD
answer = (coef * x[N-1:N+M] % MOD).sum() % MOD
print(answer)
```

### Response:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final long MOD = (long) Math.pow(10, 9) + 7;
    static long[] fact, factInv;
    static long[] power2, power2Inv;
    static long[] power3, power3Inv;
    static int U = (int) Math.pow(10, 6);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        init();

        long[] x = new long[N + M + 1];
        x[1] = -1 * power2[N + M] * power3Inv[K + 1] % MOD;
        x[1] = x[1] * fact[K + 1] % MOD * factInv[K] % MOD * factInv[1] % MOD;
        x[1] %= MOD;

        for (int i = 2; i <= N + M; i++) {
            x[i] = x[i - 1] * (N + M - i + 2) % MOD * power2Inv[i - 1] % MOD;
            x[i] = x[i] * power3[i - 1] % MOD;
            x[i] %= MOD;
        }

        long coef = fact[N] * factInv[M] % MOD * factInv[N] % MOD;
        coef = coef * power3[K] % MOD;
        for (int i = 0; i < M; i++) {
            coef = coef * power2Inv[i + 1] % MOD;
        }
        coef %= MOD;

        long answer = 0;
        for (int i = N; i <= N + M; i++) {
            answer = (answer + coef * x[i] % MOD) % MOD;
        }

        System.out.println(answer);
    }

    static void init() {
        fact = new long[U + 1];
        factInv = new long[U + 1];
        power2 = new long[U + 1];
        power2Inv = new long[U + 1];
        power3 = new long[U + 1];
        power3Inv = new long[U + 1];

        fact[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        factInv[U] = pow(fact[U], MOD - 2);
        for (int i = U - 1; i >= 0; i--) {
            factInv[i] = factInv[i + 1] * (i + 1) % MOD;
        }

        power2[0] = 1;
        for (int i = 1; i <= U; i++) {
            power2[i] = power2[i - 1] * 2 % MOD;
        }

        power2Inv[U] = pow(power2[U], MOD - 2);
        for (int i = U - 1; i >= 0; i--) {
            power2Inv[i] = power2Inv[i + 1] * 2 % MOD;
        }

        power3[0] = 1;
        for (int i = 1; i <= U; i++) {
            power3[i] = power3[i - 1] * 3 % MOD;
        }

        power3Inv[U] = pow(power3[U], MOD - 2);
        for (int i = U - 1; i >= 0; i--) {
            power3Inv[i] = power3Inv[i + 1] * 3 % MOD;
        }
    }

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }
}
```
<|EOT|>
