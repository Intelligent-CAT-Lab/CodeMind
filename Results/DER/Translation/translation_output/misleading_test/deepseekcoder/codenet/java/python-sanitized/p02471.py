import sys

def extended_gcd(a, b):
    if a == 0:
        return b, 0, 1
    else:
        gcd, x, y = extended_gcd(b % a, a)
        return gcd, y - (b // a) * x, x

def main():
    a, b = map(int, sys.stdin.readline().split())
    gcd, x, y = extended_gcd(a, b)
    print(x)

if __name__ == "__main__":
    main()