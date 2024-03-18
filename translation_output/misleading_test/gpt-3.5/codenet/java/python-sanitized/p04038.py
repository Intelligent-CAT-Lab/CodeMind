MOD = 1000000007

def invl(a, mod):
    b = mod
    p = 1
    q = 0
    while b > 0:
        c = a // b
        d = a
        a = b
        b = d % b
        d = p
        p = q
        q = d - c * q
    return p + mod if p < 0 else p

def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return (fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod)

def enumFIF(n, mod):
    f = [0] * (n + 1)
    invf = [0] * (n + 1)
    f[0] = 1
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % mod
    a = f[n]
    b = mod
    p = 1
    q = 0
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
        invf[i] = invf[i + 1] * (i + 1) % mod
    return [f, invf]

def solve():
    fif = enumFIF(4000005, MOD)
    n, K = map(int, input().split())
    if K == 1:
        print(1)
        return
    dp = [0] * (n + 1)
    dp[0] = 1
    for j in range(n + 1):
        for i in range(j, n + 1):
            if i + 1 <= n:
                dp[i + 1] += dp[i]
                if dp[i + 1] >= MOD:
                    dp[i + 1] -= MOD
            if i >= j + 1:
                dp[i] = dp[i] * C(n * K - i - j * (K - 1) - 1, K - 2, MOD, fif) % MOD
    print(dp[n] * fif[0][n] % MOD)

if __name__ == '__main__':
    solve()