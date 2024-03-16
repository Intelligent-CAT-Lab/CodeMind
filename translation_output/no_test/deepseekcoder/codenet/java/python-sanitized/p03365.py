import sys
from functools import reduce
from operator import mul

MOD = 1000000007

def read_int():
    return int(sys.stdin.readline())

def read_ints():
    return map(int, sys.stdin.readline().split())

def fact(n):
    return reduce(mul, range(1, n+1)) % MOD

def inv(n):
    return pow(n, MOD-2, MOD)

def c(n, k):
    return fact(n) * inv(k) % MOD * inv(n-k) % MOD

def solve():
    n = read_int()
    md = [0] * n
    for i in range(n-2, -1, -2):
        md[i+1] = c(i, n-2)
    res = 0
    prev = 0
    for m in range(1, n):
        cur = fact(m) * fact(n-m-1) % MOD
        cur = cur * md[m] % MOD
        res = (res + (cur - prev) * m % MOD) % MOD
        prev = cur
    print(res)

if __name__ == "__main__":
    solve()