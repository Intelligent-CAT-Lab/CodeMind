import sys

MOD = 10**9 + 7

def nCk(n, k):
    if n < k:
        return 0
    else:
        return fact[n] * inv(fact[n - k], MOD) * inv(fact[k], MOD) % MOD

def inv(a, mod):
    a = a % mod
    b = mod
    p = 1
    q = 0

    while b > 1:
        c = b // a
        b = b % a
        q = q - p * c
        d = b
        b = a
        a = d
        d = p
        p = q
        q = d

    while q < 0:
        q += mod
    return q % MOD

def solver():
    n, m, k = map(int, sys.stdin.readline().split())

    fact = [1] * (n + m + 2 * k + 1)
    for i in range(1, n + m + 2 * k + 1):
        fact[i] = (i % MOD * fact[i - 1]) % MOD

    ans = 0
    for i in range(k + 1):
        a = 1
        b = 1
        j = k - i
        if i >= 1:
            a = (nCk(n + 2 * i, i) + MOD - nCk(n + 2 * i, i - 1)) % MOD
        if j >= 1:
            b = (nCk(m + 2 * j, j) + MOD - nCk(m + 2 * j, j - 1)) % MOD
        ans += nCk(n + m + 2 * k, n + 2 * i) % MOD * a % MOD * b % MOD
        ans %= MOD

    while ans < 0:
        ans += MOD
    print(ans)

solver()