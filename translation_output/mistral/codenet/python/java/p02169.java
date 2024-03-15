<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int ans = (int) Math.pow(m, n, mod);
        int[] p = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            p[i] = (int) Math.pow(i, n, mod);
        }
        int[] c = new int[k + 1];
        Arrays.fill(c, 0);
        c[0] = 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                c[i + 1][j] += c[i][j];
                c[i + 1][j + 1] += c[i][j];
            }
        }
        for (int i = 1; i <= k; i++) {
            int k1 = 0;
            for (int j = 1; j <= i; j++) {
                if ((i + j) & 1 == 1) {
                    k1 -= c[i][j] * p[j];
                } else {
                    k1 += c[i][j] * p[j];
                }
            }
            k1 *= m;
            k1 *= (i + 1) % mod;
            k1 %= mod;
            ans -= k1;
        }
        System.out.println(ans);
    }
}
```</s>
