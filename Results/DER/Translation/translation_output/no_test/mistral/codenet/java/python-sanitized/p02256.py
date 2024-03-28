import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)

a, b = map(int, sys.stdin.readline().split())
print(gcd(a, b))