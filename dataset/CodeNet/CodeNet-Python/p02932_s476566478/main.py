import sys
input = sys.stdin.readline

import numpy as np

N,M,L,R = map(int,input().split())

MOD = 10 ** 9 + 7

X=1000
fact = np.arange(X*X,dtype=np.int64).reshape(X,X)
fact[0,0] = 1
for n in range(1,X):
    fact[:,n] *= fact[:,n-1]
    fact[:,n] %= MOD
for n in range(1,X):
    fact[n] *= fact[n-1,-1]
    fact[n] %= MOD
fact = fact.ravel()

fact_inv = np.arange(1,X*X+1,dtype=np.int64)[::-1].reshape(X,X)
fact_inv[0,0] = pow(int(fact[-1]),MOD-2,MOD)
for n in range(1,X):
    fact_inv[:,n] *= fact_inv[:,n-1]
    fact_inv[:,n] %= MOD
for n in range(1,X):
    fact_inv[n] *= fact_inv[n-1,-1]
    fact_inv[n] %= MOD
fact_inv = fact_inv.ravel()[::-1]

U = N - M
comb = fact[U] * fact_inv[:U+1] % MOD * fact_inv[U::-1] % MOD
comb[1::2] *= (-1)

P = np.zeros(R+1,dtype=np.int64)
for i,x in enumerate(comb,M):
    P[::i] += x

P[M:] -= P.copy()[:-M]
P %= MOD

# (1-x)^{N+1}で割る
Q = fact[N:N+R+1] * fact_inv[:R+1] % MOD * fact_inv[N] % MOD

def f(R):
    total = fact[R+N] * fact_inv[R] % MOD * fact_inv[N] % MOD
    x = (Q[R::-1] * P[:R+1] % MOD).sum() % MOD
    coef = fact[N] * fact_inv[M] % MOD * fact_inv[N-M] % MOD
    return (total - x*coef)%MOD

answer = (f(R) - f(L-1))%MOD
print(answer)
