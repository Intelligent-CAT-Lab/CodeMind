<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
    static int N,M,K;
    static int MOD = 1_000_000_007;
    static int[] power2,power2_inv,power3,power3_inv,fact,fact_inv;
    static int[] x;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        power2 = new int[1000001];
        power2_inv = new int[1000001];
        power3 = new int[1000001];
        power3_inv = new int[1000001];
        fact = new int[1000001];
        fact_inv = new int[1000001];
        power2[0] = 1;
        power3[0] = 1;
        fact[0] = 1;
        for (int i = 1; i <= 1000000; i++) {
            power2[i] = (power2[i-1] * 2) % MOD;
            power3[i] = (power3[i-1] * 3) % MOD;
            fact[i] = (fact[i-1] * i) % MOD;
        }
        power2_inv[1000000] = pow(2,MOD-2,MOD);
        power3_inv[1000000] = pow(3,MOD-2,MOD);
        for (int i = 999999; i >= 0; i--) {
            power2_inv[i] = (power2_inv[i+1] * power2[i+1]) % MOD;
            power3_inv[i] = (power3_inv[i+1] * power3[i+1]) % MOD;
        }
        x = new int[N+M];
        x[1] = 3;
        for (int i = 1; i <= N+M-1; i++) {
            x[i+1] = (x[i] * power3_inv[K+1+i] * power2_inv[1+i]) % MOD;
        }
        for (int i = 1; i <= N+M; i++) {
            x[i] = (x[i] * fact[K+1+i] * fact_inv[1+i] * fact_inv[K+1]) % MOD;
        }
        for (int i = 1; i <= N+M; i++) {
            x[i] = (x[i] * power3[K+i] * power2_inv[i]) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < M+1; i++) {
            ans = (ans + (fact[N-1] * fact_inv[i] * fact_inv[N-1+i] * power3[K+i] * power2_inv[i]) % MOD) % MOD;
        }
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
