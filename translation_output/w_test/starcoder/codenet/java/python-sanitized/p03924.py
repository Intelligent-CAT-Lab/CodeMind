import sys

MOD = 1000000007

def solve(N, M):
    dp = [[[0]*(N+1) for _ in range(N+1)] for _ in range(M+1)]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(1, N+1):
            for k in range(1, N+1):
                # add town unused
                dp[i+1][j+1][k] += dp[i][j][k]*(N-j)
                dp[i+1][j+1][k] %= MOD
                # add town used but not in loop
                dp[i+1][j][k] += dp[i][j][k]*(j-k)
                dp[i+1][j][k] %= MOD
                # add town used and in loop
                dp[i+1][j][j] += dp[i][j][k]*k
                dp[i+1][j][j] %= MOD
    return dp[M][N][N]

def main():
    N, M = map(int, sys.stdin.readline().strip().split())
    print(solve(N, M))

if __name__ == '__main__':
    main()