def inv(a, mod):
    x, y, u, v = 1, 0, 0, 1
    while a != 0:
        q, r = divmod(mod, a)
        m, n = x - u * q, y - v * q
        mod, a, x, y, u, v = a, r, u, v, m, n
    return x % mod

def nCk(n, k, MOD, fact):
    if n < k:
        return 0
    return (fact[n] * inv(fact[k], MOD) * inv(fact[n-k], MOD)) % MOD

def solver():
    MOD = 10**9 + 7
    n, m, k = map(int, input().split())

    fact = [1] * (n + m + 2 * k + 1)
    for i in range(2, n + m + 2 * k + 1):
        fact[i] = (fact[i - 1] * i) % MOD

    ans = 0
    for i in range(k + 1):
        a = b = 1
        j = k - i
        if i >= 1:
            a = (nCk(n + 2 * i, i, MOD, fact) + MOD - nCk(n + 2 * i, i - 1, MOD, fact)) % MOD
        if j >= 1:
            b = (nCk(m + 2 * j, j, MOD, fact) + MOD - nCk(m + 2 * j, j - 1, MOD, fact)) % MOD
        ans += (nCk(n + m + 2 * k, n + 2 * i, MOD, fact) * a * b) % MOD
        ans %= MOD

    ans = (ans + MOD) % MOD  # ensure ans is positive
    print(ans)

if __name__ == "__main__":
    solver()