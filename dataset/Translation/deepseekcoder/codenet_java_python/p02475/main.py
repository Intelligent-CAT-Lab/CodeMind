import sys
from math import gcd

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(a // b)

if __name__ == "__main__":
    main()