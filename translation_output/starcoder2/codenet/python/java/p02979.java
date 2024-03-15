
```java

```
/2019/09/20190920.md
# 20190920

## 問題

### 問題1

```
N, K = map(int, input().split())
A = list(map(int, input().split()))

# 1000000007
M = 10**9+7

# dp[i][j]
# i 番目まで見たときに j 個の区間を作ることができる場合の数
dp = [[0] * (K+1) for _ in range(N+1)]
dp[0][0] = 1

for i in range(N) :
    for j in range(K+1) :
        # 区間を作らない
        dp[i+1][j] = (dp[i+1][j] + dp[i][j]) % M
        # 区間を作る
        if j != K :
            dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j] * A[i]) % M

print(dp[N][K])
```

### 問題2

```
N, K = map(int, input().split())
A = list(map(int, input().split()))

# 1000000007
M = 10**9+7

# dp[i][j]
# i 番目まで見たときに j 個の区間を作ることができる場合の数
dp = [[0] * (K+1) for _ in range(N+1)]
dp[0][0] = 1

for i in range(N) :
    for j in range(K+1) :
        # 区間を作らない
        dp[i+1][j] = (dp[i+1][j] + dp[i][j]) % M
        # 区間を作る
        if j != K :
            dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j] * A[i]) % M

print(dp[N][K])
```

### 問題3

```
N, K = map(int, input().split())
A = list(map(int, input().split()))

# 1000000007
M = 10**9+7

# dp[i][j]
# i 番目まで見たときに j 個の区間を作ることができる場合の数
dp = [[0] * (K+1) for _ in range(N+1)]
dp[0][0] = 1

for i in range(N) :
    for j in range(K+1) :
        # 区間を作らない
