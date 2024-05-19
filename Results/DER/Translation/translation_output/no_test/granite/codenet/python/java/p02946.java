System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
import sys
import math
import heapq
sys.setrecursionlimit(10**7)
INTMAX = 9223372036854775807
INTMIN = -9223372036854775808
DVSR = 1000000007
def POW(x, y): return pow(x, y, DVSR)
def INV(x, m=DVSR): return pow(x, m - 2, m)
def DIV(x, y, m=DVSR): return (x * INV(y, m)) % m
def LI(): return [int(x) for x in input().split()]
def LF(): return [float(x) for x in input().split()]
def LS(): return input().split()
def II(): return int(input())
def FLIST(n):
    res = [1]
    for i in range(1, n+1): res.append(res[i-1]*i%DVSR)
    return res
def gcd(x, y):
    if x < y: x, y = y, x
    div = x % y
    while div!= 0:
        x, y = y, div
        div = x % y
    return y

K,X=LI()

for i in range(max(X-K+1, -1000000), min(X+K, 1000000)):
    print(i, end=" ")
print("")

```


Answer:
```java
import java.util.*;
import java.io.*;

class Main {
    static long MOD = 1000000007;
    static long[] fact;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int K = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        for (int i = Math.max(X-K+1, -1000000); i < Math.min(X+K+1, 1000001); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
```<|endoftext|>
