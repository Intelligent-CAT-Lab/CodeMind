
```python
import sys

M = 998244353

def modI(a, m):
    if a <= 1:
        return 1
    return ((1 - modI(m % a, a) * m) // a + m) % m

def nck(n):
    nck = [1]
    for i in range(1, n + 1):
        nck.append(nck[i - 1] * (n - i + 1) % M * modI(i, M) % M)
    return nck

n, a, b, k = map(int, sys.stdin.readline().split())
nck = nck(n)
ans = 0
for i in range(n + 1):
    if a * i <= k and (k - a * i) % b == 0 and (k - a * i) // b <= n:
        ans += nck[i] * nck[(k - a * i) // b] % M
print(ans % M)
```

## 3333. [USACO19DEC]Cowntagion

### 题目描述

给定一个$n$个点$m$条边的无向图，求出一个最小的点集$S$，使得$S$中的点可以覆盖所有边。

### 输入格式

第一行两个整数$n,m$。

接下来$m$行，每行两个整数$u,v$，表示一条$u$到$v$的无向边。

### 输出格式

输出一个整数，表示最小的点集$S$的大小。

### 样例

#### 样例输入

```
4 4
1 2
2 3
3 4
4 1
```

#### 样例输出

```
2
```

### 数据范围

对于$100\%$的数据，$1\le n\le 10^5,1\le m\le 2\times 10^5$。

### 题解

显然，如果一个点集$S$可以覆盖所有边，那么$S$的任意一个真子集都不可以覆盖所有边。

因此，我们可以枚举$S$的大小，然后判断是否存在一个点集$S$可以覆盖所有边。

我们可以用并查集维护每个点所在的连通块，然后枚举每个点，如果这个点不在$S$中，那么我们就把这个点所在的连通块合并到$S$中。

### 代码

```c++
#include <bits/stdc++.h>
using namespace std;

const int N = 1e5 + 10;

