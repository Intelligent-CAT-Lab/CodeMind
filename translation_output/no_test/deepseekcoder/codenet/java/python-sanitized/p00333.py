import math

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

W = int(input())
H = int(input())
C = int(input())

WH = math.gcd(W, H)

a = (W//WH)*(H//WH)

print(a*C)