<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 1

Expected output:
-54

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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    static long mod = 1000000007;
    static long[] fact, fact_inv, power2, power2_inv, power3, power3_inv;
    static int N, M, K;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        K = Integer.parseInt(s[2]);

        fact = new long[1000001];
        fact_inv = new long[1000001];
        power2 = new long[1000001];
        power2_inv = new long[1000001];
        power3 = new long[1000001];
        power3_inv = new long[1000001];

        fact[0] = fact_inv[0] = power2[0] = power2_inv[0] = power3[0] = power3_inv[0] = 1;
        for (int i = 1; i <= 1000000; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            fact_inv[i] = (fact_inv[i - 1] * (mod - mod / i)) % mod;
            power2[i] = (power2[i - 1] * 2) % mod;
            power2_inv[i] = (power2_inv[i - 1] * (mod - mod / 2)) % mod;
            power3[i] = (power3[i - 1] * 3) % mod;
            power3_inv[i] = (power3_inv[i - 1] * (mod - mod / 3)) % mod;
        }

        long[] x = new long[N + M];
        x[1] = power3_inv[K + 1];
        for (int i = 2; i <= N + M; i++) {
            x[i] = (x[i - 1] * power3_inv[i - 1]) % mod;
        }
        for (int i = K + 1; i <= N + M + K; i++) {
            x[i] = (x[i] * fact[i - 1]) % mod;
            x[i] = (x[i] * fact_inv[i - K - 1]) % mod;
            x[i] = (x[i] * fact_inv[i - 1]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power2_inv[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power3[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power2[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power2_inv[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power3[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power2[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power2_inv[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power3[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power2[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power2_inv[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power3[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power2[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power2_inv[i]) % mod;
        }
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i] * power3[i]) % mod;
        }
        for (int i = 1; i <=
