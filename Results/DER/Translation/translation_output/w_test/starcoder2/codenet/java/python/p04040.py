

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

Iroha has a special power. She can teleport to any cell in the grid. However, she can only teleport to a cell if it is in the same row or column as the cell she is currently in.

Iroha wants to know how many different ways she can reach the bottom right corner. Since the answer can be very large, output it modulo $10^9 + 7$.

### Input Format

The first line of input contains four integers $R$, $C$, $A$, and $B$ ($1 \leq R, C \leq 10^9$, $1 \leq A \leq R$, $1 \leq B \leq C$).

### Output Format

Output a single integer, the number of ways Iroha can reach the bottom right corner modulo $10^9 + 7$.

### Sample Input

```
2 3 1 1
```

### Sample Output

```
2
```

### Explanation

Iroha can either move right twice or move down and then right.

### Solution

The number of ways to reach the bottom right corner is the number of ways to reach the bottom right corner without teleporting, minus the number of ways to reach the bottom right corner with teleporting.

The number of ways to reach the bottom right corner without teleporting is $\binom{R - 1 + C - 1}{R - 1}$.

The number of ways to reach the bottom right corner with teleporting is the sum of $\binom{R - A - 1 + x}{R - A - 1} \cdot \binom{A - 1 + C - 1 - x}{A - 1}$ for $0 \leq x < B$.

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
   
