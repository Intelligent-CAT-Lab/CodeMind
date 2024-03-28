import sys

def gen(n):
    fact = [0] * (n + 1)
    factinv = [0] * (n + 1)
    fact[0] = 1
    factinv[0] = power(fact[0], mod - 2, mod)
    for i in range(1, n + 1):
        fact[i] = i * fact[i - 1]
        fact[i] %= mod
        factinv[i] = power(fact[i], mod - 2, mod)
    return fact, factinv

def solve(n, k):
    if k >= n:
        return nCrs(n + n - 1, n - 1, mod)
    else:
        ans = 0
        fact, factinv = gen(n)
        for i in range(k + 1):
            up = fact[n] * fact[n - 1]
            up %= mod
            den1 = factinv[i] * factinv[i]
            den1 %= mod
            den2 = factinv[n - i] * factinv[n - i - 1]
            den2 %= mod
            den = den1 * den2
            den %= mod
            ans += up * den
            ans %= mod
        return ans

def nCrs(n, r, p):
    #r is small
    up = 1
    down = 1
    for i in range(n - r + 1, n + 1):
        up *= i
        up %= p
    for i in range(1, r + 1):
        down *= i
        down %= p
    return (up * power(down, p - 2, p)) % p

def power(x, y, p):
    res = 1
    x = x % p
    while (y > 0):
        if ((y & 1) == 1):
            res = (res * x) % p
        y = y >> 1
        x = (x * x) % p
    return res

def main():
    n, k = map(int, sys.stdin.readline().split())
    mod = 1000000007
    print(solve(n, k))

if __name__ == "__main__":
    main()