import sys
input = sys.stdin.readline

mod = 10**9 + 7
memo = [1] * 9
for i in range(2, 9):
    for bit in range(2**(i-2)):
        before = 0
        for j in range(9):
            now = (bit >> j) & 1
            if before == 1 and now == 1:
                break
            before = now
            if j == 8:
                memo[i] += 1

h, w, k = map(int, input().split())
dp = [[0] * w for _ in range(h + 1)]
dp[0][0] = 1
for i in range(h):
    for j in range(w):
        # 右
        if j + 1 < w:
            dp[i + 1][j + 1] += dp[i][j] * memo[j] * memo[w - j - 2] % mod
            dp[i + 1][j + 1] %= mod
        # 左
        if j - 1 >= 0:
            dp[i + 1][j - 1] += dp[i][j] * memo[j - 1] * memo[w - j - 1] % mod
            dp[i + 1][j - 1] %= mod
        #  straight
        dp[i + 1][j] += dp[i][j] * memo[j] * memo[w - j - 1] % mod
        dp[i + 1][j] %= mod

print(dp[h][k - 1])