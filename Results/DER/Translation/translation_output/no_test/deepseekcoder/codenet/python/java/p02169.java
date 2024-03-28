<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    static int mod = 998244353;
    static BigInteger[][] comb;

    static BigInteger pow(BigInteger a, BigInteger b) {
        return a.modPow(b, BigInteger.valueOf(mod));
    }

    static BigInteger solve(int m, int n, int k) {
        if (n < k || m < k) {
            return BigInteger.ZERO;
        }
        BigInteger ans = pow(BigInteger.valueOf(m), BigInteger.valueOf(n));
        BigInteger[] p = new BigInteger[k+1];
        for (int i = 0; i <= k; i++) {
            p[i] = pow(BigInteger.valueOf(i), BigInteger.valueOf(n));
        }
        BigInteger c = BigInteger.valueOf(m);
        comb = new BigInteger[k+1][k+1];
        comb[0][0] = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i+1][j] = comb[i+1][j].add(comb[i][j]);
                comb[i+1][j+1] = comb[i+1][j+1].add(comb[i][j]);
            }
        }
        for (int i = 1; i < k; i++) {
            BigInteger k_ = BigInteger.ZERO;
            for (int j = 1; j <= i; j++) {
                if (((i+j)&1) == 1) {
                    k_ = k_.subtract(comb[i][j].multiply(p[j]));
                } else {
                    k_ = k_.add(comb[i][j].multiply(p[j]));
                }
            }
            k_ = k_.multiply(c);
            c = c.multiply(BigInteger.valueOf(m-i)).mod(BigInteger.valueOf(mod));
            c = c.multiply(pow(BigInteger.valueOf(i+1), BigInteger.valueOf(mod-2))).mod(BigInteger.valueOf(mod));
            ans = ans.subtract(k_);
            ans = ans.mod(BigInteger.valueOf(mod));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solve(m, n, k));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calls the `solve` function with these integers, and prints the result. The `solve` function calculates the answer modulo `998244353`. The `pow` function calculates the power of a BigInteger modulo `998244353`. The `comb` array is used to store binomial coefficients.
<|EOT|>
