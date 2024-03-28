import sys
import math
from math import gcd
from functools import reduce

def nCr(n, r):
    r = min(r, n-r)
    numer = reduce(lambda x, y: x * y, range(n, n-r, -1))
    denom = reduce(lambda x, y: x * y, range(1, r+1))
    return numer // denom

def main():
    r, c, a1, a2, b1, b2 = map(int, sys.stdin.readline().split())
    x, y = abs(a1 - b1), abs(a2 - b2)
    x, y = min(x, r - x), min(y, c - y)
    z = 1
    if x == r - x:
        z *= 2
    if y == c - y:
        z *= 2
    C = min(x, y)
    print(nCr(x + y, C) * z % 100000007)

if __name__ == "__main__":
    main()