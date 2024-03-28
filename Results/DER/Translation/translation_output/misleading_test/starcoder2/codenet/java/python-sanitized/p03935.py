import sys

def solve():
    n, m = map(int, input().split())
    n -= 1
    mod = 998244353
    f = [0] * (2*n+3)
    f[0] = f[1