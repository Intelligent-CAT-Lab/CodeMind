<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 4 0

Expected output:
211

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
[/INST]
```java
import java.util.*;

public class Main {
    static long mod = 1000000007;
    static long inf = 10000000000000000000L;
    static double eps = 1.0 / 10000000000000000000.0;
    static int[] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int[] ddn = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.setRecursionLimit(1000000000);

        long[] nm = new long[3];
        while (true) {
            nm = new long[3];
            Arrays.fill(nm, sc.nextLong());
            if (nm[0] == 0) {
                break;
            }
        }

        long[] rr = new long[nm[0]];
        long comb = 1;

        for (int i = 1; i < nm[0]; i++) {
            comb = (comb * (i + nm[1] + nm[2] * 2) % mod) * (mod - comb % mod);
        }

        for (int i = 0; i < nm[0]; i++) {
            long n = nm[0] + nm[1] + i * 2;
            long k = nm[2] + i;
            long r = 0;
            for (int j = 0; j <= k; j++) {
                long mt = (comb * (n + j * 2) % mod);
                long lk = 0;
                long rk = 0;
                if (j > 0) {
                    lk = (comb(n + j * 2, j) - comb(n + j * 2, j - 1)) % mod;
                }
                if (j < k) {
                    rk = (comb(n + j * 2, k - j) - comb(n + j * 2, k - j - 1)) % mod;
                }
                r += mt * lk * rk % mod;
                r %= mod;
            }
            rr[i] = r;
        }

        System.out.println(Arrays.toString(rr));
    }
}
```</s>
