import sys
import numpy as np

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

MOD = 10**9 + 7

def fact_table(N, MOD):
    inv = np.empty(N, np.int64)
    inv[0] = 0
    inv[1] = 1
    for n in range(2, N):
        q, r = divmod(MOD, n)
        inv[n] = inv[r] * (-q) % MOD
    fact = np.empty(N, np.int64)
    fact[0] = 1
    for n in range(1, N):
        fact[n] = n * fact[n - 1] % MOD
    fact_inv = np.empty(N, np.int64)
    fact_inv[0] = 1
    for n in range(1, N):
        fact_inv[n] = fact_inv[n - 1] * inv[n] % MOD
    return fact, fact_inv, inv

def main(N, M, MOD):
    fact, fact_inv, inv = fact_table(N + 1, MOD)
    x = fact[N] * fact_inv % MOD * fact_inv[::-1] % MOD
    x[1::2] *= (-1)
    x = x[::-1]
    p = 1  # M-N+1 * M-N+2 * ... *
    ret = 0
    for k in range(N + 1):
        ret += x[k] * p % MOD
        if k != N:
            p = p * (M - N + 1 + k) % MOD
    ret %= MOD
    return ret * p % MOD

if sys.argv[-1] == 'ONLINE_JUDGE':
    import numba
    from numba.pycc import CC
    i8 = numba.int64
    cc = CC('my_module')

    def cc_export(f, signature):
        cc.export(f.__name__, signature)(f)
        return numba.njit(f)

    fact_table = cc_export(fact_table, (i8, i8))
    main = cc_export(main, (i8, i8, i8))
    cc.compile()

from my_module import main

N, M = list(map(int, read().split()))
print((main(N, M, MOD)))