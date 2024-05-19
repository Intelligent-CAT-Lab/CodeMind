System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
#!usr/bin/env python3
from collections import defaultdict,deque
from heapq import heappush, heappop
import sys
import math
import bisect
import random
def LI(): return [int(x) for x in sys.stdin.readline().split()]
def I(): return int(sys.stdin.readline())
def LS():return [list(x) for x in sys.stdin.readline().split()]
def S():
    res = list(sys.stdin.readline())
    if res[-1] == "\n":
        return res[:-1]
    return res
def IR(n):
    return [I() for i in range(n)]
def LIR(n):
    return [LI() for i in range(n)]
def SR(n):
    return [S() for i in range(n)]
def LSR(n):
    return [LS() for i in range(n)]

sys.setrecursionlimit(1000000)
mod = 998244353


def solve():
    m,n,k = LI()
    if n < k:
        print(0)
        return
    if m < k:
        print(0)
        return
    ans = pow(m,n,mod)
    p = [pow(i,n,mod) for i in range(k+1)]
    c = m
    comb = [[0 for i in range(i+1)] for i in range(k+1)]
    comb[0][0] = 1
    for i in range(k):
        for j in range(i+1):
            comb[i+1][j] += comb[i][j]
            comb[i+1][j+1] += comb[i][j]
    for i in range(1,k):
        k = 0
        for j in range(1,i+1)[::-1]:
            if (i+j)&1:
                k -= comb[i][j]*p[j]
            else:
                k += comb[i][j]*p[j]
        k *= c
        c *= (m-i)
        c *= pow(i+1,mod-2,mod)
        c %= mod
        ans -= k
        ans %= mod
    print(ans)
    return


if __name__ == "__main__":
    solve()


```


Answer:
```java
import java.io.*;
import java.util.*;

class Main {
    static long mod = 998244353;

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long M, N, K;
        M = sc.nextLong();
        N = sc.nextLong();
        K = sc.nextLong();
        if (N < K || M < K) {
            System.out.println(0);
            return;
        }
        long ans = modpow(M, N);
        long[] p = new long[(int)K+1];
        for (int i = 0; i <= K; i++) {
            p[i] = modpow(i, N);
        }
        long[][] comb = new long[(int)K+1][(int)K+1];
        comb[0][0] = 1;
        for (int i = 0; i < K; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i+1][j] += comb[i][j];
                comb[i+1][j+1] += comb[i][j];
            }
        }
        for (int i = 1; i < K; i++) {
            long k = 0;
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 1) {
                    k -= comb[i][j] * p[j] % mod;
                } else {
                    k += comb[i][j] * p[j] % mod;
                }
            }
            k = k * M % mod;
            M = M * (M-i) % mod;
            M = M * modinv(i+1) % mod;
            ans -= k;
            ans %= mod;
        }
        System.out.println(ans);
    }

    static long modpow(long a, long n) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n /= 2;
        }
        return res;
    }

    static long modinv(long a) {
        return modpow(a, mod-2);
    }
}
```<|endoftext|>
