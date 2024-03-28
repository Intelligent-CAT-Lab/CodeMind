import sys

mod = int(1e9+7)

def solve(n, m):
    dp = [[[0, 0] for _ in range(n+1)] for _ in range(2)]
    dp[0][0][1] = 1
    for i in range(1, n+1):
        dp[0][i][0] = 1
    for _ in range(m):
        for j in range(n+1):
            for k in range(2):
                if j == 0:
                    if k == 0:
                        dp[1][0][0] = 0
                    else:
                        dp[1][0][1] = (dp[0][0][1] + (dp[0][1][0] + dp[0][1][1]) % mod) % mod
                elif j == 1:
                    if k == 0:
                        if n < 2:
                            dp[1][1][k] = 0
                        else:
                            dp[1][1][k] = (dp[0][1][0] + dp[0][2][0]) % mod
                    else:
                        if n < 2:
                            dp[1][1][k] = (dp[0][1][0] + (dp[0][1][1] + dp[0][0][1]) % mod) % mod
                        else:
                            dp[1][1][k] = (((dp[0][1][0] + dp[0][0][1]) % mod + dp[0][1][1] * 2 % mod) % mod + dp[0][2][1]) % mod
                else:
                    dp[1][j][k] = (dp[1][j][k] + dp[1][j-1][k]) % mod
                    if j+1 <= n:
                        dp[1][j][k] = (dp[1][j][k] + (dp[1][j][k] + dp[1][j+1][k]) % mod) % mod
    ans = 0
    for i in range(n+1):
        ans = (ans + dp[m % 2][i][1]) % mod
    return ans

n, m = map(int, sys.stdin.readline().split())
print(solve(n, m))