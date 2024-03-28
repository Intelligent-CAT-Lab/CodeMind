import sys

def partition(n, k):
    if n < 0:
        return 0
    if n == 0:
        return 1
    if k > n:
        k = n
    mod = 1000000007
    dp = [[0 for _ in range(k+1)] for _ in range(n+1)]
    dp[0][0] = 1
    for i in range(1, n+1):
        dp[i][1] = 1
    for i in range(2, k+1):
        dp[0][i] = 1
        dp[1][i] = 1
    for i in range(1, n+1):
        for j in range(2, k+1):
            if i-j >= 0:
                d