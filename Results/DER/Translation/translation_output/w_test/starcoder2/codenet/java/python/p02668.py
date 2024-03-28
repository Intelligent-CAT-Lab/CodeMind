

```python
import sys

MOD = 1000000007

def eleva(a, e):
    if e == 0:
        return 1
    ret = eleva(a, e // 2)
    ret = (ret * ret) % MOD
    if e % 2 == 1:
        ret = (ret * a) % MOD
    return ret

def inv(a):
    return eleva(a, MOD - 2)

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

N, M = map(int, sys.stdin.readline().split())
pot2 = [1] * (M + 1)
invPot2 = [1] * (M + 1)
for i in range(1, M + 1):
    pot2[i] = (pot2[i - 1] * 2) % MOD
invPot2[M] = inv(pot2[M])
for i in range(M - 1, -1, -1):
    invPot2[i] = (invPot2[i + 1] * 2) % MOD
table = [[-1] * (N + 1) for _ in range(M + 1)]
table2 = [[-1] * (N + 1) for _ in range(M + 1)]
print(calc(M, N))
```

## Problem 3

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p02669 {
    
    static final int MAXN = 1000000000;
    static final int MAXM = 1000000000;
    static final int MAXK = 1000000000;
    static final int MAXL = 1000000000;
    static final int MAXR = 1000000000;
    static final int MAXS = 1000000000;
    static final int MAXT = 1000000000;
    static final int MAXU = 1000000000;
    static final int MAXV = 1000000000;
    static final int MAXW = 1000000000;
    static final int MAXX = 1000000000;
    static final int MAXY = 1000000000;
    static final int MAXZ = 1000000000;
    static final int MAXA = 1000000000;
    static final int MAXB = 1000000000;
    static final int MAXC = 1000000000;
    static final int MAXD = 
