import sys

MOD = 1000000007

def main():
    N, K = map(int, sys.stdin.readline().split())
    sqrt = int((N ** 0.5) // 1)
    sqrt = 2 * sqrt if sqrt * (sqrt + 1) > N else 2 * sqrt - 1
    dp = [[0] * sqrt for _ in range(K)]
    for i in range(sqrt):
        dp[0][i] = max(1, N // (sqrt - i) - N // (sqrt - i + 1))
    for i in range(1, K):
        sum_ = 0
        for j in range(sqrt - 1, -1, -1):
            sum_ = (sum_ + dp[i - 1][sqrt - j - 1]) % MOD
            dp[i][j] = sum_ * max(1, N // (sqrt - j) - N // (sqrt - j + 1)) % MOD
    ans = 0
    for i in range(sqrt):
        ans = (ans + dp[K - 1][i]) % MOD
    print(ans)

if __name__ == "__main__":
    main()