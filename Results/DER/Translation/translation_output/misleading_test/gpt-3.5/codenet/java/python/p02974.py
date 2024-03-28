```python
import sys

def solve():
    n, K = map(int, input().split())
    
    if K % 2 == 1:
        print(0)
        return

    mod = 1000000007
    dp = [[0] * (2*n*n + 1) for _ in range(n+1)]
    dp[0][n*n] = 1

    for i in range(1, n+1):
        ndp = [[0] * (2*n*n + 1) for _ in range(n+1)]
        for j in range(n+1):
            for k in range(2*n*n + 1):
                if dp[j][k] == 0:
                    continue
                
                if j + 1 <= n and k - i >= 0:
                    ndp[j+1][k-i] += dp[j][k]
                    ndp[j+1][k-i] %= mod

                if j - 1 >= 0 and k + i <= 2*n*n:
                    ndp[j-1][k+i] += dp[j][k] * j * j
                    ndp[j-1][k+i] %= mod

                ndp[j][k] += dp[j][k] * 2 * j
                ndp[j][k] %= mod

                ndp[j][k] += dp[j][k]
                ndp[j][k] %= mod

        dp = ndp

    print(dp[0][K//2 + n*n])

if __name__ == "__main__":
    solve()
```

