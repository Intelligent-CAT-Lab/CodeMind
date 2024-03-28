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
    a, b, c = map(int, sys.stdin.readline().split())
    if a*b > c:
        print(0)
        sys.exit(0)
    c -= a*b
    d = c + a - 1
    result = 1
    for i in range(c):
        result *= d - i
        result //= i + 1
    print(result)

if __name__ == '__main__':
    main()