import sys

def mod_inverse(a, m):
    a = a % m
    for x in range(1, m):
        if ((a * x) % m == 1):
            return x
    return 1

def nCr(n, r, p):
    num = den = 1
    for i in range(r):
        num = (num * (n - i)) % p
        den = (den * (i + 1)) % p
    return (num * mod_inverse(den, p)) % p

def main():
    n, a, b, k = map(int, input().split())
    p = 998244353
    ans = 0
    for i in range(n + 1):
        if (k - a * i) % b == 0 and (k - a * i) // b <= n:
            ans = (ans + nCr(n, i, p) * nCr(n, (k - a * i) // b, p)) % p
    print(ans)

if __name__ == "__main__":
    main()