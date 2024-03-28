import sys
from functools import lru_cache

MOD = 10**9 + 7

def preComputeNChooseK_MOD_Mod(maxn):
    res = [[0 for _ in range(maxn+1)] for _ in range(maxn+1)]
    for i in range(maxn+1):
        res[i][0] = 1
        res[i][i] = 1
    for i in range(2, maxn):
        for j in range(1, i // 2 + 1):
            res[i][j] = (res[i-1][j] + res[i-1][j-1]) % MOD
            res[i][i-j] = res[i][j]
    return res

@lru_cache(None)
def solve(n, k):
    if n == 0:
        return 1 if k == 0 else 0
    if k == 0:
        return 1
    res = 0
    nChK = preComputeNChooseK_MOD_Mod(n+1)[n][k]
    for sizeTo