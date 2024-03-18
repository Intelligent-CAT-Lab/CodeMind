import math


def main():
    MOD = 1000000007
    N, K = map(int, input().split())
    sqrt = int(math.sqrt(N))
    sqrt = 2 * sqrt - 1 if sqrt * (sqrt + 1) > N else 2 * sqrt
    dp = [[0] * sqrt for _ in range(K)]

    for i in range(sqrt):
        dp[0][i] = max(1, N // (sqrt - i) - N // (sqrt - i + 1))
    
    for i in range(1, K):
        total_sum = 0
        for j in range(sqrt - 1, -1, -1):
            total_sum = (total_sum + dp[i - 1][sqrt - j - 1]) % MOD
            dp[i][j] = total_sum * max(1, N // (sqrt - j) - N // (sqrt - j + 1)) % MOD
        
    answer = sum(dp[K - 1][i] for i in range(sqrt)) % MOD
    print(answer)


if __name__ == '__main__':
    main()