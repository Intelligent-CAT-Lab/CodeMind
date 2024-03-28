class main:
    import math
    
    def solve(n, m):
        dp = [1] + [0] * n
        for j in range(1, n+1):
            for i in range(1, min(m, j)+1):
                dp[j] += dp[j-i] / j
        return dp[n]
    
    n = int(input())
    m = int(input())
    print(solve(n, m))