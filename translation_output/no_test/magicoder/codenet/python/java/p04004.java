<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final long MOD = 1000000007;
    static final int U = 1000000;
    static long[] power2 = new long[U];
    static long[] power2_inv = new long[U];
    static long[] power3 = new long[U];
    static long[] power3_inv = new long[U];
    static long[] fact = new long[U];
    static long[] fact_inv = new long[U];
    static long[] x = new long[U];
    static long[] coef = new long[U];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        makePower(2, U, MOD);
        makePower(modPow(2, MOD - 2, MOD), U, MOD);
        makePower(3, U, MOD);
        makePower(modPow(3, MOD - 2, MOD), U, MOD);
        makeFact(U, MOD);

        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i - 1] + MOD - power2[i - 1] * power3_inv[K + i - 1] % MOD * fact[K + i - 1] % MOD * fact_inv[i - 1] % MOD * fact_inv[i] % MOD) % MOD;
        }

        for (int i = 0; i < M; i++) {
            coef[i] = fact[N + i] * fact_inv[i] % MOD * fact_inv[N] % MOD * power3[K + i] % MOD;
        }

        long answer = 0;
        for (int i = 0; i < M; i++) {
            answer = (answer + coef[i] * x[N + i] % MOD) % MOD;
        }

        System.out.println(answer);
    }

    static void makePower(long a, int L, long MOD) {
        int B = Integer.toBinaryString(L).length();
        long[] x = new long[1 << B];
        x[0] = 1;
        x[1] = a;
        for (int n = 0; n < B; n++) {
            for (int i = 1 << n; i < 1 << (n + 1); i++) {
                x[i] = x[i - 1] * (a * x[i - 1] % MOD) % MOD;
            }
        }
        if (a == 2) {
            System.arraycopy(x, 0, power2, 0, L);
        } else if (a == modPow(2, MOD - 2, MOD)) {
            System.arraycopy(x, 0, power2_inv, 0, L);
        } else if (a == 3) {
            System.arraycopy(x, 0, power3, 0, L);
        } else {
            System.arraycopy(x, 0, power3_inv, 0, L);
        }
    }

    static void makeFact(int U, long MOD) {
        fact[0] = 1;
        for (int i = 1; i < U; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        fact_inv[U - 1] = modPow(fact[U - 1], MOD - 2, MOD);
        for (int i = U - 2; i >= 0; i--) {
            fact_inv[i] = fact_inv[i + 1] * (i + 1) % MOD;
        }
    }

    static long modPow(long a, long b, long MOD) {
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

This Java code does the same thing as the Python code. It reads three integers N, M, and
