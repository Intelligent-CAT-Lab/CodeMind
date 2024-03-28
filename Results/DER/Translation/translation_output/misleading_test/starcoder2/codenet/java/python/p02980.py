

```python
import math

MODULO = 998244353

def nCr(n, r):
    return math.factorial(n) // (math.factorial(r) * math.factorial(n - r))

def solve(height, width):
    ph = [1]
    for i in range(1, width + 1):
        ph.append(ph[i - 1] * (height + 1) % MODULO)
    pw = [1]
    for i in range(1, height + 1):
        pw.append(pw[i - 1] * (width + 1) % MODULO)
    res = 0
    for common in range(min(height, width) + 1):
        ways = nCr(height, common) * nCr(width, common) * ph[width - common] * pw[height - common]
        if common % 2 == 0:
            res += ways
        else:
            res -= ways
    res %= MODULO
    if res < 0:
        res += MODULO
    return res

height, width = map(int, input().split())
print(solve(height, width))
```

## Problem G

### Problem

You are given a tree with $N$ vertices. The vertices are numbered $1$ through $N$. The $i$-th of the $N-1$ edges connects Vertex $a_i$ and Vertex $b_i$.

Find the number of pairs of vertices $(u,v)$ such that the distance between $u$ and $v$ is exactly $K$.

### Constraints

* $2 \leq N \leq 2 \times 10^5$
* $1 \leq K \leq N-1$
* $1 \leq a_i,b_i \leq N$
* The given graph is a tree.

### Input

Input is given from Standard Input in the following format:

```
N K
a_1 b_1
a_2 b_2
:
a_{N-1} b_{N-1}
```

### Output

Print the number of pairs of vertices $(u,v)$ such that the distance between $u$ and $v$ is exactly $K$.

### Sample Input 1

```
4 2
1 2
2 3
2 4
```

### Sample Output 1

```
2
```

### Sample Input 2

```
5 3
1 2
2 3
3 4
4 5
```

### Sample Output 2

```
2
```

### Sample Input 3

```
10 4
1 2
1 3
1 4
1 5
1 6
1 7
1 8
1 9
1 10
```

### Sample Output 3

```
10
```

### Note

In the first sample, the pairs of vertices $(u,v)$ such that the distance between $u$ and $v$ is exactly $2$ are $(1,3)$ and $(1,4)$.

In the second sample, the pairs of vertices $(u,v)$ such that the distance between $u$ and $v$ is exactly $3$ are $(1,4)$ and $(1,5)$.

In the third sample, the pairs of vertices $(u,v)$ such that the distance between $u$ and $v$ is exactly $4$ are $(1,2)$, $(1,3)$, $(1,4)$, $(1,5)$, $(1,6)$, $(1,7)$, $(1,8)$, $(1,9)$, $(1,10)$, and $(2,3)$.

### Solution

The solution is based on the following observation:

* If the distance between $u$ and $v$ is $K$, then the distance between $u$ and $v$ in the tree obtained by removing the edge connecting $u$ and $v$ is $K-1$.

The solution is to find the number of pairs of vertices $(u,v)$ such that the distance between $u$ and $v$ in the tree obtained by removing the edge connecting $u$ and $v$ is $K-1$.

The number of pairs of vertices $(u,v)$ such that the distance between $u$ and $v$ in the tree obtained by removing the edge connecting $u$ and $v$ is $K-1$ can be calculated as follows:

* Let $d_i$ be the number of vertices that are at distance $K-1$ from vertex $i$ in
