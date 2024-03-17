

```python
import sys

def solve():
    n, k, mod = map(int, sys.stdin.readline().split())
    if k % 2 == 0:
        print(solve2(n // 2, k // 2 + 1) * solve2((n + 1) // 2, k // 2 + 1) % mod)
    else:
        dyn = [[0] * (k + 2) for _ in range(k + 2)]
        dyn[0][0] = 1
        ndyn = [[0] * (k + 2) for _ in range(k + 2)]
        for i in range((n | 1) // 2 + k // 2 + 2):
            for a in ndyn:
                a[:] = [0] * (k + 2)
            mask = (i < (n + 1) // 2) + (i >= k // 2 + 2) * 2
            for m in range(mask, -1, -1):
                for j in range(k + 2):
                    for jj in range(k + 2):
                        nj = (m & 1) * (j + 1 if j + 1 <= k + 1 else 0)
                        njj = (m & 2) * (max(j, jj) + 1 if j != 0 or jj != 0 else 0)
                        if nj < k + 2 and njj < k + 2:
                            ndyn[nj][njj] = (ndyn[nj][njj] + dyn[j][jj]) % mod
            dyn, ndyn = ndyn, dyn
        ans = 0
        for i in range(k + 2):
            for j in range(k + 2):
                ans = (ans + dyn[i][j]) % mod
        print(ans)

def solve2(n, k):
    dyn = [1] * k
    for i in range(n):
        v = dyn[k - 1]
        for j in range(k - 2, -1, -1):
            dyn[j + 1] = (dyn[j + 1] + v) % mod
        dyn[0] = v
    return dyn[k - 1]

solve()
```

## 2980 - 2016 ACM/ICPC Asia Regional Shenyang Online

### 题目描述

给定一个长度为n的序列，每次可以选择一个区间，将区间内的数全部加上一个数，问最少需要多少次操作可以使得序列中的所有数都相同。

### 输入格式

第一行一个整数n，表示序列的长度。

接下来一行n个整数，表示序列中的数。

### 输出格式

输出一个整数，表示最少需要的操作次数。

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
4
```

### 数据范围

对于100%的数据，1≤n≤100000，序列中的数的绝对值不超过100000。

### 题解

首先，我们可以发现，如果我们将区间内的数全部加上一个数，那么这个操作等价于将区间的左端点加上这个数，将区间的右端点减去这个数。

然后，我们可以发现，如果我们将区间内的数全部加上一个数，那么这个操作等价于将区间的左端点加上这个数，将区间的右端点减去这个数。

然后，我们可以发现，如果我们将区间内的数全部加上一个数，那么这个操作等价于将区间的左端点加上这个数，将区
