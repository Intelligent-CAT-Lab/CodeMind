import sys
import math

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def solve(a, b, x, y):
    a = abs(x - a)
    b = abs(y - b)
    g = gcd(a, b)
    ans = (a // g) + (b // g) - 1
    return ans * g

def main():
    tokens = input().split()
    a, b, x, y = map(int, tokens)
    print(solve(a, b, x, y))

if __name__ == "__main__":
    main()