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

### Response:
```java
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int I() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static long sum(long a, long b) {
        return ((b + a) * (b - a + 1)) >> 1;
    }

    static ArrayList<Integer> fact(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        if (n < 4)
            return res;
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                res.add(i);
                int m = n / i;
                if (i != m)
                    res.add(m);
            }
            i += 1;
        }
        res.add(n);
        return res;
    }

    static void solve() throws IOException {
        int s = I();
        if (s == 1) {
            System.out.println(1);
            return;
        }
        ArrayList<Integer> lis = fact(s);
        HashMap<Integer, Integer> f = new HashMap<>();
        HashMap<String, Boolean> p = new HashMap<>();
        Collections.sort(lis);
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    if (p.getOrDefault((a + "-" + b), true)) {
                        f.put(sum(a, b), f.getOrDefault(sum(a, b), 0) + 1);
                        p.put((a + "-" + b), false);
                    }
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                if (p.getOrDefault((a + "-" + b), true)) {
                    long s_ = sum(a, b);
                    if (s_ > s)
                        break;
                    f.put((int)s_, f.getOrDefault((int)s_, 0) + 1);
                    p.put((a + "-" + b), false);
                }
            }
        }
        long ans = 0;
        for (int k : lis) {
            ans += f.getOrDefault(k, 0) * f.getOrDefault(s / k, 0);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the factors of that integer, and then counts the number of pairs of factors that sum to the original integer. The result is printed to the standard output.
<|EOT|>
