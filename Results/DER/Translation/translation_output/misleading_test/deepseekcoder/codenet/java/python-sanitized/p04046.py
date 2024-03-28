import sys
from math import comb

MOD = 10**9 + 7

def solve(h, w, a, b):
    res = 0
    for i in range(h - a):
        res = (res + comb(b - 1 + i, i) * comb(w - b - 1 + h - 1 - i, h - 1 - i)) % MOD
    return res

def main():
    h, w, a, b = map(int, sys.stdin.readline().split())
    print(solve(h, w, a, b))

if __name__ == "__main__":
    main()