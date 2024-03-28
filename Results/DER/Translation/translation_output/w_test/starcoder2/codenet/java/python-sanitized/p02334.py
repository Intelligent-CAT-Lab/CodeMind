import sys

mod = 1000000007

def combination(n, r):
    if n < r or r < 0:
        return 0
    return fact[n] * finv[r] % mod * finv[n-r] % mod

def permutation(n, r):
    if n < r or r < 0:
        return 0
    return fact[n] * finv[n-r] % mod

def homogeneous(n, r):
    if n == 0 and r == 0:
        return 1
    return combination(n+r-1, r)

def main():
    n, k = map(int, input().split())