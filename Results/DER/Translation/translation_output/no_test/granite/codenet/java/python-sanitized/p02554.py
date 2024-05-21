import sys

def modpow(a, n, mod):
    res = 1
    while n > 0:
        if n & 1:
            res = res * a % mod
        a = a * a % mod
        n >>= 1
    return res

def solve():
    n = int(input())
    mod = 1000000007
    total = modpow(10, n, mod)
    partial = 2 * modpow(9, n, mod)
    both = modpow(8, n, mod)
    ans = (total - partial + both) % mod
    ans = (ans + mod) % mod
    print(ans)

if __name__ == '__main__':
    input = sys.stdin.readline
    solve()