System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time

sys.setrecursionlimit(10**7)
inf = 10**20
mod = 10**9 + 7

def LI(): return list(map(int, input().split()))
def II(): return int(input())
def LS(): return input().split()
def S(): return input()

def factorization(n):
    def factor_sub(n, m):
        c = 0
        while n % m == 0:
            c += 1
            n /= m
        return c, n
    #
    buff = []
    c, m = factor_sub(n, 2)
    if c > 0: buff.append((2, c))
    c, m = factor_sub(m, 3)
    if c > 0: buff.append((3, c))
    x = 5
    while m >= x * x:
        c, m = factor_sub(m, x)
        if c > 0: buff.append((x, c))
        if x % 6 == 5:
            x += 2
        else:
            x += 4
    if m > 1: buff.append((m, 1))
    return buff

def main():
    n = II()
    d = collections.defaultdict(int)
    for i in range(1,n+1):
        for k,v in factorization(i):
            d[k] += v
    r = 1
    for c in d.values():
        r *= c+1
        r %= mod
    return r


print(main())

```


Answer:
```java
import java.util.*;
import java.io.*;

class Main {
    static int MOD = 100000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                a[j]++;
            }
        }
        long ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= (a[i] + 1);
            ans %= MOD;
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
