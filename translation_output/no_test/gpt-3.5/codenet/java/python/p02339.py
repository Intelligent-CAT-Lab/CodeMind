```python
import sys
from collections import deque

mod = 10**9 + 7

def solve():
    n, k = map(int, input().split())
    dp = [[0] * (k+1) for _ in range(n+1)]
    dp[0][0] = 1
    for i in range(n):
        for j in range(k):
            dp[i+1][j+1] = (dp[i][j] + (j+1) * dp[i][j+1]) % mod
    print(dp[n][k])

def main():
    solve()

if __name__ == "__main__":
    main()
```

