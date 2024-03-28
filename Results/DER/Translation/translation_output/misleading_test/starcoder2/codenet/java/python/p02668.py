

```python
MOD = 1000000007

def calc(rem, bits):
    global table
    if table[rem][bits] != -1:
        return table[rem][bits]
    if bits == 1:
        return table[rem][bits] = pot2[rem]
    ret = (calc2(rem - 1, bits - 1) * pot2[rem]) % MOD
    ret += (rem + 1) * calc(rem, bits - 1)
    ret %= MOD
    return table[rem][bits] = ret

def calc2(rem, bits):
    global table2
    if table2[rem][bits] != -1:
        return table2[rem][bits]
    if rem == 0:
        return table2[rem][bits] = 0
    ret = calc2(rem - 1, bits)
    tmp = (rem * calc(rem, bits)) % MOD
    tmp = (tmp * invPot2[rem + 1]) % MOD
    ret = (ret + tmp) % MOD
    return table2[rem][bits] = ret

def eleva(a, e):
    if e == 0:
        return 1
    ret = eleva(a, e / 2)
    ret = (ret * ret) % MOD
    if e % 2 == 1:
        ret = (ret * a) % MOD
    return ret

def inv(a):
    return eleva(a, (int)MOD - 2)

N = int(input())
M = int(input())
pot2 = [0] * (M + 1)
invPot2 = [0] * (M + 1)
pot2[0] = 1
for i in range(1, len(pot2)):
    pot2[i] = (pot2[i-1] * 2) % MOD
invPot2[len(pot2) - 1] = inv(pot2[len(pot2) - 1])
for i in range(len(pot2) - 2, -1, -1):
    invPot2[i] = (invPot2[i+1] * 2) % MOD
table = [[-1] * (N+1) for i in range(M+1)]
table2 = [[-1] * (N+1) for i in range(M+1)]
print(calc(M, N))
```

## Problem 2

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5

Expected output:
270

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p02668 {
    
    static final long MOD = 1000000007;
    static long[][] table;
    static long[][] table2;
    static int N, M;
    static long[] pot2, invPot2;
    
    static long calc(int rem, int bits) {
        long ret = table[rem][bits];
        if (ret != -1) return ret;
        if (bits == 1) return table[rem][bits] = pot2[rem];
        ret = (calc2(rem - 1, bits - 1) * pot2[rem]) % MOD;
        ret += (rem + 1) * calc(rem, bits - 1);
        ret %= MOD;
        return table[rem][bits] = ret;
    }
    
    static long calc2(int rem, int bits) {
        long ret = table2[rem][bits];
        if (ret != -1) return ret;
        if (rem == 0) return table2[rem][bits] = 0;
        ret = calc2(rem - 1, bits);
        long tmp = (rem * calc(rem, bits)) % MOD;
        tmp = (tmp * invPot2[rem + 1]) % MOD;
        ret = (ret + tmp) % MOD;
        return table2[rem][bits] = ret;
    }
    
    static long eleva(long a, int e) {
        if (e == 0) return 1
