import sys
import math

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def solve():
    a, b = map(int, input().split())
    a = abs(int(input()) - a)
    b = abs(int(input()) - b)
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

solve()