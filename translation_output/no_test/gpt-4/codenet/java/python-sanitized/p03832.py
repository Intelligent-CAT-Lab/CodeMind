import math
from collections import defaultdict
from bisect import bisect_left, bisect_right

DEBUG = True
sb = []
MINF = -1234567890
LINF = 123456789123456789
MLINF = -123456789123456789
MOD = int(1e9) + 7
EPS = 1e-10
y4 = [-1, 1, 0, 0]
x4 = [0, 0, -1, 1]
y8 = [0, 1, 0, -1, -1, 1, 1, -1]
x8 = [1, 0, -1, 0, 1, -1, 1, -1]

Fa = None
is_prime = []
primes = []
max_res = float('-inf')
min_res = float('inf')
fac = []
finv = []
inv = []

N, A, B, C, D = None, None, None, None, None
dp = []

# Many utility functions are omitted because they are not easily translatable
# or have built-in Python equivalents.

# `solve` function from Java, translated to Python
def solve():
    global N, A, B, C, D
    N, A, B, C, D = 0, 0, 0, 0, 0
    set_mod()
    dp = [[0] * (N + 1) for _ in range(N + 1)]
    for i in range(N + 1):
        dp[i][0] = 1
    
    m_pow_finv = [[0] * (N + 1) for _ in range(N + 1)]
    for k in range(N + 1):
        m_pow_finv[k][1] = finv[k]
        for i in range(2, D + 1):
            m_pow_finv[k][i] = m_pow_finv[k][i - 1] * finv[k] % MOD
    
    for k in range(1, N + 1):
        for n in range(1, N + 1):
            dp[k][n] = dp[k - 1][n]
            if not (A <= k <= B):
                continue
            for x in range(C, min(D, n - k * x) + 1):
                cal = m_muls(fac[n], finv[n - k * x], m_pow_finv[k][x], finv[x])
                cal = m_mul(cal, dp[k - 1][n - k * x])
                dp[k][n] = m_sum(dp[k][n], cal)
    
    print(dp[N][N])

# Example usage of `solve` function
if __name__ == '__main__':
    solve()