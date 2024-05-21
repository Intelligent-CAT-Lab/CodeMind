import sys

def solve():
    n, k = map(int, input().split())
    if k % 2 == 1:
        print(0)
        return
    mod = 1000000007
    dp = [[0] * (2 * n * n + 1) for _ in range(n + 1)]
    dp[0][n * n] = 1
    for i in range(1, n + 1):
        ndp = [[0] * (2 * n * n + 1) for _ in range(n + 1)]
        for j in range(n + 1):
            for l in range(2 * n * n + 1):
                if dp[j][l] == 0:
                    continue
                # add source
                if j + 1 <= n and l - i >= 0:
                    ndp[j + 1][l - i] += dp[j][l]
                    ndp[j + 1][l - i] %= mod
                # add sink or local sink
                if j - 1 >= 0 and l + i <= 2 * n * n:
                    ndp[j - 1][l + i] += dp[j][l] * j * j
                    ndp[j - 1][l + i] %= mod
                # add intermediate point
                ndp[j][l] += dp[j][l] * 2 * j
                ndp[j][l] %= mod
                # add isolated point
                ndp[j][l] += dp[j][l]
                ndp[j][l] %= mod
        dp = ndp
    print(dp[0][k // 2 + n * n])

input = lambda: sys.stdin.readline().rstrip()
solve()