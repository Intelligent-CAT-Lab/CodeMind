<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 50

Expected output:
25

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
    n,k,a = LI()
    lst = [0]*(k+1)
    lst[-2] = 1
    A = a*pow(100*n,mod-2,mod)
    inv = pow(n,mod-2,mod)

    for i in range(k-1)[::-1]:
        if k > i + n:
            lst[i] = A*(lst[i+1] - lst[i+n+1]) + lst[i+1]
            lst[i] %= mod
        else:
            lst[i] = A*(lst[i+1] - lst[k]) + (n-(k-i)+1)*inv + lst[i+1]
            lst[i] %= mod
    print((lst[0] - lst[1])%mod)
    return


if __name__ == "__main__":
    solve()


```

@@ Response
```java
import java.util.*;
import java.io.*;

public class Main {
    static final long mod = 998244353;
    static long[] lst;
    static long n, k, a;

    static void solve() {
        lst = new long[(int)k+1];
        lst[(int)k-1] = 1;
        long A = a*pow(100*n,mod-2,mod);
        long inv = pow(n,mod-2,mod);

        for (int i = (int)k-2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = A*(lst[i+1] - lst[(int)i+(int)n+1]) + lst[i+1];
                lst[i] %= mod;
            } else {
                lst[i] = A*(lst[i+1] - lst[(int)k]) + (n-(k-i)+1)*inv + lst[i+1];
                lst[i] %= mod;
            }
        }
        System.out.println((lst[0] - lst[1])%mod);
    }

    static long pow(long a, long b, long m) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        k = sc.nextLong();
        a = sc.nextLong();
        solve();
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the result, and prints it. The `pow` function is used to calculate the modular exponentiation. The `solve` function is the main logic of the code.<｜end▁of▁sentence｜>
