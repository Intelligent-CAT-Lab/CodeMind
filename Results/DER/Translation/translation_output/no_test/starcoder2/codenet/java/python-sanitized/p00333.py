import math

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

W = int(input())
H = int(input())
WH = gcd(W, H)
C = int(input())

a = (W//WH)*(H//WH)

print(a*C)