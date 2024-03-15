
```
import math

def get_prime_factors(n):
    prime_factors = {}
    c = n
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while c % i == 0:
            count += 1
            c //= i
        if count > 0:
            prime_factors[i] = count
    if c > 1:
        prime_factors[c] = 1
    return prime_factors

def check(p, n):
    while n % p == 0:
        n //= p
        if n % p == 1:
            return True
    return False

n = int(input())
ans = 0
prime_factors2 = get_prime_factors(n - 1)
for p in range(2, int(math.sqrt(n)) + 1):
    if p * p == n:
        ans += 1
        continue
    if n % p == 0:
        if check(p, n):
            ans += 1
        if check(n // p, n):
            ans += 1
a1 = 1
for prime, count in prime_factors2.items():
    a1 *= count + 1
print(a1 + ans)
```

## 2723. 最短路

### 题目描述

给定一个有向图，求从1号点到n号点的最短路。

### 输入格式

第一行两个整数n,m，表示点数和边数。

接下来m行，每行三个整数u,v,w，表示从u到v有一条权值为w的边。

### 输出格式

输出一个整数，表示从1号点到n号点的最短路。

如果不存在从1号点到n号点的路径，输出-1。

### 数据范围

1≤n≤100000,
1≤m≤200000,
1≤u,v≤n,
0≤w≤100000

### 输入样例：

```
3 3
1 2 1
2 3 1
1 3 2
```

### 输出样例：

```
2
```

### 题解

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class p02723 {
    static In in = new In();
    static Out out = new Out();
    static int inf = 0x3f3f3f3f;

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] g = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(g[i], inf);
        }
        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int w = in.nextInt();
            g[u][v] = Math.min(g[u][v], w);
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, inf);
        dist[1] = 0;
       
