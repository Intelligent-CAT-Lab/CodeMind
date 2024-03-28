
```python
import math

def primes(N):
    ret = []
    bs = [False] * (N + 1)
    for i in range(2, N + 1):
        if not bs[i]:
            ret.append(i)
            for j in range(i * 2, N + 1, i):
                bs[j] = True
    return ret

A, B = map(int, input().split())
L = max(A - B, 2)
H = A + B
primes = primes(int(math.sqrt(H) + 1))
count = [0] * (H - L + 1)
ok = [True] * (H - L + 1)
for i in range(len(primes) - 1, -1, -1):
    p = primes[i]
    div = (L + (p - 1)) // p
    for pos in range(div * p, H + 1, p):
        cc = 1
        v = div
        while v % p == 0:
            cc += 1
            v //= p
        if count[pos - L] > cc:
            ok[pos - L] = False
        count[pos - L] = cc

ret = 0
for i in range(len(ok)):
    if ok[i]:
        ret += 1
print(ret)
```

## 1393. 二分图

### 题目描述

给定一个无向图，判断是否为二分图。

### 输入格式

第一行包含两个整数 n,m，表示图的点数和边数。

接下来 m 行，每行包含两个整数 u,v，表示 u 与 v 之间有一条边。

### 输出格式

如果是二分图，输出 YES，否则输出 NO。

### 数据范围

1≤n≤100000,
1≤m≤200000,
1≤u,v≤n

### 输入样例：

```
4 4
1 2
2 3
3 4
4 1
```

### 输出样例：

```
YES
```

### 题解

```python
n, m = map(int, input().split())

graph = [[] for _ in range(n + 1)]
for _ in range(m):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

color = [0] * (n + 1)

def dfs(u, c):
    color[u] = c
    for v in graph[u]:
        if color[v] == 0:
            if not dfs(v, -c):
                return False
        elif color[v] == c:
            return False
    return True

if dfs(1, 1):
    print('YES')
else:
    print('NO')
```

## 1394. 二分图的最大匹配

### 题目描述

给定一个二分图，其中左半部包含 n 个点（编号 1∼n），右半部包含 m 个点（编号 1∼m），二分图共包含 n+m 个点和 k 条边。

求出二分图的最大匹配数。

### 输入格式

第一行包含三个整数 n,m,k。

接下来 k 行，每行包含两个整数 u,v，表示点 u 和点 v 之间存在一条边。

### 输出格式

输出一个整数，表示二分图的最大匹配数。

### 数据范围

1≤n,m≤500,
1≤k≤10000,
1≤u≤n,
n+1≤v≤n+m

### 输入样例：

```
2 3 4
1 4
1 5
2 4
2 5
```

### 输出样例：

```
2
```

### 题解

```python
n, m, k = map(int, input().split())

graph = [[] for _ in range(n + m + 1)]
for _ in range(k):
    u, v = map(int, input().split())
    graph[u].append(v + n)
    graph[v + n].append(u)

match = [0] * (n + m + 1)

def dfs(u):
    for v in graph[u]:
        if not used[v]:
            used[v] = True
            if not match[v] or dfs(match[v]):
                match[v] = u
                return True
    return False

ans = 0
for i in range(1, n + 1):
    used = [False] * (n + m + 1)
    if dfs(i):
        ans += 1
print(ans)
```

## 1395. 二分图的最大独立集

### 题目描述

给定一个二分图，其中左半部包含 n 个点（编号 1∼n），右半部包含 m 个点（编号 1∼m），二分图共包含 n+m 个点和 k 条边。

求出一个最大的点独立集（点集中的点两两之间没有边）。

### 输入格式

第一行包含三个整数 n,m,k。

接下来 k 行，每行包含两个整数 u,v，表示点 u 和点 v 之间存在一条边。

### 输出格式

第一行输出一个整数，表示最大的点独立集包含多少个点。

接下来一行，输出一个点独立集，点之间用空格隔开。

### 数据范围

1
