

```python
import sys

MODULO = 998244353

def main():
    height, width = map(int, sys.stdin.readline().split())
    ph = [1]
    for i in range(1, width + 1):
        ph.append(ph[i - 1] * (height + 1) % MODULO)
    pw = [1]
    for i in range(1, height + 1):
        pw.append(pw[i - 1] * (width + 1) % MODULO)
    res = 0
    for common in range(min(height, width) + 1):
        ways = 1
        ways *= facts[height] * invfacts[common] % MODULO * invfacts[height - common] % MODULO
        ways *= facts[width] * invfacts[width - common] % MODULO * invfacts[common] % MODULO
        ways *= ph[width - common] % MODULO * pw[height - common] % MODULO
        if common % 2 == 0:
            res += ways
        else:
            res -= ways
    res %= MODULO
    if res < 0:
        res += MODULO
    print(res)

k = 500000
invs = [1]
for i in range(2, k + 2):
    invs.append((MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO)
facts = [1]
invfacts = [1]
for i in range(1, k + 2):
    facts.append(facts[i - 1] * i % MODULO)
    invfacts.append(invfacts[i - 1] * invs[i] % MODULO)

if __name__ == '__main__':
    main()
```

## Problem G

### Problem

You are given a tree with $n$ vertices. The vertices are numbered from $1$ to $n$. The root of the tree is vertex $1$.

You are given a sequence of $n$ integers $a_1, a_2, \ldots, a_n$.

You have to find a sequence of $n$ integers $b_1, b_2, \ldots, b_n$ such that:

- $b_1 = a_1$
- For each $i$ from $2$ to $n$, $b_i$ is equal to the sum of $b_j$ over all children $j$ of vertex $i$.

If there are multiple solutions, you may find any of them. It can be proved that the answer always exists.

### Input

The first line contains a single integer $n$ ($2 \le n \le 2 \cdot 10^5$) — the number of vertices in the tree.

The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($0 \le a_i \le 10^9$).

The next $n - 1$ lines describe the edges of the tree. Each line contains two integers $u$ and $v$ ($1 \le u, v \le n$, $u \ne v$) denoting an edge between vertices $u$ and $v$.

It is guaranteed that the given graph is a tree.

### Output

Print $n$ integers $b_1, b_2, \ldots, b_n$ — the answer to the problem.

### Example

input:
```
5
1 2 3 4 5
1 2
1 3
3 4
3 5
```

output:
```
1 3 6 10 15
```

### Solution

The solution is to use a dfs to calculate the sum of all children of each node.

```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    edges = [[] for _ in range(n)]
    for _ in range(n - 1):
        u, v = map(int, sys.stdin.readline().split())
        edges[u - 1].append(v - 1)
        edges[v - 1].append(u - 1)
    b = [0] * n
    def dfs(u, p):
        for v in edges[u]:
            if v != p:
                dfs(v, u)
                b[u] += b[v]
    dfs(0, -1)
    b[0] = a[0]
