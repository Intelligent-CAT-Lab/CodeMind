

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        int r = 0;
        int t = (int)Math.pow(10, l);
        for (int[] a : new ArrayList<int[]>(Arrays.asList(new int[l]))) {
            int b = 0;
            for (int c : a) {
                b = b * 10 + c;
            }
            int tm = Math.max(Math.abs(n-b), t-Math.abs(n-b));
            if (m > tm) {
                m = tm;
                r = Integer.parseInt(Arrays.toString(a).replaceAll("[^0-9]", ""));
            }
        }
        System.out.println(r);
    }
}

```

## C

### C - 100 to 105

[問題ページ](https://atcoder.jp/contests/abc173/tasks/abc173_c)

```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**10
mod = 998244353
dd = [(0,-1),(1,0),(0,1),(-1,0)]
ddn = [(0,-1),(1,-1),(1,0),(1,1),(0,1),(-1,-1),(-1,0),(-1,1)]

def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def I(): return int(sys.stdin.readline())
def F(): return float(sys.stdin.readline())
def S(): return input()
def pf(s): return print(s, flush=True)


def main():
    h,w,k = LI()
    a = [S() for _ in range(h)]
    r = 0
    for i in range(2**h):
        for j in range(2**w):
            t = 0
            for x in range(h):
                for y in range(w):
                    if (i>>x)&1 == 0 and (j>>y)&1 == 0 and a[x][y] == '#':
                        t += 1
            if t == k:
                r += 1
    return r


print(main())



```

## D

### D - Caracal vs Monster

[問題ページ](https://atcoder.jp/contests/abc173/tasks/abc173_d)

```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**10
mod = 998244353
dd = [(0,-1),(1,0),(0,1),(-1,0)]
ddn = [(0,-1),(1,-1),(1,0),(1,1),(0,1),(-1,-1),(-1,0),(-1,1)]

def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def I(): return int(sys.stdin.readline())
def F(): return float(sys.stdin.readline())
def S(): return input()
def pf(s): return print(s, flush=True)


def main():
    n = I()
    a = LI()
    a.sort(reverse=True)
    r = 0
    for i in range(n-1):
        r += a[i//2]
    return r


print(main())



```

## E

### E - Logs

[問題ページ](https://atcoder.jp/contests/abc173/tasks/abc173_e)

```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**10
mod = 998244353
dd = [(0,-1),(1,0),(0,1),(-1,0)]
ddn = [(0,-1),(1,-1),(1,0),(1,1),(0,1),(-1,-1),(-1,0),(-1,1)]

def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def I(): return int(sys.stdin.readline())
def F(): return float(sys.stdin.readline())
def S(): return input()
def pf(s): return print(s, flush=True)


def main():
    n,k = LI()
    a = LI()
    a.sort()
    if min(a) >= 0:
        return pow(a[-1], k, mod)
    if k == 1:
        return a[-1]
    if k == 2:
        return a[-1] * a[-2] % mod
    if k == 3:
        return a[-1] * a[-2] * a[-3] % mod
    if k == 4:
        return a[-1] * a[-2] * a[-3] * a[-4] % mod
    if k == 5:
        return a[-1] * a[-2] * a[-3] * a[-4] * a[-5] % mod
    if k == 6:
        return a[-1] * a[-2] * a[-3] * a[-4] * a
