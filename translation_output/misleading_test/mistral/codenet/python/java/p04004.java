<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] power2 = new int[N + M][N + M];
        int[][] power3 = new int[N + M][N + M];
        int[] fact = new int[N + M];
        int[] fact_inv = new int[N + M];

        Arrays.fill(power2, 1);
        Arrays.fill(power3, 1);

        for (int i = 2; i <= N + M; i++) {
            power2[i] = power2[i - 1] * 2 % mod;
            power3[i] = power3[i - 1] * 3 % mod;
        }

        for (int i = 1; i <= N + M; i++) {
            fact[i] = i;
            fact_inv[i] = mod - fact[i];
        }

        int x[] = new int[N + M];
        Arrays.fill(x, 0);

        for (int i = 1; i <= N + M; i++) {
            x[i] = (power2[i - 1] * power3_inv[K + 1 + i] % mod) % mod;
            x[i] *= fact[K + 1 + i] * fact_inv[K] % mod * fact_inv[1 + i] % mod;
            x[i] %= mod;
        }

        x[0] = 3 * (1 - power3_inv[K + 1]) % mod * power2_inv[1] % mod;

        Arrays.stream(x).forEach(i -> x[i] = (x[i] + N) % mod);

        Arrays.stream(x).forEach(i -> x[i] *= power3[i] * power2_inv[i] % mod);
        x[0] = (x[0] + N) % mod;

        int coef[] = new int[N + M];
        Arrays.fill(coef, 0);

        for (int i = N - 1; i <= N + M - 1; i++) {
            coef[i] = fact[N + M - 1 - i] * fact_inv[M] % mod * fact_inv[N - 1] % mod;
            coef[i] *= power3[K + 1 + i][::-1];
            coef[i] %= mod;
        }

        int answer = 0;
        for (int i = 0; i < N + M; i++) {
            answer += coef[i] * x[i] % mod;
        }

        System.out.println(answer);
    }
}
```</s>
