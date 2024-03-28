

```python
import math

r, c, a, b = map(int, input().split())
mod = 10**9 + 7
fact = [1] * (r + c)
ifact = [1] * (r + c)
for i in range(1, r + c):
    fact[i] = fact[i - 1] * i % mod
    ifact[i] = ifact[i - 1] * pow(i, mod - 2, mod) % mod
res = fact[r - 1 + c - 1] * ifact[r - 1] % mod * ifact[c - 1] % mod
sub = 0
for x in range(b):
    v1 = fact[r - a - 1 + x] * ifact[r - a - 1] % mod * ifact[x] % mod
    v2 = fact[a - 1 + c - 1 - x] * ifact[a - 1] % mod * ifact[c - 1 - x] % mod
    sub = (sub + v1 * v2 % mod) % mod
res = (res - sub + mod) % mod
print(res)
```

## Problem D: Iroha and a Grid

### Problem Statement

Iroha is playing a game on a grid with $R$ rows and $C$ columns. She starts at the top left corner and wants to reach the bottom right corner. She can only move right or down.

Iroha has a special power. She can teleport to any cell in the grid. She can use this power at most $K$ times.

What is the minimum number of moves she needs to reach the bottom right corner?

### Input Format

The first line contains three integers $R$, $C$, and $K$.

### Constraints

- $1 \leq R, C \leq 1000$
- $0 \leq K \leq 1000$

### Output Format

Print the minimum number of moves Iroha needs to reach the bottom right corner.

### Sample Input 1

```
2 3 1
```

### Sample Output 1

```
4
```

### Sample Input 2

```
2 3 2
```

### Sample Output 2

```
3
```

### Explanation

In the first sample, Iroha can use her special power to teleport to the cell $(1, 2)$. Then she can move down to the bottom right corner.

In the second sample, Iroha can use her special power to teleport to the cell $(1, 2)$. Then she can move right to the bottom right corner.

### Solution

The solution is similar to the previous problem. We can use dynamic programming to solve this problem. Let $dp[i][j]$ be the minimum number of moves to reach the cell $(i, j)$. Then we have the following recurrence:

$$
dp[i][j] = \begin{cases}
0 & \text{if } i = 0 \text{ and } j = 0 \\
1 + \min(dp[i - 1][j], dp[i][j - 1]) & \text{if } i > 0 \text{ and } j > 0 \\
1 + dp[i - 1][j] & \text{if } i > 0 \text{ and } j = 0 \\
1 + dp[i][j - 1] & \text{if } i = 0 \text{ and } j > 0
\end{cases}
$$

We can also use the following recurrence to avoid using $O(RC)$ memory:

$$
dp[i][j] = \begin{cases}
0 & \text{if } i = 0 \text{ and } j = 0 \\
1 + \min(dp[i - 1][j], dp[i][j - 1]) & \text{if } i > 0 \text{ and } j > 0 \\
1 +
