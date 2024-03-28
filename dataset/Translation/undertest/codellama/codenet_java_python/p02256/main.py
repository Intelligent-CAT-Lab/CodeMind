import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    while a % b != 0:
        a, b = b, a % b
    return b

if __name__ == '__main__':
    a, b = map(int, sys.stdin.readline().split())
    print(gcd(a, b))