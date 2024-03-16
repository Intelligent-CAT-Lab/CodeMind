import sys

def solve():
    n, K = ni(), ni()
    if K % 2 == 1:
        print(0)
        return
    mod = 1000000007
    dp = [[0 for _ in range(2*n*n+1)] for _ in range(n+1)]
    dp[0][n*n] = 1
    for i in