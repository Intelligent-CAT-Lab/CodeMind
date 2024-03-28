Here is the translated Python code:

```python
MOD = 998244353

def pow_mod(x, y, mod):
    x %= mod
    res = 1
    while y > 0:
        if y % 2 == 1:
            y -= 1
            res = (res * x) % mod
        else:
            y //= 2
            x = (x * x) % mod
    return res % mod

def solve(n):
    n //= 2
    res = 7
    p2 = 8
    num = 1
    den = 2
    for i in range(1, n):
        res *= 9
        if i > 1:
            inc = p2
            inc *= num
            inc %= MOD
            inc *= pow_mod(den, MOD - 2, MOD)
            inc %= MOD
            res += inc
        res %= MOD
        p2 = (p2 * 2) % MOD
        k = i
        num *= 2 * k
        num %= MOD
        num *= 2 * k + 1
        num %= MOD
        if k > 1:
            den *= k - 1
        den %= MOD
        den *= k + 2
        den %= MOD
    return res

# Sample Test
if __name__ == "__main__":
    n = int(input().strip())
    print(solve(n))
```

Now you can use the `solve` function to process an input in the same way as the original Java code would. The `pow_mod` function is equivalent to the `IntegerUtils.pow` from the Java code and is used for modular exponentiation.
