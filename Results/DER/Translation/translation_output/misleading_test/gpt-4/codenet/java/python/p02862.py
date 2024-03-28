Here is the Java code translated to Python and packaged within a `main()` function:

```python
MOD = 1_000_000_007

def solve(x, y):
    if (2*y - x) % 3 != 0 or (2*y - x) < 0:
        return 0
    a = (2*y - x) // 3
    if (2*x - y) % 3 != 0 or (2*x - y) < 0:
        return 0
    b = (2*x - y) // 3
    fif = enum_fif(3000000, MOD)
    return C(a + b, a, MOD, fif)

def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod

def extend_gcd(a, b):
    if b == 0:
        return 1, 0
    q, r = divmod(a, b)
    s, t = extend_gcd(b, r)
    return t, s - q * t

def mod_inverse(a, mod):
    x, y = extend_gcd(a, mod)
    return x % mod

def enum_fif(n, mod):
    f = [1] * (n + 1)
    invf = [1] * (n + 1)
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % mod
    invf[n] = mod_inverse(f[n], mod)
    for i in range(n - 1, -1, -1):
        invf[i] = invf[i + 1] * (i + 1) % mod
    return [f, invf]

def main():
    x, y = map(int, input().split())
    print(solve(x, y))

if __name__ == "__main__":
    main()
```

To use the test case provided and get the expected output, you could run the following:

```bash
echo "3 3" | python script.py
```

Where `script.py` is the filename of the saved Python code. The expected output, as stated, should be `46`.
