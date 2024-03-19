<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
96

```
from itertools import *
from bisect import *
from math import *
from collections import *
from heapq import *
from random import *
import sys

sys.setrecursionlimit(10 ** 6)
int1 = lambda x: int(x) - 1
p2D = lambda x: print(*x, sep="\n")
def II(): return int(sys.stdin.readline())
def MI(): return map(int, sys.stdin.readline().split())
def MI1(): return map(int1, sys.stdin.readline().split())
def MF(): return map(float, sys.stdin.readline().split())
def LI(): return list(map(int, sys.stdin.readline().split()))
def LI1(): return list(map(int1, sys.stdin.readline().split()))
def LF(): return list(map(float, sys.stdin.readline().split()))
def LLI(rows_number): return [LI() for _ in range(rows_number)]
dij = [(1, 0), (0, 1), (-1, 0), (0, -1)]

def main():
    def ok(m):
        s=0
        cnt=0
        while m:
            s+=m
            cnt+=1
            if s>k:return False
            if cnt==n:break
            m>>=1
        return True

    n,k=MI()
    l=0
    r=k+1
    while l+1<r:
        m=(l+r)//2
        if ok(m):l=m
        else:r=m
    print(l)

main()


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = 0;
        int r = k + 1;
        while (l + 1 < r) {
            int m = (l + r) / 2;
            if (ok(m, n, k)) {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }

    private static boolean ok(int m, int n, int k) {
        int s = 0;
        int cnt = 0;
        while (m > 0) {
            s += m;
            cnt += 1;
            if (s > k) {
                return false;
            }
            if (cnt == n) {
                break;
            }
            m >>= 1;
        }
        return true;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, and then uses a binary search to find the largest number `m` that satisfies the condition in the `ok` method. The `ok` method checks if it's possible to use `m` as the base for a geometric progression of `n` terms, such that the sum of the terms is less than or equal to `k`. If `m` is not a valid base, the `ok` method returns `false`; otherwise, it returns `true`.
<|EOT|>
