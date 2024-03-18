import sys

def solve():
    # Read input
    N, A, B, C, D = map(int, input().split())

    # Initialize variables
    dp = [[0] * (N+1) for _ in range(N+1)]
    dp[0][0] = 1
    fac = [1] * (N+1)
    finv = [1] * (N+1)

    for i in range(2, N+1):
        fac[i] = fac[i-1] * i
        finv[i] = pow(fac[i], MOD-2, MOD)

    # Calculate DP table
    for k in range(1, N+1):
        for n in range(1, N+1):
            dp[k][n] = dp[k-1][n]
            if A <= k and k <= B:
                for x in range(C, D+1):
                    if n - k * x >= 0:
                        cal = fac[n] * finv[n - k * x] % MOD
                        cal = cal * pow(finv[k], x, MOD) % MOD
                        cal = cal * dp[k-1][n - k * x] % MOD
                        dp[k][n] = (dp[k][n] + cal) % MOD

    print(dp[N][N])

# Constants
MOD = 10**9 + 7

if __name__ == "__main__":
    solve()