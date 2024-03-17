Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, k;
        List<Integer> rr = new ArrayList<>();
        while (true) {
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            if (n == 0) break;
            rr.add(f(n, m, k));
        }
        for (int r : rr) {
            System.out.println(r);
        }
    }

    public static int f(int n, int m, int k) {
        int[] cm = new int[1000001];
        cm[0] = 1;
        for (int i = 1; i <= 1000000; i++) {
            cm[i] = (cm[i-1] * i) % 1000000007;
        }
        int r = 0;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            int mt = (int) ((Math.pow(i+j, n+m+k*2) * Math.pow(i, n+i*2) * Math.pow(j, m+j*2)) % 1000000007);
            int lk = (int) ((Math.pow(i+j, n+i*2) * Math.pow(i, i-1)) % 1000000007);
            int rk = (int) ((Math.pow(i+j, m+j*2) * Math.pow(j, j-1)) % 1000000007);
            r += mt * lk * rk;
            r %= 1000000007;
        }
        return r;
    }
}
```<|endoftext|>
