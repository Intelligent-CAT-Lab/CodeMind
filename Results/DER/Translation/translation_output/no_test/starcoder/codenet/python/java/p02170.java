<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    static long mod = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = sc.nextInt();
        long inv = pow(n,mod-2,mod);
        long A = a*pow(100*n,mod-2,mod);
        long[] lst = new long[k+1];
        lst[k] = 1;
        for(int i = k-1;i >= 0;i--){
            if(k > i + n){
                lst[i] = (A*(lst[i+1] - lst[i+n+1]) + lst[i+1])%mod;
            }else{
                lst[i] = (A*(lst[i+1] - lst[k]) + (n-(k-i)+1)*inv + lst[i+1])%mod;
            }
        }
        System.out.println((lst[0] - lst[1])%mod);
    }
    public static long pow(long a,long b,long mod){
        long res = 1;
        while(b > 0){
            if((b&1) == 1) res = res*a%mod;
            a = a*a%mod;
            b >>= 1;
        }
        return res;
    }
}

```
<|endoftext|>
