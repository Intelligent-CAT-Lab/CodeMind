import sys

def extended_gcd(a, b):
    r1, x1, y1 = a, 1, 0
    r2, x2, y2 = b, 0, 1

    while r2 != 0:
        q = r1 // r2
        r3 = r1 % r2
        x3 = x1 - q * x2
        y3 = y1 - q * y2
        r1, r2 = r2, r3
        x1, x2 = x2, x3
        y1, y2 = y2, y3

    return x1, y1

if __name__ == "__main__":
    a, b = map(int, input().split())
    x, y = extended_gcd(a, b)
    print(x)