class main:
    from math import isqrt
    
    def solve(n, m):
        dp = [0.0] * (n + 1)
        dp[0] =