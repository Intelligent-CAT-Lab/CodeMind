import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def solve():
    a = abs(int(input()) - int(input()))
    b = abs(int(input()) - int(input()))
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

solve()