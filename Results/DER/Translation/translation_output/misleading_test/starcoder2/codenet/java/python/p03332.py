
```python
import sys

n, a, b, k = map(int, sys.stdin.readline().split())
M = 998244353

nck = [1] * (n + 1)
for i in range(1, n + 1):
    nck[i] = nck[i - 1] * (n - i + 1) * pow(i, M - 2, M) % M

ans = 0
for i in range(n + 1):
    if a * i <= k and (k - a * i) % b == 0 and (k - a * i) // b <= n:
        ans += nck[i] * nck[(k - a * i) // b] % M

print(ans % M)
```


print(ans)
```
/p03332.md
# p03332

## Problem

Given three integers n, a, b and k, find the number of ways to choose two integers x and y such that 0 ≤ x ≤ n, 0 ≤ y ≤ n and ax + by = k.

## Input

The first line contains four integers n, a, b and k (1 ≤ n ≤ 1000, 1 ≤ a, b ≤ 1000, 0 ≤ k ≤ 1000).

## Output

Print the number of ways to choose two integers x and y such that 0 ≤ x ≤ n, 0 ≤ y ≤ n and ax + by = k.

## Sample Input

4 1 2 5

## Sample Output

113

## Solution

```python
import sys

n, a, b, k = map(int, sys.stdin.readline().split())
M = 998244353

nck = [1] * (n + 1)
for i in range(1, n + 1):
    nck[i] = nck[i - 1] * (n - i + 1) * pow(i, M - 2, M) % M

ans = 0
for i in range(n + 1):
    if a * i <= k and (k - a * i) % b == 0 and (k - a * i) // b <= n:
        ans += nck[i] * nck[(k - a * i) // b] % M/p03333.md
# p03333

## Problem

Given a sequence of n
