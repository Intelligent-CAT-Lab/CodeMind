class main:
    import math
    
    MOD = 1000000007
    
    def main():
        N, K = map(int, input().split())
        sqrt = int(math.floor(math.sqrt(N)))
        sqrt = sqrt * (sqrt + 1) > N and 2 * sqrt - 1 or 2 * sqrt
        dp = [[0 for _ in range(sqrt)] for _ in range(K)]
        
        for i in range(sqrt):
            dp[0][i] = max(1, N // (sqrt - i) - N // (sqrt - i + 1))
        
        for i in range(1, K):
            summation = 0
            for j in range(sqrt - 1, -1, -1):
                summation = (summation + dp[i - 1][sqrt - j - 1]) % MOD
                dp[i][j] = summation * max(1, N // (sqrt - j) - N // (sqrt - j + 1)) % MOD
        
        ans = sum(dp[K - 1][i] for i in range(sqrt)) % MOD
        print(ans)
    
    if __name__ == "__main__":
        main()