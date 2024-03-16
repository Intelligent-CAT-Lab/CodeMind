```python
MOD = 1_000_000_000 + 7

def solver():
    n, m, k = map(int, input().split())
    
    fact = [0] * (n + m + 2 * k + 1)
    fact[0] = 1
    fact[1] = 1
    for i in range(1, n + m + 2 * k + 1):
        fact[i] = (i % MOD * fact[i - 1]) % MOD
    
    ans = 0
    for i in range(k + 1):
        a, b = 1, 1
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

def nCk(n, k, fact):
    if n < k:
        return 0
    else:
        return fact[n] % MOD * inv(fact[n - k], MOD, fact) % MOD * inv(fact[k], MOD, fact) % MOD

def inv(a, mod, fact):
    a = a % mod
    b = mod
    p, q = 1, 0
    
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

if __name__ == '__main__':
    solver()
```
