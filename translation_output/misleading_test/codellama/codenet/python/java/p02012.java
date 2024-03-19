<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
25

Expected output:
-86

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
def S(): return list(sys.stdin.readline())[:-1]
def IR(n):
    return [I() for i in range(n)]
def LIR(n):
    return [LI() for i in range(n)]
def SR(n):
    return [S() for i in range(n)]
def LSR(n):
    return [LS() for i in range(n)]

sys.setrecursionlimit(1000000)
mod = 1000000007

def solve():
    def sum(a,b):
        return ((b+a)*(b-a+1)) >> 1
    def fact(n):
        if n < 4:
            return [1,n]
        res = [1]
        i = 2
        while i**2 <= n:
            if n%i == 0:
                res.append(i)
                m = n//i
                if i != m:
                    res.append(m)
            i += 1
        res.append(n)
        return res
    s = I()
    if s == 1:
        print(1)
        return
    lis = fact(s)
    f = defaultdict(lambda : 0)
    p = defaultdict(lambda : 1)
    lis.sort()
    for k in lis:
        for a in range(1,k+1):
            b = k-a
            if a <= b:
                if p[(a,b)]:
                    f[sum(a,b)] += 1
                    p[(a,b)] = 0
                    
        for a in range(1,s+1):
            b = k+a-1
            if p[(a,b)]:
                s_ = sum(a,b)
                if s_ > s:
                    break
                f[s_] += 1
                p[(a,b)] = 0
    ans = 0
    for k in lis:
        ans += f[k]*f[s//k]
    print(ans)
    return

#Solve
if __name__ == "__main__":
    solve()


```
[/INST]

Here is the Java code for the given Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s == 1) {
            System.out.println(1);
            return;
        }
        List<Integer> lis = fact(s);
        Map<Integer, Integer> f = new HashMap<>();
        Map<Integer, Integer> p = new HashMap<>();
        lis.sort(Comparator.naturalOrder());
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    if (p.get((a, b)) != null) {
                        f.put(sum(a, b), f.getOrDefault(sum(a, b), 0) + 1);
                        p.put((a, b), null);
                    }
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                if (p.get((a, b)) != null) {
                    int s_ = sum(a, b);
                    if (s_ > s) {
                        break;
                    }
                    f.put(s_, f.getOrDefault(s_, 0) + 1);
                    p.put((a, b), null);
                }
            }
        }
        int ans = 0;
        for (int k : lis) {
            ans += f.get(k) * f.get(s / k);
        }
        System.out.println(ans);
    }

    private static List<Integer> fact(int s) {
        List<Integer> res = new ArrayList<>();
        if (s < 4) {
            res.add(1);
            res.add(s);
            return res;
        }
        res.add(1);
        int i = 2;
        while (i * i <= s) {
            if (s % i == 0) {
                res.add(i);
                int m = s / i;
                if (i != m) {
                    res.add(m);
                }
            }
            i++;
        }
        res.add(s);
        return res;
    }

    private static int sum(int a, int b) {
        return ((b + a) * (b - a + 1)) >> 1;
    }
}
```
Note that this code is not optimized for performance, and it may not produce the same output as the Python code for large inputs.</s>
