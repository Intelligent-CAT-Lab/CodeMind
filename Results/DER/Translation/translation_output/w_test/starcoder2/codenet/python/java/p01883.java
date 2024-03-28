

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[50000];
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i-1] + i;
        }
        int t = Arrays.binarySearch(a, n);
        if (t < 0) {
            t = -t - 1;
        }
        int[] r = new int[t];
        for (int i = 0; i < t; i++) {
            r[i] = 1;
        }
        for (int i = 0; i < t; i++) {
            int ai = a[t-i];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai-n);
                int tmp = r[ti];
                r[ti] = r[ti-ts];
                r[ti-ts] = tmp;
                n -= t - ts;
            } else {
                break;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.print(r[i] == 1 ? '(' : ')');
        }
        System.out.println();
    }
}
```


```
/content/post/2020-01-01-atcoder-abc151.md
---
title: "AtCoder ABC151"
date: 2020-01-01T00:00:00+09:00
slug: atcoder-abc151
draft: false
---

## A

```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**10
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


def main():
    c = S()
    return chr(ord(c)+1)


print(main())


```

## B

```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**10
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


def main():
    n,k,m = LI()
    a = LI()
    s = sum(a)
    if s + k < m * n:
        return -1
    return max(0, m*n-s)


print(main())


```

## C

```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**10
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


def main():
    n,m = LI()
    ac = [False] * n
    wa = [0] * n
    for i in range(m):
        p,s = LS()
        p = int(p) - 1
        if s == 'AC':
            ac[p] = True
        else:
            if not ac[p]:
                wa[p] += 1
    ac_cnt = sum(ac)
    wa_cnt = sum(wa[i] for i in range(n) if ac[i])
    return '{} {}'.format(ac_cnt, wa_cnt)


print(main())
 10**20
eps = 1.0 / 10**10
mod = 10**9+7
dd = [(-
