import sys

def modPow(a, p, m):
    if a == 1: return 1
    ans = 1
    while p > 0:
        if p % 2 == 1: ans = (ans * a) % m
        a = (a * a) % m
        p >>= 1
    return ans

def modInv(a, m):
    return modPow(a, m - 2, m)

def NcR(n, r, fact, ifact, mod):
    return mul(