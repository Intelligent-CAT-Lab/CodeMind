import sys

mod = 1000000007

dp = [[0, 0] for i in range(100010)]
dp[0][0] = 1

for i in range(1, int(sys.stdin.readline())):
    dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % mod
    dp[i][1] = (dp[i - 1][0] + dp[i - 1][1]) % mod
    if i - int(sys.stdin.readline()) >= 0:
        dp[i][1] = (dp[i][1] - dp[i - int(sys.stdin.readline())][0] + mod) % mod

print((pow(2, i) - (dp[i][0] + dp[i][1]) + mod * mod) % mod)