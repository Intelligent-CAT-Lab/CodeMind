<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.*;
import java.math.BigInteger;

public class Main {
    static final BigInteger MOD = BigInteger.valueOf((long) (1e9 + 7));
    static final int U = (int) (1e6);
    static BigInteger[] fact, factInv;
    static BigInteger[] power2, power2Inv, power3, power3Inv;

    static void cumprod(BigInteger[] arr, int L, BigInteger MOD) {
        int Lsq = (int) Math.sqrt(L) + 1;
        for (int n = 1; n < Lsq; ++n) {
            arr[n] = arr[n].multiply(arr[n - 1]).mod(MOD);
        }
        for (int n = 1; n < Lsq; ++n) {
            arr[n * Lsq] = arr[n * Lsq].multiply(arr[(n - 1) * Lsq]).mod(MOD);
        }
        for (int n = 1; n < L; ++n) {
            arr[n] = arr[n].multiply(arr[arr.length - n - 1]).mod(MOD);
        }
    }

    static void makeFact(int U, BigInteger MOD) {
        fact = new BigInteger[U + 1];
        factInv = new BigInteger[U + 1];
        fact[0] = BigInteger.ONE;
        for (int i = 1; i <= U; ++i) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
        }
        factInv[U] = fact[U].modInverse(MOD);
        for (int i = U - 1; i >= 0; --i) {
            factInv[i] = factInv[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(MOD);
        }
    }

    static void makePower(BigInteger a, int L, BigInteger MOD) {
        power2 = new BigInteger[L];
        power2Inv = new BigInteger[L];
        power3 = new BigInteger[L];
        power3Inv = new BigInteger[L];
        power2[0] = BigInteger.ONE;
        power3[0] = BigInteger.ONE;
        for (int i = 1; i < L; ++i) {
            power2[i] = power2[i - 1].multiply(a).mod(MOD);
            power3[i] = power3[i - 1].multiply(power2[i]).mod(MOD);
        }
        power2Inv[L - 1] = power2[L - 1].modInverse(MOD);
        power3Inv[L - 1] = power3[L - 1].modInverse(MOD);
        for (int i = L - 2; i >= 0; --i) {
            power2Inv[i] = power2Inv[i + 1].multiply(a).mod(MOD);
            power3Inv[i] = power3Inv[i + 1].multiply(power2Inv[i]).mod(MOD);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();
        makeFact(U, MOD);
        makePower(BigInteger.valueOf(2), U, MOD);
        BigInteger[] x = new BigInteger[N + M];
        x[0] = BigInteger.valueOf(3).multiply(power3Inv[K + 1]).multiply(power2Inv[1]).mod(MOD);
        for (int i = 1; i < N + M; ++i) {
            x[i] = x[i - 1].multiply(BigInteger.valueOf(-1)).mod(MOD);
            x[i] = x[i].multiply(power2[i]).mod(MOD);
            x[i] = x[i].multiply(power3Inv[K + i + 1]).mod(MOD);
            x[i] = x[i].multiply(fact[K + i]).mod(MOD);
            x[i] = x[i].multiply(factInv[K]).mod(MOD);
            x[i] = x[i].multiply(factInv[i]).mod(MOD);
        }
        BigInteger coef = fact[N + M - 1].multiply(factInv[M
