MOD = int(1e9) + 7

def solve(n, k):
    dp = [[0 for _ in range(k+1)] for _ in range(n+1)]
    dp[0][0] = 1
    for i in range(n):
        for j in range(k):
            dp[i+1][j+1] = (dp[i][j] + (j+1) * dp[i][j+1]) % MOD
    return dp[n][k]

if __name__ == "__main__":
    # Test input as in the Java code example
    n, k = map(int, input().split())
    # Expected output
    print(solve(n, k))