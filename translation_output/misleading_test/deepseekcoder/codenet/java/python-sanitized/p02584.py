import sys

def solve(x, k, d):
    x = abs(x)
    if x // d >= k:
        return x - k * d
    else:
        sho = x // d
        amari = x % d
        if (k - sho) % 2 == 0:
            return amari
        else:
            return d - amari

x, k, d = map(int, sys.stdin.readline().split())
print(solve(x, k, d))