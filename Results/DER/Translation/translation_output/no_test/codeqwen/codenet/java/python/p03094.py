Here is the Python version of the Java code:

```python
import sys

P = 10**9 + 7

def solve():
    n = int(input())
    dp = [1, 0, 0]

    inv = [1] * (n + 7)
    for x in range(2, len(inv)):
        inv[x] = P - (P // x) * inv[P % x] % P

    coef = 1
    ret = 0
    for k in range(1, n + 1):
        nxt = [0] * 3
        for j1 in range(3):
            for j2 in range(3):
                if j1 != j2:
                    nxt[j2] += dp[j1]
                    if nxt[j2] >= P:
                        nxt[j2] -= P
        dp = nxt

        coef = (coef * (n - k + 1) * inv[k]) % P

        ways = (dp[1] * coef) % P

        delta = (inv[3] * inv[n] * inv[k] * ways) % P

        ret += delta

    ret %= P

    for i in range(1, n):
        ret = ret * inv[3] % P

    print(ret)

solve()
```

This Python code does the same thing as the Java code. It reads an integer `n` from the standard input, calculates the number of ways to choose three distinct numbers from `1` to `n` such that the sum of the numbers is divisible by `3`, and prints the result modulo `P`.
