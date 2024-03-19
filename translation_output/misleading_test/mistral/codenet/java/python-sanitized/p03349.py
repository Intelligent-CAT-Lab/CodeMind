import sys

def solve(n, k, MOD):
    nChK = [0] * (n + 1)
    for i in range(n + 1):
        nChK[i] = [0] * (i + 1)
    for j in range(k, -1, -1):
        nChK[0][j] = 1
        nChK[1][j] = (k - j)
    nChK[1][k] = 0
    sumValue = [[0] * (k + 1) for _ in range(2)]
    sumValue[0][k] = 1
    sumValue[1][k] = 0
    for j in range(k - 1, -1, -1):
        sumValue[0][j] = (sumValue[0][j + 1] + nChK[1][j]) % MOD
        sumValue[1][j] = (sumValue[1][j + 1] + nChK[0][j]) % MOD
    for i in range(2, n + 1):
        for j in range(k - 1, -1, -1):
            res = 0
            for sizeTo