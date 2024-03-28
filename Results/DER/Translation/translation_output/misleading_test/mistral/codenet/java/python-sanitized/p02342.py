import sys

def partition(n, k):
    mod = 1000000007
    if k > n:
        k = n
    dp = [[0 for _ in range(k+1)] for _ in range(n+1)]
    dp[0][0] = 1
    dp[0][1] = 1
    for i in range(2, k+1):
        dp[0][i] = 1
        dp[1][i] = 1
    for i in range(1, n+1):
        for j in range(2, k+1):
            if i-j >= 0:
                dp[i][j] = dp[i][j-1] + dp[i-j][j]
                dp[i][j] %= mod
            else:
                dp[i][j] = dp[i][j-1]
    return dp[n][k]

if __name__ == "__main__":
    n, k = map(int, sys.stdin.readline().strip().split())
    print(partition