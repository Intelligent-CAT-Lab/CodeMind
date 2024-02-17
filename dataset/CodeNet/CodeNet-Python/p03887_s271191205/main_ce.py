import sys
readline = sys.stdin.readline
readlines = sys.stdin.readlines
sys.setrecursionlimit(10 ** 7)
"""
・2,3^n,2
・3(1)
・1
・333
"""
import numpy as np
MOD = 10**9 + 7
N,A,B,C = map(int,readline().split())
if B&1:
    print(0)
    exit()
def cumprod(arr):
    L = len(arr); Lsq = int(L**.5+1)
    arr = np.resize(arr,Lsq**2).reshape(Lsq,Lsq)
    for n in range(1,Lsq):
        arr[:,n] *= arr[:,n-1]; arr[:,n] %= MOD
    for n in range(1,Lsq):
        arr[n] *= arr[n-1,-1]; arr[n] %= MOD
    return arr.ravel()[:L]
U = 10**5
x = np.arange(U,dtype=np.int64); x[0] = 1
fact = cumprod(x)
x = np.arange(U,0,-1,dtype=np.int64); x[0] = pow(int(fact[-1]),MOD-2,MOD)
fact_inv = cumprod(x)[::-1]
"""
・2,3^n,2：B2個
・3113：A-n個
・11：n個
・333333：m個
"""
B2 = B//2
answer = 0
for m in range(C//3+1):
    if B2 == 0:
        a = C-3*m; b = m; c = A-a
        if a < 0 or c < 0:
            continue
        x = fact[a+b+c] * fact_inv[a] % MOD
        x *= fact_inv[b]; x %= MOD
        x *= fact_inv[c]; x %= MOD
        answer += x
        continue
    n_min = max(0,A-C+3*m)
    # (B2+A+m)! / (B2)!(A-n)!(n)!(m)!
    x = fact[B2+A+m] * fact_inv[m] % MOD * fact_inv[B2] % MOD
    x *= fact_inv[A-n_min::-1]; x %= MOD
    x *= fact_inv[n_min:A+1]; x %= MOD
    # 2,3^n,2のところの3の振り分けを決める。B2個の非負整数の和がC-3m-(A-n)
    # (B2+A+m)! / (B2)!(A-n)!(n)!(m)!
    y = fact[B2-1+C-3*m-A+n_min:B2+C-3*m] * fact_inv[B2-1] % MOD
    y *= fact_inv[C-3*m-A+n_min:C-3*m+1]; y %= MOD
    answer += (x*y%MOD).sum()
answer %= MOD
print(answer)