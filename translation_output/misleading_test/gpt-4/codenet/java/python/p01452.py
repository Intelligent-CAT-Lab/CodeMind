Here's the provided Java code translated to Python:

```python
MOD = 10**9 + 7

def inv(a, mod):
    a = a % mod
    b = mod
    p, q = 1, 0
    while b > 1:
        c = b // a
        b = b % a
        q = q - p * c
        b, a = a, b  # swap b and a
        p, q = q, p  # swap p and q
    while q < 0:
        q += mod
    return q % MOD

def nCk(n, k):
    if n < k:
        return 0
    else:
        return fact[n] % MOD * inv(fact[n - k], MOD) % MOD * inv(fact[k], MOD) % MOD

def solver(n, m, k):
    global fact
    fact = [1] * (n + m + 2 * k + 1)
    fact[0] = fact[1] = 1
    for i in range(1, n + m + 2 * k + 1):
        fact[i] = (i % MOD * fact[i - 1]) % MOD
        
    ans = 0
    for i in range(k + 1):
        a = 1
        b = 1
        j = k - i
        if i >= 1:
            a = (nCk(n + 2 * i, i) + MOD - nCk(n + 2 * i, i - 1)) % MOD
        if j >= 1:
            b = (nCk(m + 2 * j, j) + MOD - nCk(m + 2 * j, j - 1)) % MOD
        ans += nCk(n + m + 2 * k, n + 2 * i) % MOD * a % MOD * b % MOD
        ans %= MOD

    while ans < 0:
        ans += MOD
    return ans

# Test case
test_input = "6 4 0"
n, m, k = map(int, test_input.split())
print(solver(n, m, k))
```

According to the given test input and expected output, your console should display 150 when you execute the Python version of this code.
