def read_ints():
    return map(int, input().split())

l, k = read_ints()
dp = [[0 for _ in range(l + 1)] for _ in range(2)]
dp[0][0] = 1
for i in range(1, l + 1):
    dp[0][i] += dp[1][i - 1]
    dp[1][i] += dp[0][i - 1]
    if i >= k:
        dp[1][i] += dp[0][i - k]

ans = sum(dp[1][1:l + 1])
print(ans)