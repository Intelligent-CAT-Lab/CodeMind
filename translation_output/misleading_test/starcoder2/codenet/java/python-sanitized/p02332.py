import sys

mod = 1000000007

def inv(n):
    return pow(n, mod-2, mod)

def factorial(n):
    if n == 0:
        return 1
    return n * factorial(n-1) % mod

def factInv(n):
    return inv(factorial(n))

def combination(n, r):
    if n < r or r < 0:
        return 0
    return factorial(n) * factInv(r) % mod * factInv(n-r) % mod

def permutation(n, r):
    if n < r or r < 0:
        return 0
    return factorial(n) *