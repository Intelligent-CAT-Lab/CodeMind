Here is the converted Python code from the provided Java source:

```python
MOD = 1_000_000_000 + 7

def inv(a, mod):
    a = a % mod
    b = mod
    p = 1
    q = 0
    while b > 1:
        c = b // a
        b %= a
        q -= p * c
        # Swap a and b
        a, b = b, a
        # Swap p and q
        p, q = q, p
    while q < 0:
        q += mod
    return q % mod

def nCk(n, k):
    if n < k:
        return 0
    else:
        return fact[n] * inv(fact[n - k], MOD) * inv(fact[k], MOD) % MOD

n, m, k = map(int, input().split())

fact = [1] * (n + m + 2 * k + 1)
for i in range(1, n + m + 2 * k + 1):
    fact[i] = (i * fact[i - 1]) % MOD

ans = 0
for i in range(k + 1):
    a = b = 1
    j = k - i
    if i >= 1:
        a = (nCk(n + 2 * i, i) + MOD - nCk(n + 2 * i, i - 1)) % MOD
    if j >= 1:
        b = (nCk(m + 2 * j, j) + MOD - nCk(m + 2 * j, j - 1)) % MOD
    ans += nCk(n + m + 2 * k, n + 2 * i) * a * b % MOD
    ans %= MOD

while ans < 0:
    ans += MOD
print(ans)
```

Now, if you run the code with the sample input "6 4 0", it will produce the expected output "210".
