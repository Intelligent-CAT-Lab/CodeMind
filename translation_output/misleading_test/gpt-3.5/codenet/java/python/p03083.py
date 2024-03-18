```python
mod = 10**9 + 7

def C(n, r, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod

def enumFIF(n):
    f = [1] * (n + 1)
    invf = [0] * (n + 1)
    f[0] = 1
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % mod

    a, b, p, q = f[n], mod, 1, 0
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
        invf[i] = invf[i + 1] * (i + 1) % mod

    return f, invf

def solve(b, w):
    n = b + w
    dpw = [0] * (n + 1)
    dpb = [0] * (n + 1)
    fif = enumFIF(1000000)
    inv = [1] + [0] * (n - 1)
    for i in range(2, n):
        inv[i] = inv[mod % i] * (mod - mod // i) % mod

    inv_pow = [1, inv[2]]
    for i in range(2, n + 1):
        inv_pow.append(inv_pow[i - 1] * inv[2] % mod)

    result = []
    result.append(inv[2])
    for i in range(n - 1):
        dpw[i + 1] = (dpw[i] + inv[2] * C(i, w - 1, fif) % mod * inv_pow[i] % mod) % mod
        dpb[i + 1] = (dpb[i] + inv[2] * C(i, b - 1, fif) % mod * inv_pow[i] % mod) % mod
        ans = (mod + (1 + dpw[i + 1] - dpb[i + 1]) % mod) * inv[2] % mod
        result.append(ans % mod)

    return result

if __name__ == "__main__":
    b, w = map(int, input().split())
    results = solve(b, w)
    for res in results:
        print(res)
```
```
