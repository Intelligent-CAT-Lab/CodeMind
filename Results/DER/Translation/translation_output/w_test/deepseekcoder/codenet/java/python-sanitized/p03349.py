import sys

MOD = 100

def preComputeNChooseK_MOD_Mod(maxn, MOD):
    res = [[0 for _ in range(maxn+1)] for _ in range(maxn+1)]
    for i in range(maxn+1):
        res[i][0] = 1
        res[i][i] = 1
    for i in range(2, maxn):
        for j in range(1, i // 2 + 1):
            ress = (res[i - 1][j] + res[i - 1][j - 1]) % MOD
            res[i][j] = ress
            res[i][i - j] = ress
    return res

def solve(n, k, MOD):
    nChK = preComputeNChooseK_MOD_Mod(n, MOD)
    numberOfSequencesOfSizeIwithElementBigger