import sys

sys.setrecursionlimit(1000000000)

mod = 998244353

def extgcd(a, b, is):
    if a == 0:
        is[0] = 0
        is[1] = 1
        is[2] = b
    else:
        extgcd(b % a, a, is)
        x = is[1] - b // a * is[0]
        is[1] = is[0]
        is[0] = x

def add(a, b):
    return ((a + b)