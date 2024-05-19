System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        final int MOD = 100000007;
        int[] x = new int[N + M];
        long[] power2 = new long[N + M];
        long[] power2_inv = new long[N + M];
        long[] power3 = new long[N + M];
        long[] power3_inv = new long[N + M];
        long[] fact = new long[N + M];
        long[] fact_inv = new long[N + M];

        power2[0] = 1;
        power2_inv[0] = 1;
        power3[0] = 1;
        power3_inv[0] = 1;
        fact[0] = 1;
        fact_inv[0] = 1;

        for (int i = 1; i < N + M; i++) {
            power2[i] = power2[i - 1] * 2 % MOD;
            power2_inv[i] = power(power2[i], MOD - 2, MOD);
            power3[i] = power3[i - 1] * 3 % MOD;
            power3_inv[i] = power(power3[i], MOD - 2, MOD);
            fact[i] = fact[i - 1] * i % MOD;
            fact_inv[i] = power(fact[i], MOD - 2, MOD);
        }

        for (int i = 1; i < N + M; i++) {
            x[i] = (int) (((-1) * power2[i - 1] * power3_inv[K + i - 1] % MOD) * fact[K + i - 1] % MOD * fact_inv[K + i - 2] % MOD * fact_inv[i] % MOD);
        }

        for (int i = 1; i < N + M; i++) {
            x[i] = (x[i] + x[i - 1]) % MOD;
        }

        long[] coef = new long[M + 1];
        for (int i = 0; i <= M; i++) {
            coef[i] = fact[N - 1 + i] * fact_inv[N - 2] % MOD * fact_inv[i] % MOD;
            coef[i] = coef[i] * power3[K + i - 1] % MOD;
        }

        long ans = 0;
        for (int i = 0; i <= M; i++) {
            ans = (ans + coef[i] * x[N - 1 + i]) % MOD;
        }

        System.out.println(ans);
    }

    public static long power(long x, long n, long mod) {
        if (n == 0) {
            return 1;
        }
        long half = power(x, n / 2, mod);
        if (n % 2 == 0) {
            return half * half % mod;
        } else {
            return half * half % mod * x % mod;
        }
    }
}
```<|endoftext|>
