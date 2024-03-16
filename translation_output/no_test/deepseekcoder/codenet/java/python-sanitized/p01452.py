import sys

MOD = 1000000000 + 7

def main():
    n, m, k = map(int, sys.stdin.readline().split())
    fact = [1] * (n + m + 2 * k + 1)
    for i in range(1, n + m + 2 * k + 1):
        fact[i] = (i % MOD * fact[i - 1]) % MOD
    ans = 0
    for i in range(k + 1):
        a, b = 1, 1
        j = k - i
        if i >= 1:
            a = (nCk(fact, n + 2 * i, i) + MOD - nCk(fact, n + 2 * i, i - 1)) % MOD
        if j >= 1:
            b = (nCk(fact, m + 2 * j, j) + MOD - nCk(fact, m + 2 * j, j - 1)) % MOD
        ans += nCk(fact, n + m + 2 * k, n + 2 * i) % MOD * a % MOD * b % MOD
        ans %= MOD
    while ans < 0:
        ans += MOD
    print(ans)

def nCk(fact, n, k):
    if n < k:
        return 0
    else:
        return fact[n] % MOD * inv(fact[n - k], MOD) % MOD * inv(fact[k], MOD) % MOD

def inv(a, mod):
    a = a % mod
    b = mod
    p = 1
    q = 0
    while b > 1:
        c = b // a
        b, a = a, b % a
        q = q - p * c
        p, q = q, p
    while q < 0:
        q += mod
    return q % MOD

if __name__ == "__main__":
    main()