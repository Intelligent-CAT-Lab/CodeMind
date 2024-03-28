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

def NcR(n, r):
    return mul(fact[n], mul(ifact[r], ifact[n - r]))

def sub(a, b, mod):
    return ((a % mod) - (b % mod) + mod) % mod

def mul(a, b, mod):
    return (a % mod) * (b % mod) % mod

def add(a, b, mod):
    return (a % mod + b % mod) % mod

def main():
    n, m, k = map(int, input().split())
    mod = 998244353

    global fact
    global ifact
    fact = [0] * (n + 1)
    ifact = [0] * (n + 1)
    fact[0] = fact[1] = ifact[0] = ifact[1] = 1

    for i in range(1, n + 1):
        fact[i] = mul(fact[i - 1], i, mod)
        ifact[i] = mod_inv(fact[i], mod)

    ans = 0
    for i in range(k + 1):
        ans = add(ans, mul(m, mul(mod_pow(m - 1, n - (i + 1), mod), NcR(n - 1, i), mod), mod), mod)
        
    print(ans)

if __name__ == "__main__":
    main()