def main():
    N, X = map(int, input().split())
    MOD = 998244353

    dp = [[[0 for _ in range(X + 1)] for _ in range(512)] for _ in range(2)]
    for i in range(X + 1):
        dp[0][i][i] = 1
    
    t = 1
    for i in range(1, N):
        t = 1 - t
        for j in range(512):
            for k in range(X + 1):
                dp[t][j][k] = 0
        for j in range(512):
            total_sum = 0
            for k in range(X + 1):
                total_sum += dp[1 - t][j][k]
                dp[t][j ^ k][k] += total_sum
                dp[t][j ^ k][k] %= MOD

    ans = sum(dp[1 - t][X][:]) % MOD
    print(ans)


if __name__ == '__main__':
    main()