

```python
import sys

mod = 998244353

n = int(sys.stdin.readline()) // 2
res = 7
p2 = 8
num = 1
den = 2
for i in range(1, n):
    res *= 9
    if i > 1:
        inc = p2
        inc *= num
        inc %= mod
        inc *= pow(den, mod - 2, mod)
        inc %= mod
        res += inc
    res %= mod
    p2 = (p2 * 2) % mod
    k = i
    num *= 2 * k
    num %= mod
    num *= 2 * k + 1
    num %= mod
    if k > 1:
        den *= k - 1
    den %= mod
    den *= k + 2
    den %= mod
print(res)
```

## Problem D

### Problem

You are given a tree with $n$ vertices. The vertices are numbered from $1$ to $n$. The root of the tree is vertex $1$.

You are also given a sequence $a_1, a_2, \ldots, a_n$ of integers.

You have to answer $q$ queries. In each query, you are given two integers $v$ and $x$. You have to find the number of vertices $u$ such that the distance between $u$ and $v$ is exactly $x$ and $a_u = a_v$.

### Input

The first line contains two integers $n$ and $q$ ($1 \le n, q \le 2 \cdot 10^5$) — the number of vertices in the tree and the number of queries.

The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($1 \le a_i \le n$) — the sequence of integers.

Each of the next $n - 1$ lines contains two integers $u$ and $v$ ($1 \le u, v \le n$, $u \ne v$) denoting an edge between vertices $u$ and $v$. It is guaranteed that the given edges form a tree.

Each of the next $q$ lines contains two integers $v$ and $x$ ($1 \le v \le n$, $0 \le x \le n - 1$) — the description of a query.

### Output

For each query, print the answer on a separate line.

### Example

input:
```
5 3
1 2 3 4 5
1 2
1 3
2 4
2 5
1 0
1 1
1 2
```

output:
```
4
2
1
```

### Solution

The solution is to use a segment tree to store the number of vertices with the same value as the root of the tree.

For each query, we can find the LCA of the two vertices, and then we can find the number of vertices with the same value as the root of the tree in the subtree of the LCA.

The time complexity is $O(n \log n + q \log n)$.

### Code

```cpp
#include <bits/stdc++.h>
using namespace std;

const int N = 2e5 + 10;

int n, q;
int a[N];
vector
