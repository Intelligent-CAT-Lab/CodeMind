Below is the translated Python code for the given Java code:

```python
def solve(n, K):
    mod = 998244353
    ans = 0

    # The DP portion for the first part
    dp = [0] * K
    dp[0] = 1
    for i in range(n):
        ndp = [0] * K
        for j in range(K):
            for k in range(3):
                if j+k < K:
                    ndp[j+k] += dp[j]
                    ndp[j+k] %= mod
        dp = ndp
    ans = sum(dp) % mod

    # Calculate factorials and their modular inverses
    fif = enumFIF(10000, mod)

    # Second DP and combination portion
    for s in range(K+1, 2*K-1, 2):
        u = s - K
        if u % 2 == 1:
            u += 1
        two = u // 2 + (s - (K-1)) // 2
        for i in range((s - two * 2 + 1) // 2, s - two*2+1):
            ans += C(i, s - two*2 - i, mod, fif) * C(n, i + two, mod, fif)
            ans %= mod
    if K % 2 == 1:
        ans += pow(2, n, mod)
        
        # The second DP calculation for when K is odd
        dp = [0] * K
        dp[0] = 1
        for i in range(n):
            ndp = [0] * K
            for j in range(K):
                for k in range(2):
                    if j+k < K:
                        ndp[j+k] += dp[j]
                        ndp[j+k] %= mod
            dp = ndp
        for v in dp:
            ans -= v
    ans %= mod
    if ans < 0:
        ans += mod

    return ans

def pow(a, n, mod):
    ret = 1
    a %= mod
    while n:
        if n & 1:
            ret = ret * a % mod
        a = a * a % mod
        n >>= 1
    return ret

def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod

def enumFIF(n, mod):
    f = [0] * (n+1)
    invf = [0] * (n+1)
    f[0] = 1
    for i in range(1, n+1):
        f[i] = f[i - 1] * i % mod
    a = f[n]
    b = mod
    p = 1
    q = 0
    while b > 0:
        c = a // b
        a, b = b, a % b
        p, q = q, p - q * c
    invf[n] = p + mod if p < 0 else p
    for i in range(n-1, -1, -1):
        invf[i] = invf[i + 1] * (i + 1) % mod
    return [f, invf]

# Test case input
n, K = map(int, input().split())

# Expected output
print(solve(n, K))
```

The code has been adapted to work in Python's procedural style, and the main logic has been encapsulated in the `solve` function. I've converted the combination and power calculations to Python, utilized list comprehensions where appropriate, and changed integer division and remainder operations to match Python's syntax and semantics. The `enumFIF` function computes the factorial and inverse factorial (modular inverse of the factorial) arrays for use in the combination formula. The `solve` function now directly accepts the values of `n` and `K` as arguments and returns the computed answer. The main script reads from the standard input and prints the result to the standard output.
