S = "02"
N = len(S)
mod = 998244353
blue = [0] * N
red = [0] * N
for i in range(N):
    blue[i] = blue[i-1] + int(S[i])
    red[i] = red[i-1] + 2 - int(S[i])
dp = [[0 for _ in range(blue[-1] + 1)] for _ in range(2*N+1)]
dp[0][0] = 1
for i in range(N):
    for j in range(blue[-1]+1):
        if j + 1 <= blue[i]:
            dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j]) % mod
        if i+1-j <= red[i]:
            dp[i+1][j] = (dp[i+1][j] + dp[i][j]) % mod
for i in range(N, 2*N):
    for j in range(blue[-1]+1):
        if j+1 <= blue[-1]:
            dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j]) % mod
        dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % mod
print(dp[-1][-1])
