import sys

def extended_gcd(a, b):
    x1, x2, y1, y2 = 1, 0, 0, 1
    while b != 0:
        q = a // b
        r1 = a % b
        x3 = x1 - q * x2
        y3 = y1 - q * y2
        a, b = b, r1
        x1, x2 = x2, x3
        y1, y2 = y2, y3
    return x1, y1

if __name__ == "__main__":
    a, b = map(int, input().split())
    x, y = extended_gcd(a, b)
    print(x, y)