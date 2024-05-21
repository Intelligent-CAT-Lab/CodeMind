import sys

def mod_pow(a, p, m):
    if a == 1:
        return 1
    ans = 1
    while p > 0:
        if p % 2 == 1:
            ans = (ans * a) % m
        a = (a * a) % m
        p >>= 1
    return ans

def mod_inv(a, m):
    return mod_pow(a, m - 2, m)

def ncr(n, r, m):
    if r > n:
        return 0
    return (fact[n] * ifact[r] * ifact[n - r]) % m

def main():
    n, m, k = map(int, sys.stdin.readline().split())
    mod = 998244353
    fact = [1] * (n + 1)
    ifact = [1] * (n + 1)
    for i in range(1, n + 1):
        fact[i] = (fact[i - 1] * i) % mod
        ifact[i] = mod_inv(fact[i], mod)
    ans = 0
    for i in range(k + 1):
        ans = (ans + m * mod_pow(m - 1, n - i - 1, mod) * ncr(n - 1, i, mod)) % mod
    print(ans)

if __name__ == "__main__":
    main()