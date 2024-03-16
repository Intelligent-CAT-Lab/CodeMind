import sys
import math

MOD = 1000000007

def pow(a, x):
    res = 1
    while x > 0:
        if x % 2!= 0:
            res = (res * a) % MOD
        a = (a * a) % MOD
        x //= 2
    return res

def inv(a):
    return pow(a, MOD - 2) % MOD

def comb(n, r):
    if n < 0 or r < 0