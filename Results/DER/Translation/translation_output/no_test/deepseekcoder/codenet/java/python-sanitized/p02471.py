import sys

def extended_gcd(a, b):
    if a < b:
        return extended_gcd(b, a)
    if b == 0:
        return a, 1, 0
    gcd, x, y = extended_gcd(b, a % b)
    return gcd, y, x - (a // b) * y

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    gcd, x, y = extended_gcd(a, b)
    print(x, y)

if __name__ == "__main__":
    main()