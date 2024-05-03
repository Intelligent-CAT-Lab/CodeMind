MOD = 998244353

def main():
    N = int(input())
    X = int(input())
    dp = [[[0 for _ in range(X + 1)] for _ in range(512)] for _ in range(2)]
    for i in range(X + 1):
        dp[0][i][i] = 1
    t = 1
    for i in range(1, N):
        t = 1 - t
        for j in range(512):
            dp[t][j] = [0 for _ in range(X + 1)]
        for j in range(512):
            sum_ = 0
            for k in range(X + 1):
                sum_ += dp[1 - t][j][k]
                dp[t][j ^ k][k] = (dp[t][j ^ k][k] + sum_) % MOD
    ans = 0
    for i in range(X + 1):
        ans = (ans + dp[1 - t][X][i]) % MOD
    print(ans)

if __name__ == "__main__":
    main()