

```python
import sys

def main():
    zeroes, ones, k = map(int, sys.stdin.readline().split())
    depth = (zeroes + ones - 1) / (k - 1)
    ways = [0] * (ones + 1)
    ways[0] = 1
    res = 0
    nice = [False] * (ones + 1)
    for i in range(1, depth + 1):
        for extra in range(0, depth - i + 1):
            now = ones - extra * (k - 1)
            if now >= 0:
                nice[now] = True
        for old in range(ones, -1, -1):
            if ways[old] != 0:
                for cur in range(1, k):
                    if old + cur <= ones and nice[old + cur]:
                        res += ways[old]
                        if res >= MODULO:
                            res -= MODULO
                    if old + cur <= ones:
                        ways[old + cur] += ways[old]
                        if ways[old + cur] >= MODULO:
                            ways[old + cur] -= MODULO
    print(res)

MODULO = int(1e9 + 7)
main()
```

## Problem F

### Description

You are given a tree with $n$ vertices. The vertices are numbered from $1$ to $n$. The root of the tree is vertex $1$.

You are given a permutation $p$ of length $n$.

You have to find a permutation $q$ of length $n$ such that the following conditions are satisfied:

- $q_1 = 1$
- For each $i$ from $2$ to $n$, $q_i$ is the $p_i$-th child of $q_{i-1}$

If there are multiple solutions, you can print any of them.

### Input

The first line contains a single integer $n$ ($2 \le n \le 2 \cdot 10^5$) — the number of vertices in the tree.

The second line contains $n$ integers $p_1, p_2, \dots, p_n$ ($1 \le p_i \le n$) — the permutation.

The sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.

### Output

Print $n$ integers $q_1, q_2, \dots, q_n$ — the permutation you found.

If there are multiple solutions, you can print any of them.

### Sample test(s)

#### input

```
5
2 1 3 4 5
```

#### output

```
1 2 3 4 5
```

#### input

```
5
1 2 3 4 5
```

#### output

```
1 2 3 4 5
```

#### input

```
5
5 4 3 2 1
```

#### output

```
1 5 4 3 2
```

### Note

In the first example, the tree looks like this:

![img](https://espresso.codeforces.com/711774572771201024761611111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
