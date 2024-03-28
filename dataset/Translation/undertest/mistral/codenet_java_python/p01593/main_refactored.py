class main:
    import sys
    
    def inf(): return sys.maxsize
    
    def eps(): return 1e-12
    
    def n_m():
        n, m = map(int, input().split())
        return n, m
    
    def solve():
        n, m = n_m()
        dp = [1] * (n+1)
        for j in range(1, n+1):
            for i in range(1, min(m, j)+1):
                dp[j] += dp[j-i] / j
        print(f"{dp[n]:.12f}")
    
    if __name__ == "__main__":
        solve()