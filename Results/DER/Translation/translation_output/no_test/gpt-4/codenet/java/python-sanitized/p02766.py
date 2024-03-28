import math
import sys

MOD = int(1e9+7)

def ceil(a, b):
    return (a + b - 1) // b

def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)

def lcm(a, b):
    return a // gcd(a, b) * b

def solve(N, K):
    base = 1
    cnt = 0
    while base <= N:
        cnt += 1
        base *= K
    print(cnt)

def main():
    N, K = map(int, input().split())
    solve(N, K)

if __name__ == "__main__":
    main()