Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int cms = 1000000;
        int[] cm = new int[cms];
        cm[0] = 1;
        for (int i = 1; i < cms; i++) {
            cm[i] = (cm[i-1] * i) % 1000000007;
        }

        int n, m, k;
        while (true) {
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            if (n == 0) break;

            int r = 0;
            for (int i = 0; i <= k; i++) {
                int j = k - i;
                int mt = (int) ((cm[n+m+k*2] * inv(cm[n+i*2])) % 1000000007);
                int lk = (int) ((cm[n+i*2] * inv(cm[i])) % 1000000007);
                int rk = (int) ((cm[m+j*2] * inv(cm[j])) % 1000000007);
                r += mt * lk * rk % 1000000007;
                r %= 1000000007;
            }

            pw.println(r);
        }

        pw.close();
        sc.close();
    }

    public static int inv(int x) {
        return pow(x, 1000000006);
    }

    public static int pow(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 == 1) res = (res * x) % 1000000007;
            x = (x * x) % 1000000007;
            n /= 2;
        }
        return res;
    }
}
```<|endoftext|>
