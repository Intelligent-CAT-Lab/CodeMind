

```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 1000000007;
    static int[][][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        dp = new int[n+1][n+1][k+2*(n+1)];
        dp[0][0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                for (int l = 0; l <= k; l++) {
                    dp[i+1][j+1][l+2*(j+1)] += dp[i][j][l];
                    dp[i+1][j+1][l+2*(j+1)] %= mod;
                    dp[i+1][j][l+2*j] += dp[i][j][l]*(j*2+1);
                    dp[i+1][j][l+2*j] %= mod;
                    if (j != 0) {
                        dp[i+1][j-1][l+(j-1)*2] += dp[i][j][l]*j*j;
                        dp[i+1][j-1][l+(j-1)*2] %= mod;
                    }
                }
            }
        }
        System.out.println(dp[n][0][k]%mod);
    }
}
```


```

java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int[] a = new int[n];
        s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = i;
            while (l < r) {
                int mid = (l+r)/2;
                if (a[i] - a[mid] <= k) {
                    r = mid;
                } else {
                    l = mid+1;
                }
            }
            ans += i-l;
        }
        System.out.println(ans);
    }
}
```
/content/posts/2020-04-05-Atcoder-ABC161-D.md
---
template: post
title: Atcoder ABC161 D
date: 2020-04-05T10:00:00.000Z
draft: false
description: >-
  Translate the following python code to java and enclose your solution inside
  ```java```. A sample test case is provided below:
category: Atcoder
tags:
  - Atcoder
  - Java
---
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 1

Expected output:
10


```
from collections import defaultdict, deque, Counter
from heapq import heappush, heappop, heapify
import math
from bisect import bisect_left, bisect_right
import random
from itertools import permutations, accumulate, combinations
import sys
import string



INF = float('inf')
def LI(): return list(map(int, sys.stdin.readline().split()))
def I(): return int(sys.stdin.readline())
def LS(): return sys.stdin.readline().split()
def S(): return sys.stdin.readline().strip()
def IR(n): return [I() for i in range(n)]
def LIR(n): return [LI() for i in range(n)]
def SR(n): return [S() for i in range(n)]
def LSR(n): return [LS() for i in range(n)]
def SRL(n): return [list(S()) for i in range(n)]
def MSRL(n): return [[int(j) for j in list(S())] for i in range(n)]
mod = 10 ** 9 + 7


n, k = LI()
a = LI()
a.sort()
ans = 0
for i in range(n):
    l = 0
    r = i
    while l < r:
        mid = (l+r)//2
        if a[i] - a[mid] <= k:
            r = mid
        else:
            l = mid+1
    ans += i-l
print(ans)
/content/posts/2020-04-05-Atcoder-ABC161-C.md
---
template: post
title: Atcoder ABC161 C
date: 2020-04-05T10:00:00.000Z
draft: false
description: >-
  Translate the following python code to java and enclose your solution inside
  ```java```. A sample test case is provided below:
category: Atcoder
tags:
  - Atcoder
  - Java
---
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 3

Expected output:
1


```
from collections import defaultdict, deque, Counter
from heapq import heappush, heappop, heapify
import math
from bisect import bisect_left, bisect_right
import random
from itertools import permutations, accumulate, combinations
import sys
import string



INF = float('inf')
def LI(): return list(map(int, sys.stdin.readline().split()))
def I(): return int(sys.stdin.readline())
def LS(): return sys.stdin.readline().split()
def S(): return sys.stdin.readline().strip
