import sys
from math import factorial

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    if a * b > c:
        print(0)
        return
    c -= a * b
    d = c + a - 1
    result = 1
    for i in range(c):
        result = result * (d - i) // (i + 1)
    print(result)

if __name__ == "__main__":
    main()