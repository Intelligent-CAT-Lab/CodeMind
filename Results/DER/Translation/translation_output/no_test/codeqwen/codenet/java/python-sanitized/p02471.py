import sys

def extended_euclidean(a, b):
    if a < b:
        return extended_euclidean(b, a)
    if b == 0:
        return a, 1, 0
    else:
        gcd, x, y = extended_euclidean(b, a % b)
        return gcd, y, x - (a // b) * y

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
gcd, x, y = extended_euclidean(a, b)
print(x, y)