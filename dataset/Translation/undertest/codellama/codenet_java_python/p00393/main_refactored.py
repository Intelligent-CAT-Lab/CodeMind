class main:
    import math
    
    def pow2(k):
        # v = 2^n mod 1e9+7
        v = 1
        for i in range(k):
            v *= 2
            v %= 1000000007
        return v
    
    def main():
        n, m = map(int, input().split())
    
        dp = [[0, 0] for _ in range(n + 1)]
        dp[0][0] = 1
    
        for i in range(1, n + 1):
            dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
            dp[i][0] %= 1000000007
            dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
            dp[i][1] %= 1000000007
            if i - m >= 0:
                dp[i][1] = (dp[i][1] - dp[i - m][0] + 1000000007) % 1000000007
    
        print((pow2(n) - (dp[n][0] + dp[n][1]) + 1000000007 * 1000000007) % 1000000007)
    
    if __name__ == "__main__":
        main()