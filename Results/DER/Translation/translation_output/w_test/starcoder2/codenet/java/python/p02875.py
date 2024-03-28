

```python
import sys

mod = 998244353

n = int(sys.stdin.readline())
n //= 2
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

You are given a sequence of $n$ integers $a_1, a_2, \ldots, a_n$.

You have to find a sequence of $n$ integers $b_1, b_2, \ldots, b_n$ such that:

- $b_1 = a_1$
- for each $i$ from $2$ to $n$, $b_i$ is equal to the number of vertices $j$ such that $j$ is an ancestor of $i$ and $a_j = a_i$

### Input

The first line contains a single integer $n$ ($1 \le n \le 2 \cdot 10^5$) — the number of vertices in the tree.

The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($1 \le a_i \le n$) — the sequence $a$.

The next $n - 1$ lines describe the edges of the tree. Each line contains two integers $u$ and $v$ ($1 \le u, v \le n$, $u \ne v$) — the vertices connected by an edge.

It is guaranteed that the given graph is a tree.

### Output

Print $n$ integers $b_1, b_2, \ldots, b_n$ — the sequence $b$.

### Examples

#### input

```
5
1 2 2 3 3
1 2
1 3
2 4
2 5
```

#### output

```
1 2 2 1 1
```

#### input

```
5
1 2 3 4 5
1 2
1 3
2 4
2 5
```

#### output

```
1 0 0 0 0
```

### Note

In the first example, the sequence $b$ is $[1, 2, 2, 1, 1]$.

In the second example, the sequence $b$ is $[1, 0, 0, 0, 0]$.

### Solution

The solution is to use a segment tree.

For each node, we maintain a segment tree that stores the number of nodes with the same value as the current node.

