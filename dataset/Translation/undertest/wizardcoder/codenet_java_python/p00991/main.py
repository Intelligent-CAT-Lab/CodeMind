import math
import sys

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

def binomial_coefficient(n, k):
    return factorial(n) // (factorial(k) * factorial(n-k))

def main():
    r, c, a1, a2, b1, b2 = map(int, input().split())
    x = abs(a1 - b1)
    y = abs(a2 - b2)
    x = min(x, r - x)
    y = min(y, c - y)
    z = 1
    C = min(x, y)
    if x == r - x:
        z *= 2
    if y == c - y:
        z *= 2
    b = 1
    for i in range(C):
        b *= binomial_coefficient(x + y - i, i) // (i + 1)
    b = b * z % 100000007
    print(b)

if __name__ == '__main__':
    main()