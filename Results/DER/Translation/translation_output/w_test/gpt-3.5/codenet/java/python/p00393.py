```python
mod = 1000000007
dp = [[0, 0] for _ in range(100010)]

def pow2(k):
    v = 1
    for i in range(k):
        v *= 2
        v %= mod
    return v

n, m = map(int, input().split())

dp[0][0] = 1
for i in range(1, n+1):
    dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
    dp[i][0] %= mod
    dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
    dp[i][1] %= mod
    if i - m >= 0:
        dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod

result = (pow2(n) - (dp[n][0] + dp[n][1]) + mod * mod) % mod
print(result)
```

