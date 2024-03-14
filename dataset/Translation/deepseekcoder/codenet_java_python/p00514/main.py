import sys
from math import comb

def main():
    a, b, c = map(int, input().split())
    if a * b > c:
        print(0)
        sys.exit(0)
    c -= a * b
    d = c + a - 1
    result = 1
    for i in range(c):
        result *= (d - i)
        result //= (i + 1)
    print(result)

if __name__ == "__main__":
    main()