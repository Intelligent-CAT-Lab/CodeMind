MOD = 1000000007

def partition(n, k):
    if n < 0:
        return 0
    if n == 0:
        return 1
    if k > n:
        k = n

    dp = [[0] * (k+1) for _ in range(n+1)]
    dp[0][0] = 1

    for i in range(n + 1):
        dp[i][1] = 1

    for i in range(2, k + 1):
        dp[0][i] = 1
        dp[1][i] = 1

    for i in range(1, n + 1):
        for j in range(2, k + 1):
            if i - j >= 0:
                dp[i][j] = (dp[i][j-1] + dp[i-j][j]) % MOD
            else:
                dp[i][j] = dp[i][j-1]

    return dp[n][k]

def main():
    n, k = map(int, input().split())
    print(partition(n-k, k))

if __name__ == "__main__":
    main()