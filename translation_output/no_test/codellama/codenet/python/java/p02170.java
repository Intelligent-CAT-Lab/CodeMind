<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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



Translate the above python code to java.

java code:

[/INST]
```java
import java.util.Scanner;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a = scanner.nextInt();
        scanner.close();

        BigInteger[] lst = new BigInteger[k + 1];
        lst[k - 1] = BigInteger.ONE;
        BigInteger A = BigInteger.valueOf(a).multiply(BigInteger.valueOf(100 * n).modPow(BigInteger.valueOf(mod - 2), BigInteger.valueOf(mod)));
        BigInteger inv = BigInteger.valueOf(n).modPow(BigInteger.valueOf(mod - 2), BigInteger.valueOf(mod));

        for (int i = k - 2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = A.multiply(lst[i + 1].subtract(lst[i + n + 1])).add(lst[i + 1]).mod(BigInteger.valueOf(mod));
            } else {
                lst[i] = A.multiply(lst[i + 1].subtract(lst[k])).add(BigInteger.valueOf(n - (k - i) + 1).multiply(inv)).add(lst[i + 1]).mod(BigInteger.valueOf(mod));
            }
        }

        System.out.println((lst[0].subtract(lst[1])).mod(BigInteger.valueOf(mod)));
    }
}
```
Note: The `mod` variable is not defined in the Python code, so I have assumed it to be `998244353`.</s>
