```python
mod = 1_000_000_007

def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return (fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod)

def enumFIF(n, mod):
    f = [0] * (n + 1)
    invf = [0] * (n + 1)
    f[0] = 1
    for i in range(1, n + 1):
        f[i] = (f[i - 1] * i) % mod
    
    a = f[n]
    b = mod
    p, q = 1, 0
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

def solve(b, w):
    n = b + w
    dpw = [0] * (n + 1)
    dpb = [0] * (n + 1)
    fif = enumFIF(1000000, mod)
    inv = [0] * n
    inv[1] = 1
    for i in range(2, n):
        inv[i] = inv[mod % i] * (mod - mod // i) % mod
    inv_pow = [0] * (n + 1)
    inv_pow[0] = 1
    inv_pow[1] = inv[2]
    
    for i in range(2, n + 1):
        inv_pow[i] = inv_pow[i - 1] * inv[2] % mod
    
    ans = []
    ans.append(inv[2])
    for i in range(n - 1):
        dpw[i + 1] = dpw[i] + inv[2] * C(i, w - 1, mod, fif) % mod * inv_pow[i] % mod
        dpb[i + 1] = dpb[i] + inv[2] * C(i, b - 1, mod, fif) % mod * inv_pow[i] % mod
        dpw[i + 1] %= mod
        dpb[i + 1] %= mod
        
        ans_val = (mod + (1 + dpw[i + 1] - dpb[i + 1]) % mod) * inv[2] % mod
        ans_val %= mod
        ans.append(ans_val)
    
    return ans

# Test case
output = solve(2, 1)
for val in output:
    print(val)
```

