

```python
low = 1
high = 3 ** 32
n = int(input())

def dfs(pos, pace):
    if pos > n:
        return 0
    # 3.0X
    if pace < high:
        npace = 3 * pace
        npos = pos + npace
        if npos == n and (npace == 1 or npace == 3):
            return 1
        else:
            temp = dfs(npos, npace)
            if temp != 0:
                return 1 + temp
    # 1.0X
    npace = pace
    npos = npace + pos
    if npos == n and (npace == 1 or npace == 3):
        return 1
    else:
        temp = dfs(npos, npace)
        if temp != 0:
            return 1 + temp
    # 0.3X
    if pace > low:
        npace = pace / 3
        npos = pos + npace
        if npos == n and (npace == 3 or npace == 1):
            return 1
        else:
            temp = dfs(npos, npace)
            if temp != 0:
                return 1 + temp
    return 0

ans = -1 if n == 0 else dfs(1, 1)
print(ans + 1)
```

## 00980. 最短路径

### 题目描述

给定一个n*m的矩阵，矩阵中有0和1两种元素，其中1代表墙，0代表路。

现在从左上角出发，只能向右走或者向下走，问从左上角走到右下角最少需要多少步。

### 输入格式

第一行两个整数n,m，表示矩阵的大小。

接下来n行，每行m个整数，0或1，表示矩阵中的元素。

### 输出格式

一个整数，表示从左上角走到右下角最少需要多少步。

### 数据范围

1≤n,m≤1000

### 输入样例：

```
5 5
0 1 0 0 0
0 1 0 1 0
0 0 0 0 0
0 1 1 1 0
0 0 0 1 0
```

### 输出样例：

```
8
```

### 题解

```python
n, m = map(int, input().split())

a = []
for i in range(n):
    a.append(list(map(int, input().split())))

f = [[0] * m for _ in range(n)]
f[0][0] = 1

for i in range(n):
    for j in range(m):
        if a[i][j] == 1:
            f[i][j] = 0
            continue
        if i > 0:
            f[i][j] += f[i - 1][j]
        if j > 0:
            f[i][j] += f[i][j - 1]

print(f[n - 1][m - 1])
```

## 00981. 最短Hamilton路径

### 题目描述

给定一个n个点m条边的无向图，图中可能存在重边和自环，边权可能为负数。

请你求出从1号点到n号点的最短Hamilton路径，即经过每个点恰好一次的最短路径。

### 输入格式

第一行包含两个整数n和m。

接下来m行，每行包含三个整数x,y,z，表示点x和点y之间存在一条权值为z的边。

### 输出格式

输出一个整数，表示从1号点到n号点的最短Hamilton路径的长度。

如果不存在这样的路径，则输出-1。

### 数据范围

1≤n≤20,
1≤m≤n∗(n−1)/2,
图中涉及边的边权的绝对值均不超过10000。

### 输入样例：

```
5 7
1 2 2
1 3 2
1 4 2
1 5 2
2 4 1
3 4 3
3 5 3
```

### 输出样例：

```
6
```

### 题解

```python
n, m = map(int, input().split())

g = [[0x3f3f3f3f] * n for _ in range(n)]
for i in range(m):
    x, y, z = map(int, input().split())
    x -= 1
    y -= 1
    g[x][y] = min(g[x][y], z)
    g[y][x] = min(g[y][x], z)

f = [[0x3f3f3f3f] * (1 << n) for _ in range(n)]
f[0][1] = 0

for i in range(1, 1 << n):
    for j in range(n):
        if (i >> j) & 1:
            for k in range(n):
                if (i >> k) & 1:
                    f[j][i] = min(f[j][i], f[k][i - (1 << j)] + g[k][j])

ans = 0x3f3f3f3f
for i in range(1, n):
    ans = min(ans, f[i][(1 << n) - 1] + g[i][0])

print(-1 if ans == 0x3f3f3f3f else ans)
```

## 00982. 任务安排

### 题目描述

小明有n个任务，第i个任务需要xi的时间。

小明当前有一台空闲的机器，可以在任意时刻开始执行任意一个任务。

小明现在想知道，按照上述规则，这些任务最少需要多少时间才能执行完。

### 输入格式

第一行包含整数n。

接下来n行，每行包含一个整数xi。

### 输出格式

输出一个整数，表示完成所有任务需要的时间。

### 数据范围

1≤n≤10000,
