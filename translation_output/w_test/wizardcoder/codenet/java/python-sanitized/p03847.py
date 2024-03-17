import math

MOD = int(math.pow(10, 9) + 7)

def count_ways(n):
    if n == 0:
        return 1
    elif n == 1:
        return 1
    else:
        return count_ways(n-1) + count_ways(n-2)

def p03847(N):
    n = [int(i) for i in bin(N)[2:]]
    n = [0] * (61 - len(n)) + n
    dp = [[0] * 3 for _ in range(61)]
    if n[60] == 0:
        dp[60][0] = 1
    else:
        dp[60][0] = 1
        dp[60][1] = 1
    for i in range(59, -1, -1):
        dp[i][2] = (3 * dp[i+1][2]) % MOD
        for j in range(3):
            c = 2 + n[i] - j
            if c >= 2:
                dp[i][2] = (dp[i][2] + dp[i+1][1]) % MOD
            else:
                dp[i][c] = (dp[i][c] + dp[i+1][1]) % MOD
        for j in range(3):
            c = n[i] - j
            if c < 0:
                pass
            else:
                dp[i][c] = (dp[i][c] + dp[i+1][0]) % MOD
    ans = dp[0][0]
    ans = (ans + dp[0][1]) % MOD
    ans = (ans + dp[0][2]) % MOD
    return ans

N = int(input())
print(p03847(N))