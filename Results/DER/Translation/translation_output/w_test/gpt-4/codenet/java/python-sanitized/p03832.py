MOD = int(1e9) + 7

def solve(N, A, B, C, D):
    dp = [[0] * (N+1) for _ in range(N+1)]
    mPowFinv = [[0] * (N+1) for _ in range(N+1)]
    
    # Assuming the functions setMod(), mMuls(), mMul(), and mSum() 
    # are already implemented in Python with equivalent functionality.
    setMod()
    
    for i in range(N+1):
        dp[i][0] = 1
    
    for k in range(N+1):
        mPowFinv[k][1] = finv[k]
    
    for k in range(N+1):
        for i in range(2, D+1):
            mPowFinv[k][i] = mPowFinv[k][i - 1] * finv[k] % MOD
    
    for k in range(1, N+1):
        for n in range(1, N+1):
            dp[k][n] = dp[k-1][n]
            if not (A <= k and k <= B):
                continue
            for x in range(C, D+1):
                if n - k * x >= 0:
                    cal = mMuls(fac[n], finv[n - k * x], mPowFinv[k][x], finv[x])
                    cal = mMul(cal, dp[k-1][n - k * x])
                    dp[k][n] = mSum(dp[k][n], cal)
    
    return dp[N][N]

# Sample Test Case
N, A, B, C, D = map(int, input().split())
print(solve(N, A, B, C, D))