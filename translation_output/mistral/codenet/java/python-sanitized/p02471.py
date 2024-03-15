import sys

def gcd(a, b):
    if a < b:
        return gcd(b, a)
    elif b == 0:
        return a
    else:
        return gcd(a, a % b)

a = int(input())
b = int(input())

r1, x1, y1, r2, x2, y2 = a, 1, 0, b, 0, 1

while r2 != 0:
    q = r1 / r2
    r3 = r1 % r2
    x3 = x1 - q * x2
    y3 = y1 - q * y2
    r1 = r2
    r2 = r3
    x1 = x2
    x2 = x3
    y1 = y2
    y2 = y3

print(x1, y1)