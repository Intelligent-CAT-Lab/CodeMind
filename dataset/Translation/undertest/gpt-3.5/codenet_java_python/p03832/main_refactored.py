class main:
    import sys
    
    MINF = -1234567890
    LINF = 123456789123456789
    MLINF = -123456789123456789
    MOD = int(1e9) + 7
    EPS = 1e-10
    
    
    def solve():
        # Input
        N, A, B, C, D = map(int, input().split())
        
        # Initialize dp array
        dp = [[0] * (N + 1) for _ in range(N + 1)]
        for i in range(N + 1):
            dp[i][0] = 1
        
        # Precalculate factorials
        fac = [1] * (N + 1)
        for i in range(1, N + 1):
            fac[i] = fac[i - 1] * i % MOD
        
        # Precalculate modular inverses
        finv = [0] * (N + 1)
        inv = [0] * (N + 1)
        inv[1] = 1
        finv[0] = finv[1] = 1
        for i in range(2, N + 1):
            inv[i] = MOD - inv[MOD % i] * (MOD // i) % MOD
            finv[i] = finv[i - 1] * inv[i] % MOD
        
        # Calculate dp values
        for k in range(1, N + 1):
            for n in range(1, N + 1):
                dp[k][n] = dp[k - 1][n]
                if not (A <= k and k <= B):
                    continue
                for x in range(C, D + 1):
                    if n - k * x >= 0:
                        cal = fac[n] * finv[n - k * x] * pow(finv[k], x, MOD) % MOD
                        cal = cal * dp[k - 1][n - k * x] % MOD
                        dp[k][n] = (dp[k][n] + cal) % MOD
        
        print(dp[N][N])
    
    if __name__ == "__main__":
        solve()