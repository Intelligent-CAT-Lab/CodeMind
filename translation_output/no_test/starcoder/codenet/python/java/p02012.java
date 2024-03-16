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
                if i!= m:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;
public class Main {
    static int solve() {
        int s = Integer.parseInt(br.readLine());
        if (s == 1) {
            System.out.println(1);
            return 0;
        }
        int[] lis = fact(s);
        int[] f = new int[s+1];
        int[] p = new int[s+1];
        Arrays.sort(lis);
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    if (p[a][b] == 1) {
                        f[a + b] += 1;
                        p[a][b] = 0;
                    }
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                if (p[a][b] == 1) {
                    int s_ = a + b;
                    if (s_ > s) {
                        break;
                    }
                    f[s_] += 1;
                    p[a][b] = 0;
                }
            }
        }
        int ans = 0;
        for (int k : lis) {
            ans += f[k] * f[s / k];
        }
        System.out.println(ans);
        return 0;
    }
    static int[][] p = new int[1001][1001];
    static int[] f = new int[1001];
    static int[] fact(int n) {
        if (n < 4) {
            return new int[]{1, n};
        }
        int[] res = new int[1000];
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                res[i] = 1;
                int m = n / i;
                if (i!= m) {
                    res[m] = 1;
                }
            }
            i++;
        }
        res[n] = 1;
        int cnt = 0;
        for (int j = 2; j <= n; j++) {
            if (res[j] == 1) {
                res[cnt++] = j;
            }
        }
        return Arrays.copyOf(res, cnt);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }
}

```
<|endoftext|>
