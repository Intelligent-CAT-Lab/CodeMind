import sys

def solve():
    n, K = map(int, input().split())
    if K % 2 == 1:
        print(0)
        return

    mod = 1000000007
    dp = [[0]*(2*n*n+1) for _ in range(n+1)]
    dp[0][n*n] = 1

    for i in range(1, n+1):
        ndp = [[0]*(2*n*n+1) for _ in range(n+1)]
        for j in range(n+1):
            for k in range(2*n*n+1):
                if dp[j][k] == 0:
                    continue
                # add source
                if j+1 <= n and k-i >=