import math
from itertools import combinations
from functools import lru_cache

DEBUG = True
MINF = -1234567890
LINF = 123456789123456789
MOD = int(1e9) + 7
EPS = 1e-10
y4 = [-1, 1, 0, 0]
x4 = [0, 0, -1, 1]
y8 = [0, 1, 0, -1, -1, 1, 1, -1]
x8 = [1, 0, -1, 0, 1, -1, 1, -1]
maxRes = float('-inf')
minRes = float('inf')

fac, finv, inv = [], [], []


def setMod():
    global fac, finv, inv, MOD
    fac = [0] * (int(1e6) + 1000)
    finv = [0] * (int(1e6) + 1000)
    inv = [0] * (int(1e6) + 1000)
    fac[0] = fac[1] = 1
    finv[0] = finv[1] = 1
    inv[1] = 1
    for i in range(2, int(1e6) + 1000):
        fac[i] = mMul(fac[i - 1], i)
        inv[i] = MOD - mMul(inv[MOD % i], MOD // i)
        finv[i] = mMul(finv[i - 1], inv[i])


def mMul(a, b):
    return ((a % MOD * b % MOD) % MOD + MOD) % MOD


def mSum(a, b):
    return ((a % MOD + b % MOD) % MOD + MOD) % MOD


def solve(N, A, B, C, D):
    setMod()
    dp = [[0] * (N + 1) for _ in range(N + 1)]
    for i in range(N + 1):
        dp[i][0] = 1
    
    mPowFinv = [[0] * (N + 1) for _ in range(N + 1)]
    for k in range(N + 1):
        mPowFinv[k][1] = finv[k]
        for i in range(2, D + 1):
            mPowFinv[k][i] = mPowFinv[k][i - 1] * finv[k] % MOD
    
    for k in range(1, N + 1):
        for n in range(1, N + 1):
            dp[k][n] = dp[k - 1][n]
            if not (A <= k <= B):
                continue
            for x in range(C, min(D, (n - k * C) // k) + 1):
                # Calculate the number of ways to distribute n people into groups
                cal = mMul(fac[n], mMul(finv[n - k * x], mMul(mPowFinv[k][x], finv[x])))
                cal = mMul(cal, dp[k - 1][n - k * x])
                dp[k][n] = mSum(dp[k][n], cal)
    
    return dp[N][N]


# Test case
test_input = [3, 1, 3, 1, 2]

# Expected output: -10
print(solve(*test_input))