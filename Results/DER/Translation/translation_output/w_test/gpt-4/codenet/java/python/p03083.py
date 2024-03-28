Here's the translated Python code based on the provided Java code:

```python
MOD = 1_000_000_007

def mod_inverse(a, m):
    m0, y, x = m, 0, 1
    while a > 1:
        q = a // m
        t = m
        m = a % m
        a = t
        t = y
        y = x - q * y
        x = t
    
    return x + m0 if x < 0 else x

def comb(n, r, mod, fac, inv):
    if n < 0 or r < 0 or r > n:
        return 0
    return fac[n] * inv[r] % mod * inv[n - r] % mod

def enum_fif(n, mod):
    f = [0] * (n + 1)
    invf = [0] * (n + 1)
    f[0] = 1
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % mod
    
    invf[n] = mod_inverse(f[n], mod)
    for i in reversed(range(n)):
        invf[i] = invf[i + 1] * (i + 1) % mod
    
    return f, invf

b, w = map(int, input().split())
n = b + w

fac, inv = enum_fif(1000000, MOD)
inv_list = [0] * (n + 1)
inv_list[1] = 1
for i in range(2, n):
    inv_list[i] = mod_inverse(i, MOD)

inv_pow = [0] * (n + 1)
inv_pow[0] = 1
inv_pow[1] = inv_list[2]
for i in range(2, n + 1):
    inv_pow[i] = inv_pow[i - 1] * inv_list[2] % MOD

print(inv_list[2])
dpw = [0] * (n + 1)
dpb = [0] * (n + 1)
for i in range(n - 1):
    dpw[i + 1] = (dpw[i] + inv_list[2] * comb(i, w - 1, MOD, fac, inv) % MOD * inv_pow[i] % MOD) % MOD
    dpb[i + 1] = (dpb[i] + inv_list[2] * comb(i, b - 1, MOD, fac, inv) % MOD * inv_pow[i] % MOD) % MOD
    ans = ((1 + dpw[i + 1] - dpb[i + 1]) % MOD + MOD) * inv_list[2] % MOD
    print(ans)
```

Note that the `main` method and all the input-related methods in the Java code are not directly converted, instead, an equivalent Python `input().split()` is used for getting `b` and `w`. This should work for the provided test case or similar input format (space-separated values from the standard input).

Run this Python code and provide the appropriate test input to verify that the output matches the expected output.
