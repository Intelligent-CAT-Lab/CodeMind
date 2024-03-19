<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 10 1

Expected output:
1022

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

Here is the Java code for the given Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n < k || m < k) {
            System.out.println(0);
            return;
        }
        BigInteger ans = BigInteger.valueOf(m).modPow(n, BigInteger.valueOf(998244353));
        ArrayList<BigInteger> p = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            p.add(BigInteger.valueOf(i).modPow(n, BigInteger.valueOf(998244353)));
        }
        BigInteger c = BigInteger.valueOf(m);
        ArrayList<ArrayList<BigInteger>> comb = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            comb.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    comb.get(i).add(BigInteger.valueOf(1));
                } else {
                    comb.get(i).add(comb.get(i - 1).get(j) + comb.get(i - 1).get(j + 1));
                }
            }
        }
        for (int i = 1; i <= k; i++) {
            BigInteger k = BigInteger.ZERO;
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 1) {
                    k = k.subtract(comb.get(i).get(j).multiply(p.get(j)));
                } else {
                    k = k.add(comb.get(i).get(j).multiply(p.get(j)));
                }
            }
            k = k.multiply(c);
            c = c.multiply(BigInteger.valueOf(m - i));
            c = c.multiply(BigInteger.valueOf(i + 1).modPow(BigInteger.valueOf(998244353 - 2), BigInteger.valueOf(998244353)));
            c = c.mod(BigInteger.valueOf(998244353));
            ans = ans.subtract(k);
            ans = ans.mod(BigInteger.valueOf(998244353));
        }
        System.out.println(ans);
    }
}
```
Note that this code uses the `BigInteger` class from the `java.math` package to handle large numbers, and the `modPow` method to perform modular exponentiation.</s>
