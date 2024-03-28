> Translate the following python code to java and enclose your solution inside :

import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

import numpy as np

N,MOD = map(int,read().split())

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

U = 10 ** 5
fact, fact_inv = make_fact(U)
inv = np.zeros(U,np.int64)
inv[1:] = fact[:-1] * fact_inv[1:] % MOD

def fft_convolve(f, g, MOD = MOD):