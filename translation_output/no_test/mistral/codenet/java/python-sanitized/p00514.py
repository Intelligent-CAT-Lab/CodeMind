import sys
from math import gcd

def main():
    a, b, c = map(int, input().split())
    if a*b > c:
        print(0)
        sys.exit(0)
    c -= a*b
    d = c + a - 1
    bi = 1
    for i in range(c):
        bi = bi * (d - i)
        bi = bi / (i + 1)
    print(bi)

if __name__ == "__main__":
    main()