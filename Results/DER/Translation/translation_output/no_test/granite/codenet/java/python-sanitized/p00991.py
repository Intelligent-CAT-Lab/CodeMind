import sys
from fractions import Fraction
from math import factorial
from random import randint

def nCr(n, r):
    return factorial(n) // (factorial(r) * factorial(n - r))

def main():
    r, c, a1, a2, b1, b2 = map(int, input().split())
    x = abs(a1 - b1)
    y = abs(a2 - b2)
    x = min(x, r - x)
    y = min(y, c - y)
    z = 1
    if x == r - x:
        z *= 2
    if y == c - y:
        z *= 2
    ans = nCr(x + y, x) * z
    ans %= 100000007
    print(ans)

if __name__ == "__main__":
    main()