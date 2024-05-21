import sys

def combination(n, r):
    if n < r or r < 0:
        return 0
    fact = [1] * (n + 1)
    finv = [1] * (n + 1)
    inv = [1] * (n + 1)
    mod = 1000000007

    for i in range(1, n + 1):
        fact[i] = fact[i - 1] * i % mod
        inv[i] = mod - inv[mod % i] * (mod // i) % mod
        finv[i] = finv[i - 1] * inv[i] % mod

    return fact[n] * finv[r] % mod * finv[n - r] % mod

def main():
    n, k = map(int, input().split())
    print(combination(k, n))

if __name__ == "__main__":
    sys.setrecursionlimit(10**6)
    main()