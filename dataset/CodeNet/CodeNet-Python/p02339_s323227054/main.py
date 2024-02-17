#!/usr/bin/env python

import sys
import math
import itertools as it
from collections import deque

sys.setrecursionlimit(10000000)

MOD = 10 ** 9 + 7
n, k = map(int, raw_input().split())

m_comb = {}
m_pow = {}
m_inv = {}

def comb(N, K):
    if (N, K) in m_comb:
        return m_comb[(N, K)]
    if N == K or K == 0:
        m_comb[(N, K)] = 1
        return 1
    m_comb[(N, K)] = (comb(N - 1, K) + comb(N - 1, K - 1)) % MOD
    return m_comb[(N, K)]

def pow(N):
    if N in m_pow:
        return m_pow[N]
    ret = 1
    for i in range(n):
        ret *= N
        ret %= MOD
    m_pow[N] = ret
    return ret

def inv(N):
    if N in m_inv:
        return m_inv[N]
    pow_num = MOD - 2
    pow_cur = N
    ret = 1
    while pow_num > 0:
        if pow_num % 2 == 1:
            ret *= pow_cur
            ret %= MOD
        pow_cur *= pow_cur
        pow_cur %= MOD
        pow_num /= 2
    m_inv[N] = ret
    return ret

ans = pow(k)
sig = -1

for i in range(k - 1, 0, -1):
    ans += (comb(k, i) * pow(i) % MOD) * sig
    sig *= -1

for i in range(1, k + 1):
    ans *= inv(i)
    ans %= MOD

print ans

