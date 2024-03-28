class main:
    import sys
    
    MOD = 1000000007
    
    def nChooseK(n, k):
        if k == 0:
            return 1
        if n == k:
            return 1
        if k == 1:
            return n
        return (nChooseK(n - 1, k) + nChooseK(n - 1, k - 1)) % MOD
    
    def solve(n, k):
        nChK = [[0 for i in range(k + 1)] for j in range(n + 1)]
        for i in range(n + 1):
            nChK[i][0] = 1
        for i in range(1, n + 1):
            for j in range(1, k + 1):
                nChK[i][j] = (nChK[i - 1][j] + nChK[i - 1][j - 1]) % MOD
        sumValue = [[0 for i in range(k + 1)] for j in range(n + 1)]
        sumValue[0][k] = 1
        sumValue[1][k] = 0
        for j in range(k - 1, -1, -1):
            sumValue[0][j] = (sumValue[0][j + 1] + nChK[0][j]) % MOD
            sumValue[1][j] = (sumValue[1][j + 1] + nChK[1][j]) % MOD
        for i in range(2, n + 1):
            for j in range(k - 1, -1, -1):
                res = 0
                for sizeTo