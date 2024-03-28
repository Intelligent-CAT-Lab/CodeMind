<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 4 0

Expected output:
210


```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**13
mod = 10**9+7
dd = [(-1,0),(0,1),(1,0),(0,-1)]
ddn = [(-1,0),(-1,1),(0,1),(1,1),(1,0),(1,-1),(0,-1),(-1,-1)]

def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def I(): return int(sys.stdin.readline())
def F(): return float(sys.stdin.readline())
def S(): return input()
def pf(s): return print(s, flush=True)

def inv(x):
    return pow(x, mod - 2, mod)

cms = 10**6
cm = [0] * cms

def comb_init():
    cm[0] = 1
    for i in range(1, cms):
        cm[i] = cm[i-1] * i % mod

def comb(a, b):
    return (cm[a] * inv(cm[a-b]) % mod) * inv(cm[b]) % mod


def main():
    rr = []

    def f(n,m,k):
        comb_init()
        r = 0
        for i in range(k+1):
            j = k - i
            mt = comb(n+m+k*2, n+i*2)
            lk = rk = 1
            if i > 0:
                lk = (comb(n+i*2, i) - comb(n+i*2, i-1)) % mod
            if j > 0:
                rk = (comb(m+j*2, j) - comb(m+j*2, j-1)) % mod
            r += mt * lk * rk % mod
            r %= mod

        return r

    while 1:
        n,m,k = LI()
        if n == 0:
            break
        rr.append(f(n,m,k))
        break

    return '\n'.join(map(str, rr))


print(main())


```

@@ Response
Here is the Java equivalent of the provided Python code:

```java
import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = 1000000007;
    static final int MAX = 1000000;
    static long[] cm = new long[MAX];

    static void comb_init() {
        cm[0] = 1;
        for (int i = 1; i < MAX; i++) {
            cm[i] = (cm[i-1] * i) % MOD;
        }
    }

    static long comb(int a, int b) {
        return (cm[a] * pow(cm[a-b], MOD-2, MOD) % MOD * pow(cm[b], MOD-2, MOD)) % MOD;
    }

    static long pow(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        comb_init();
        long r = 0;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            long mt = comb(n+m+k*2, n+i*2);
            long lk = rk = 1;
            if (i > 0) {
                lk = (comb(n+i*2, i) - comb(n+i*2, i-1) + MOD) % MOD;
            }
            if (j > 0) {
                rk = (comb(m+j*2, j) - comb(m+j*2, j-1) + MOD) % MOD;
            }
            r = (r + mt * lk * rk) % MOD;
        }
        System.out.println(r);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the combination of the given numbers, and prints the result. The `pow` function is used to calculate the modular inverse. The `comb` function calculates the combination of two numbers using the previously calculated combinations. The `comb_init` function initializes the combination array.<｜end▁of▁sentence｜>
