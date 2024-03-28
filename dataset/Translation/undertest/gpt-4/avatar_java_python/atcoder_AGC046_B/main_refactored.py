class main:
    def atcoder_AGC046_B(A, B, C, D):
        MOD = 998244353
        dp = [[0 for _ in range(C)] for _ in range(D)]
        sum_ = [[0 for _ in range(C)] for _ in range(D)]
    
        sum_[B - 1][A - 1] = 1
    
        for i in range(A, C):
            sum_[B - 1][i] = (sum_[B - 1][i - 1] * B) % MOD
    
        for i in range(B, D):
            for j in range(A, C):
                dp[i][j] = dp[i - 1][j] * j % MOD
                dp[i][j] = (dp[i][j] + sum_[i - 1][j - 1] * j) % MOD
                sum_[i][j] = (sum_[i][j - 1] * (i + 1) + dp[i][j]) % MOD
    
        ans = 0
        powC = 1
    
        for i in range(D - 1, B - 1, -1):
            powI = 1
            for j in range(C - 1, A - 1, -1):
                ans = (ans + dp[i][j] * powC * powI) % MOD
                powI = powI * (i + 1) % MOD
            powC = powC * C % MOD
    
        ans = (ans + powC * sum_[B - 1][C - 1]) % MOD
    
        return ans
    
    # Test input
    test_input = [2, 1, 3, 4]
    
    # Expected output: 65
    print(atcoder_AGC046_B(*test_input))