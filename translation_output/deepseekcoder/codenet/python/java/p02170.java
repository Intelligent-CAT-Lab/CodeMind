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

### Response:
```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = (int)998244353;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static void solve() throws IOException {
        int n = nextInt(), k = nextInt(), a = nextInt();
        long[] lst = new long[k+1];
        lst[k-1] = 1;
        long A = a * power(100*n, mod-2, mod);
        long inv = power(n, mod-2, mod);

        for (int i = k-2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = (A * (lst[i+1] - lst[i+n+1]) + lst[i+1]) % mod;
            } else {
                lst[i] = (A * (lst[i+1] - lst[k]) + (n-(k-i)+1)*inv + lst[i+1]) % mod;
            }
        }
        System.out.println((lst[0] - lst[1] + mod) % mod);
    }

    static long power(long a, long b, long m) {
        long t;
        if(b==0) return 1;
        t = power(a,b/2,m);
        if(b%2==0) return (t*t)%m;
        else return ((t*t)%m*a)%m;
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}
```

This Java code does the same thing as the Python code. It reads input from the standard input, and then uses the power function to calculate the modular inverse. The solve function then calculates the values of the array lst using a loop, and finally prints the result.
<|EOT|>
