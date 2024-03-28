import sys

def solve():
    n = int(sys.stdin.readline())
    mod = 1000000007
    total = modpow(10, n, mod)
    partial = 2 * modpow(9, n, mod)
    both = modpow(8, n, mod)
    ans = (total - partial + both) % mod
    ans = (ans + mod) % mod
    print(ans)

def modpow(a, n, mod):
    res = 1
    while n > 0:
        if n & 1:
            res = res * a % mod
        a = a * a % mod
        n >>= 1
    return res

def main():
    import time
    S = time.time()
    solve()
    G = time.time()
    print(f"{G-S}ms")

if __name__ == "__main__":
    main()