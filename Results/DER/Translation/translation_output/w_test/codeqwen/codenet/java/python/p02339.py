```python
import sys
import math

def solve():
    n = int(input())
    k = int(input())
    dp = [[0]*(k+1) for _ in range(n+1)]
    dp[0][0] = 1
    for i in range(n):
        for j in range(k):
            dp[i+1][j+1] = (dp[i][j] + (j+1)*dp[i][j+1]) % mod
            dp[i+1][j+1] %= mod
    print(dp[n][k])

mod = 10**9 + 7

solve()
```
