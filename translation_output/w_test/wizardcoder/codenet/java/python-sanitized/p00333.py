import math

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

W, H, C = map(int, input().split())

WH = gcd(W, H)

a = (W/WH)*(H/WH)

print(a*C)