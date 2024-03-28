<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 50

Expected output:
1


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
Here is the Java version of the provided Python code:

```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = (int) 1e9 + 7;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        long[] lst = new long[k+1];
        lst[k-1] = 1;
        long A = a * pow(100*n, mod-2, mod);
        long inv = pow(n, mod-2, mod);

        for (int i = k-2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = (A * (lst[i+1] - lst[i+n+1]) + lst[i+1]) % mod;
            } else {
                lst[i] = (A * (lst[i+1] - lst[k]) + (n-(k-i)+1)*inv + lst[i+1]) % mod;
            }
        }
        System.out.println((lst[0] - lst[1] + mod) % mod);
    }

    static long pow(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0)
                res = res * a % m;
            a = a * a % m;
            b >>= 1;
        }
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the result, and prints it to the standard output. The `pow` function is used to calculate the modular exponentiation, which is a common operation in modular arithmetic.
<|EOT|>
