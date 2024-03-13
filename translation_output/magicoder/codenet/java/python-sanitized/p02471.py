import sys

def gcd(a, b):
    if a < b:
        return gcd(b, a)
    if b == 0:
        return a
    return gcd(a, a % b)

def extended_euclidean(a, b):
    r1, r2 = a, b
    x1, x2 = 1, 0
    y1, y2 = 0, 1
    while r2 != 0:
        q = r1 // r2
        r3 = r1 % r2
        x3 = x1 - q * x2
        y3 = y1 - q * y2
        r1, x1, y1 = r2, x2, y2
        r2, x2, y2 = r3, x3, y3
    return x1, y1

def main():
    a, b = map(int, sys.stdin.readline().split())
    x, y = extended_euclidean(a, b)
    print(x, y)

if __name__ == "__main__":
    main()