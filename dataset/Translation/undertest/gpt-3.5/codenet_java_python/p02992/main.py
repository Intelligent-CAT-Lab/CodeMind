MOD = 1000000007

def main():
    N, K = map(int, input().split())
    sqrt = int(N ** 0.5)
    sqrt = 2 * sqrt - 1 if sqrt * (sqrt + 1) > N else 2 * sqrt
    dp = [[0 for _ in range(sqrt)] for _ in range(K)]

    for i in range(sqrt):
        dp[0][i] = max(1, N // (sqrt - i) - N // (sqrt - i + 1))

    for i in range(1, K):
        for j in range(sqrt - 1, -1, -1):
            sum_val = sum(dp[i - 1][sqrt - j - 1] for j in range(sqrt))
            dp[i][j] = (sum_val + 1) * max(1, N // (sqrt - j) - N // (sqrt - j + 1)) % MOD

    ans = sum(dp[K - 1])
    print(ans % MOD)

if __name__ == '__main__':
    main()