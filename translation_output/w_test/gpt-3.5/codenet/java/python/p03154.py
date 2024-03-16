```python
def solve():
    def C(n, r, mod, fif):
        if n < 0 or r < 0 or r > n:
            return 0
        return (fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod)

    def P(n, r, mod, fif):
        if n < 0 or r < 0 or r > n:
            return 0
        return (fif[0][n] * fif[1][n - r] % mod)

    def enumFIF(n, mod):
        f = [0] * (n + 1)
        invf = [0] * (n + 1)
        f[0] = 1
        for i in range(1, n + 1):
            f[i] = (f[i - 1] * i) % mod
        a = f[n]
        b = mod
        p = 1
        q = 0
        while b > 0:
            c = a // b
            d = a
            a = b
            b = d % b
            d = p
            p = q
            q = d - c * q
        invf[n] = p + mod if p < 0 else p
        for i in range(n - 1, -1, -1):
            invf[i] = (invf[i + 1] * (i + 1)) % mod
        return [f, invf]


    H, W, K = map(int, input().split())
    mod = 1000000007
    fif = enumFIF(20000005, mod)
    ans = 0
    x = ((K + 1) * (K + 2) // 2 - 1) % mod
    for n in range(H + 1):
        m = K - n
        if 0 <= m <= W:
            ans += C(H, n, mod, fif) * C(W, m, mod, fif) % mod * (
                (2 * C(K + 1, 3, mod, fif) * C(K - 2, m - 1, mod, fif) +
                x * C(K, m, mod, fif)) % mod)
            ans %= mod
    print(ans)

# Sample test case
solve()
```
