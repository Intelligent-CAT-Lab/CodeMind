<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;
import java.math.*;

public class Main {
    static int mod = (int) 1e9 + 7;
    static BigInteger[] fact;
    static BigInteger[] inv;

    static BigInteger powmod(BigInteger a, BigInteger b) {
        BigInteger res = BigInteger.ONE;
        while (!b.equals(BigInteger.ZERO)) {
            if (b.testBit(0)) {
                res = res.multiply(a).mod(BigInteger.valueOf(mod));
            }
            a = a.multiply(a).mod(BigInteger.valueOf(mod));
            b = b.shiftRight(1);
        }
        return res;
    }

    static BigInteger comb(int n, int k) {
        if (k > n || k < 0) {
            return BigInteger.ZERO;
        }
        return fact[n].multiply(inv[k]).multiply(inv[n - k]).mod(BigInteger.valueOf(mod));
    }

    static void solve() {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        if (n < k || m < k) {
            System.out.println(0);
            return;
        }
        BigInteger ans = powmod(BigInteger.valueOf(m), BigInteger.valueOf(n));
        BigInteger c = BigInteger.valueOf(m);
        fact = new BigInteger[k + 1];
        inv = new BigInteger[k + 1];
        fact[0] = BigInteger.ONE;
        inv[0] = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
            inv[i] = powmod(fact[i], BigInteger.valueOf(mod - 2));
        }
        for (int i = 1; i < k; i++) {
            BigInteger kk = BigInteger.ZERO;
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 1) {
                    kk = kk.subtract(comb(i, j).multiply(powmod(BigInteger.valueOf(j), BigInteger.valueOf(n))));
                } else {
                    kk = kk.add(comb(i, j).multiply(powmod(BigInteger.valueOf(j), BigInteger.valueOf(n))));
                }
            }
            kk = kk.multiply(c);
            c = c.multiply(BigInteger.valueOf(m - i)).mod(BigInteger.valueOf(mod));
            c = c.multiply(powmod(BigInteger.valueOf(i + 1), BigInteger.valueOf(mod - 2))).mod(BigInteger.valueOf(mod));
            ans = ans.subtract(kk.mod(BigInteger.valueOf(mod)));
        }
        System.out.println(ans.mod(BigInteger.valueOf(mod)));
    }

    public static void main(String[] args) {
        solve();
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the standard input, checks if they meet the conditions, calculates the power of the first number modulo the second one, calculates combinations, and then calculates the final result. The result is printed to the standard output.
<|EOT|>
