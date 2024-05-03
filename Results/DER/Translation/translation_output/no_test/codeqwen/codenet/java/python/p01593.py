Here is the Python equivalent of the Java code:

```python
import sys

INF = 1 << 28
EPS = 1e-12

n, m = map(int, sys.stdin.readline().split())

def solve():
    dp = [0] * (n + 1)
    dp[0] = 1
    for j in range(1, n + 1):
        for i in range(1, min(m, j) + 1):
            dp[j] += dp[j - i] / j
    print("%.12f" % dp[n])

solve()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the probability of getting exactly `n` successes in `m` trials, and prints the result with 12 decimal places.
