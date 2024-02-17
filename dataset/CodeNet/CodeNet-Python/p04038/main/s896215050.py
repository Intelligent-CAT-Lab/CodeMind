import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

"""
・0を除く左端：N,N-1,...の順に並ぶとする。
・0は左から順に、z_N,z_{N-1},...と並ぶ（もとの正体）
・小さい数から順に処理する。n以下の数とz_n,...,z_1を並べたとき、先頭の0の個数ごとに値を持つ
"""

import numpy as np

N,K = list(map(int,read().split()))

if K == 1:
    print((1))
    exit()

MOD = 10 ** 9 + 7

def cumprod(A, MOD = MOD):
    L = len(A); Lsq = int(L**.5+1)
    A = np.resize(A, Lsq**2).reshape(Lsq,Lsq)
    for n in range(1,Lsq):
        A[:,n] *= A[:,n-1]; A[:,n] %= MOD
    for n in range(1,Lsq):
        A[n] *= A[n-1,-1]; A[n] %= MOD
    return A.ravel()[:L]

def make_fact(U, MOD = MOD):
    x = np.arange(U, dtype = np.int64); x[0] = 1
    fact = cumprod(x, MOD)
    x = np.arange(U, 0, -1, dtype=np.int64); x[0] = pow(int(fact[-1]), MOD-2, MOD)
    fact_inv = cumprod(x, MOD)[::-1]
    return fact,fact_inv

U = (N + 10) * (K + 10)
fact, fact_inv = make_fact(U)

# 最初はz_1,1,1,...と並べるしかない。左端にzが1つ。
dp = np.array([0,1],np.int64)
for n in range(2,N+1):
    prev = dp
    dp = np.zeros(n+1,np.int64)
    """
    dp[i] には、prev[i-1,i,i+1,...]から遷移してくる。和をとって定数倍。
    累積和をいじったあと定数倍すればよい
    """
    S = prev.sum() % MOD
    np.cumsum(prev,out=prev); prev %= MOD
    dp[1] = S
    dp[2:] = S - prev[:-1]
    """
    n の挿入方法を乗ずる。
    [z^i][n][右側：小さい側が(n-1)K-i+1個、nがK-2個]
    """
    coef = fact[n*(K-1)-1:n*K][::-1].copy()
    coef *= fact_inv[K-2]; coef %= MOD
    coef *= fact_inv[(n-1)*(K-1):(n-1)*K+2][::-1]; coef %= MOD
    dp *= coef; dp %= MOD

answer = dp.sum() % MOD
answer *= fact[N]; answer %= MOD
print(answer)