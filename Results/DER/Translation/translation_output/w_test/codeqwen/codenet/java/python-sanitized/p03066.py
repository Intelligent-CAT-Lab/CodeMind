import sys

def solve():
    mod = 998244353
    n = int(input())
    K = int(input())
    ans = 0
    dp = [1] * K
    for _ in range(n):
        ndp = [0] * K
        for j in range(K):
            for k in range(3):
                if j + k < K:
                    ndp[j + k] += dp[j]
                    ndp[j + k] %= mod
        dp = ndp
    ans += sum(dp)
    ans %= mod
    for s in range(K + 1, 2 * K - 1, 2):
        u = s - K
        if u % 2 == 1:
            u += 1
        two = u // 2 + (s - (K - 1)) // 2
        for i in range((s - two * 2 + 1) // 2, s - two * 2 + 1):
            ans += C(i, s - two * 2 - i, mod) * C(n, i + two, mod)
            ans %= mod
    if K % 2 == 1:
        ans += pow(2, n, mod)
        ndp = [0] * K
        for j in range(K):
            for k in range(2):
                if j + k < K:
                    ndp[j + k] += dp[j]
                    ndp[j + k] %= mod
        ans -= sum(ndp)
        ans %= mod
    if ans < 0:
        ans += mod
    print(ans)

def C(n, r, mod):
    if n < 0 or r < 0 or r > n:
        return 0
    return f[0][n] * f[1][r] % mod * f[1][n - r] % mod

def enumFIF(n, mod):
    f = [0] * (n + 1)
    invf = [0] * (n +