import sys

M = 998244353

def modinv(a, m):
    a %= m
    for x in range(1, m):
        if a * x % m == 1:
            return x

def nCr(n, r):
    if r > n:
        return 0
    r = min(r, n - r)
    numer = reduce(lambda x, y: x * y % M, range(n, n - r, -1))
    denom = reduce(lambda x, y: x * y % M, range(1, r + 1))
    return numer * modinv(denom, M) % M

def main():
    n, a, b, k = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(n + 1):
        if a * i > k:
            break
        if (k - a * i) % b == 0:
            j = (k - a * i) // b
            if j <= n:
                ans += nCr(n, i) * nCr(n, j) % M
    print(ans % M)

if __name__ == '__main__':
    main()