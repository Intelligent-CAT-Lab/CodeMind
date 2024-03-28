```python
MOD = 998244353

def main():
    N, X = map(int, input().split())
    dp = [[[0 for _ in range(X + 1)] for _ in range(512)] for _ in range(2]

    for i in range(X + 1):
        dp[0][i][i] = 1

    t = 1
    for i in range(1, N):
        for j in range(512):
            dp[t][j] = [0] * (X + 1)

        for j in range(512):
            sum_val = 0
            for k in range(X + 1):
                sum_val += dp[1 - t][j][k]
                dp[t][j ^ k][k] += sum_val
                dp[t][j ^ k][k] %= MOD

        t = 1 - t

    ans = sum(dp[1 - t][X])
    print(ans % MOD)

if __name__ == '__main__':
    main()
```
```python
# Test Input: 2 3
# Expected Output: 101

main()
```
