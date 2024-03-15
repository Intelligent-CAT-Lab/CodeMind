MOD = 1000000007

def main():
    N, M = map(int, input().split())
    # dp[days][added town][looped size]
    dp = [[[0 for _ in range(N + 1)] for _ in range(N + 1)] for _ in range(M + 1)]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(N + 1):
            for k in range(N + 1):
                # add town unused
                if j != N:
                    dp[i + 1][j + 1][k] += (dp[i][j][k] * (N - j)) % MOD
                    dp[i + 1][j + 1][k] %= MOD
                # add town used but not in loop
                dp[i + 1][j][k] += (dp[i][j][k] * (j - k)) % MOD
                dp[i + 1][j][k] %= MOD
                # add town used and in loop
                dp[i + 1][j][j] += (dp[i][j][k] * k) % MOD
                dp[i + 1][j][j] %= MOD
    print(dp[M][N][N])

if __name__ == '__main__':
    main()