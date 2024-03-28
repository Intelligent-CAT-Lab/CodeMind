<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 10 1

Expected output:
1024


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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n<k) {
            System.out.println(0);
            return;
        }
        if(m<k) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for(int i=1;i<=k;i++) {
            ans = (ans*m)%1000000007;
        }
        long c = m;
        long[][] comb = new long[k+1][k+1];
        comb[0][0] = 1;
        for(int i=0;i<k;i++) {
            for(int j=0;j<=i;j++) {
                comb[i+1][j] += comb[i][j];
                comb[i+1][j+1] += comb[i][j];
            }
        }
        for(int i=1;i<k;i++) {
            long k1 = 0;
            for(int j=1;j<=i;j++) {
                if((i+j)&1) {
                    k1 -= comb[i][j]*pow(j,n,1000000007);
                } else {
                    k1 += comb[i][j]*pow(j,n,1000000007);
                }
            }
            k1 *= c;
            c *= (m-i);
            c *= pow(i+1,1000000007-2,1000000007);
            c %= 1000000007;
            ans -= k1;
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
