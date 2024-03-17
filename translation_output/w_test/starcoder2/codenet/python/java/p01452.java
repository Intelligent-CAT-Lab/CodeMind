

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int mod = 1000000007;
    static int cms = 1000000;
    static long[] cm = new long[cms];

    static void comb_init() {
        cm[0] = 1;
        for (int i = 1; i < cms; i++) {
            cm[i] = cm[i-1] * i % mod;
        }
    }

    static long comb(int a, int b) {
        return cm[a] * inv(cm[a-b]) % mod * inv(cm[b]) % mod;
    }

    static long inv(long x) {
        return pow(x, mod - 2, mod);
    }

    static long pow(long x, long y, long m) {
        if (y == 0) {
            return 1;
        }
        long z = pow(x, y / 2, m);
        if (y % 2 == 0) {
            return z * z % m;
        } else {
            return x * z * z % m;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> rr = new ArrayList<>();

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            if (n == 0) {
                break;
            }
            rr.add(f(n, m, k));
            break;
        }

        for (long r : rr) {
            System.out.println(r);
        }
    }

    static long f(int n, int m, int k) {
        comb_init();
        long r = 0;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            long mt = comb(n+m+k*2, n+i*2);
            long lk = 1;
            if (i > 0) {
                lk = (comb(n+i*2, i) - comb(n+i*2, i-1)) % mod;
            }
            long rk = 1;
            if (j > 0) {
                rk = (comb(m+j*2, j) - comb(m+j*2, j-1)) % mod;
            }
            r += mt * lk * rk % mod;
            r %= mod;
        }

        return r;
    }
}

```

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


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

    def f(n):
        return n - 1

    while 1:
        n = I()
        if n == 0:
            break
        rr.append(f(n))
        break

    return '\n'.join(map(str, rr))


print(main())


```

java code:

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int mod = 1000000007;
    static int cms = 1000000;
    static long[] cm = new long[cms];

    static void comb_init() {
        cm[0] = 1;
        for (int i = 1; i < cms; i++) {
            cm[i] = cm[i-1] * i % mod;
        }
    }

    static long comb(int a, int b) {
        return cm[a] * inv(cm[a-b]) % mod * inv(cm[b]) % mod;
    }

    static long inv(long x) {
        return pow(x, mod - 2, mod);
    }

    static long pow(long x, long y, long m) {
        if (y == 0) {
            return 1;
        }
        long z = pow(x
