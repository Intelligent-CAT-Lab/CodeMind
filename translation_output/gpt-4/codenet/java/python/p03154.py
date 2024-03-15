Here is the equivalent Python code for the Java code provided:

```python
def solve():
    mod = 1000000007
    fif = enum_fif(20000005, mod)
    
    H, W, K = map(int, input().strip().split())
    ans = 0
    x = ((K + 1) * (K + 2) // 2 - 1) % mod
    
    for n in range(H + 1):
        m = K - n
        if 0 <= m <= W:
            ans += (C_comb(H, n, mod, fif) * C_comb(W, m, mod, fif) % mod *
                    (2 * C_comb(K + 1, 3, mod, fif) * C_comb(K - 2, m - 1, mod, fif) +
                     x * C_comb(K, m, mod, fif)) % mod)
            ans %= mod
    
    print(ans)

def C_comb(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod

def P(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][n - r] % mod

def enum_fif(n, mod):
    f = [0] * (n + 1)
    invf = [0] * (n + 1)
    f[0] = 1
    for i in range(1, n + 1):
        f[i] = f[i-1] * i % mod
    
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
    
    invf[n] = int(p + mod if p < 0 else p)
    for i in range(n - 1, -1, -1):
        invf[i] = invf[i + 1] * (i + 1) % mod
    
    return f, invf

if __name__ == "__main__":
    solve()
```

Please note the following differences:
1. The Python code uses the `input` function instead of handling byte streams for reading input since that is the typical approach in Python for such tasks.
2. The Python code directly uses `print` for output instead of a `PrintWriter`.
3. The `enum_fif` function has been translated to Python idioms with list comprehensions and Python's integer division.
4. The main logic in the `solve` function uses `map` and `input.strip().split()` to read the integers H, W, and K.
5. In Python, we don't need to check for EOF or handle input byte buffers as Java does, this part is simplified.
6. The `solve` function will be called directly when the script is executed. 

You would call this script using Python and provide the input according to the expected format (H, W, and K as space-separated integers in a single line). The result will be printed to the console.
