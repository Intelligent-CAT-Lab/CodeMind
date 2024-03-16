```python
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

def pow(a, n, mod):
    ret = 1
    x = 63 - n.bit_length()
    for _ in range(x, -1, -1):
        ret = (ret * ret) % mod
        if n >> x & 1:
            ret = (ret * a) % mod
    return ret

def solve():
    mod = 998244353
    n, K = map(int, input().split())
    ans = 0
    dp = [0] * K
    dp[0] = 1
    for i in range(n):
        ndp = [0] * K
        for j in range(K):
            for k in range(3):
                if j + k < K:
                    ndp[j + k] += dp[j]
                    ndp[j + k] %= mod
        dp = ndp
    for v in dp:
        ans += v

    fif = enumFIF(10000, mod)
    for s in range(K + 1, 2 * K - 1, 2):
        u = s - K
        if u % 2 == 1:
            u += 1
        two = u // 2 + (s - (K - 1)) // 2
        for i in range((s - two * 2 + 1) // 2, s - two * 2 + 1):
            ans += C(i, s - two * 2 - i, mod, fif) * C(n, i + two, mod, fif)
            ans %= mod

    if K % 2 == 1:
        ans += pow(2, n, mod)
        dp = [0] * K
        dp[0] = 1
        for i in range(n):
            ndp = [0] * K
            for j in range(K):
                for k in range(2):
                    if j + k < K:
                        ndp[j + k] += dp[j]
                        ndp[j + k] %= mod
            dp = ndp
        for v in dp:
            ans -= v

    ans %= mod
    if ans < 0:
        ans += mod
    print(ans)

if __name__ == "__main__":
    solve()
```

