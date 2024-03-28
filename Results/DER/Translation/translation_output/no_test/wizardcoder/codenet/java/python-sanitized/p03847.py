import math

MOD = int(math.pow(10, 9) + 7)

def count(n):
    count = 0
    while n > 0:
        count += n % 2
        n //= 2
    return count

def dp(n):
    dp = [[0 for _ in range(3)] for _ in range(61)]
    if n == 0:
        dp[60][0] = 1
    else:
        dp[60][0] = 1
        dp[60][1] = 1
    for i in range(59, -1, -1):
        dp[i][2] = (3 * dp[i + 1][2]) % MOD
        for j in range(3):
            c = 2 + count(n) - j
            if c >= 2:
                dp[i][2] = (dp[i][2] + dp[i + 1][1]) % MOD
            else:
                dp[i][c] = (dp[i][c] + dp[i + 1][1]) % MOD
        for j in range(3):
            c = count(n) - j
            if c < 0:
                pass
            else:
                dp[i][c] = (dp[i][c] + dp[i + 1][0]) % MOD
    return dp[0][0]

n = int(input())
print(dp(n))