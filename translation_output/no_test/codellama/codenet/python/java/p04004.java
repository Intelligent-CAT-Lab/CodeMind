<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```java
import java.util.Scanner;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = 1000000007;

        BigInteger[] power2 = new BigInteger[N + M];
        BigInteger[] power2_inv = new BigInteger[N + M];
        BigInteger[] power3 = new BigInteger[N + M];
        BigInteger[] power3_inv = new BigInteger[N + M];
        BigInteger[] fact = new BigInteger[N + M];
        BigInteger[] fact_inv = new BigInteger[N + M];

        for (int i = 0; i < N + M; i++) {
            power2[i] = BigInteger.valueOf(2).pow(i);
            power2_inv[i] = BigInteger.valueOf(2).pow(MOD - 2).mod(MOD);
            power3[i] = BigInteger.valueOf(3).pow(i);
            power3_inv[i] = BigInteger.valueOf(3).pow(MOD - 2).mod(MOD);
            fact[i] = BigInteger.valueOf(i).mod(MOD);
            fact_inv[i] = BigInteger.valueOf(i).mod(MOD);
        }

        BigInteger[] x = new BigInteger[N + M];
        for (int i = 1; i < N + M; i++) {
            x[i] = (-1).multiply(power2[i - 1]).multiply(power3_inv[K + i]).mod(MOD);
        }
        x[0] = 3.multiply(power3_inv[K + 1]).multiply(power2_inv[1]).mod(MOD);

        BigInteger[] coef = new BigInteger[N + M];
        for (int i = N - 1; i < N + M; i++) {
            coef[i] = fact[i].multiply(fact_inv[K]).multiply(fact_inv[1]).mod(MOD);
        }
        coef[0] = 0;

        BigInteger answer = BigInteger.ZERO;
        for (int i = 0; i < N + M; i++) {
            answer = answer.add(coef[i].multiply(x[i]).mod(MOD));
        }
        System.out.println(answer.mod(MOD));
    }
}
```
This is the Java code for the given Python code. It uses the `BigInteger` class from the `java.math` package to perform the calculations. The code is similar to the Python code, with some minor differences in syntax and the use of the `BigInteger` class.

Note that the `BigInteger` class has a `mod` method that takes a modulus as an argument, which is used to perform the modular arithmetic operations. The `BigInteger` class also has a `pow` method that takes an exponent as an argument, which is used to perform the exponentiation operations.</s>
