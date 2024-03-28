

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

## 2019-09-29

### 1. [1000000000000000000](https://www.luogu.org/problem/P4777)

#### 题目描述

给定一个长度为 $n$ 的序列 $a_1,a_2,\dots,a_n$，求满足 $a_i\oplus a_j\oplus a_k\oplus a_l=0$ 的四元组 $(i,j,k,l)$ 的个数。其中 $1\le i<j<k<l\le n$，$\oplus$ 表示按位异或。

#### 输入格式

第一行一个正整数 $n$。

第二行 $n$ 个正整数 $a_1,a_2,\dots,a_n$。

#### 输出格式

一个整数表示答案。

#### 样例

##### 样例输入

```
4
1 2 3 4
```

##### 样例输出

```
2
```

#### 数据范围与提示

对于 $100\%$ 的数据，$1\le n\le 10^5,1\le a_i\le 10^9$。

#### 题解

首先，我们可以发现，如果 $a_i\oplus a_j=a_k\oplus a_l$，那么 $(i,j,k,l)$ 就是一个满足条件的四元
