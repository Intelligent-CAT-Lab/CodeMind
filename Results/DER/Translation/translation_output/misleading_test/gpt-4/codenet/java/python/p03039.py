The provided Java code performs calculations using combinations and factorial inversions within a given modular space. Below is the equivalent Python code:

```python
def power(x, y, p): 
    res = 1
    x = x % p 
    while y > 0: 
        if y & 1: 
            res = (res * x) % p 
        y = y >> 1
        x = (x * x) % p 
    return res 
 
def mod_inverse(x, p): 
    return power(x, p - 2, p) 
 
def nCr_mod(n, r, p): 
    if r == 0: 
        return 1
    fact = [1] * (n + 1) 
    for i in range(2, n + 1): 
        fact[i] = (fact[i - 1] * i) % p 
    return (fact[n] * mod_inverse(fact[r], p) % p * mod_inverse(fact[n - r], p) % p) % p 

def solve(n, m, k): 
    mod = int(1e9) + 7
    xa = (nCr_mod(n * m - 2, k - 2, mod) * mod_inverse(k - 2, mod)) % mod 
    xb = 0 
    for i in range(m): 
        tmp = (i * (m - i) * n * n * 2) % mod 
        xb = (xb + tmp) % mod 
    xc = (xa * xb % mod * nCr_mod(k, 2, mod)) % mod 
    xsum = (xc * mod_inverse(k, mod)) % mod 

    ya = (nCr_mod(n * m - 2, k - 2, mod) * mod_inverse(k - 2, mod)) % mod 
    yb = 0 
    for i in range(n): 
        tmp = (i * (n - i) * m * m * 2) % mod 
        yb = (yb + tmp) % mod 
    yc = (ya * yb % mod * nCr_mod(k, 2, mod)) % mod 
    ysum = (yc * mod_inverse(k, mod)) % mod 

    return (xsum + ysum) % mod

# Example usage
n, m, k = map(int, input().split())
print(solve(n, m, k))
```

The `solve` function in Python corresponds to the `solve` method in Java, with similar logic for calculating the combinations, applying the modular multiplication, and finally computing the required sums (`xsum` and `ysum`). 

The `nCr_mod` Python function calculates the combination `nCr` under the given modulo `p`, and utilizes `mod_inverse` for finding the multiplicative inverses in the modular arithmetic context.

This Python code can be run directly with the specified input format, i.e., three space-separated integers for `n`, `m`, and `k`, and it will print the expected output for the problem.
