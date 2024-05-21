import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def solve():
    a, b, x, y = map(int, input().split())
    a = abs(x - a)
    b = abs(y - b)
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

solve()