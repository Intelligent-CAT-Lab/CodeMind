import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def solve():
    a = int(input())
    b = int(input())
    a = abs(a - int(input()))
    b = abs(b - int(input()))
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

solve()