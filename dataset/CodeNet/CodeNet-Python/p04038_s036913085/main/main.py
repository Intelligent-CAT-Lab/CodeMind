def pow_mod(MOD, a, n):
    ret = 1
    while n != 0:
        if n % 2 == 1: ret = ret * a % MOD
        a = a * a % MOD
        n //= 2
    return ret

def fac(n):
    MOD = 1000000007
    ret = 1
    for i in range(1, n + 1):
        ret = ret * i % MOD
    return ret

def fac_gen(first, last):
    MOD = 1000000007
    ret = fac(first)
    yield ret
    for i in range(first + 1, last):
        ret = ret * i % MOD
        yield ret

def build_comb_list(f, m, K):
    MOD = 1000000007
    v = pow_mod(MOD, f[m - K * 2] * f[0], MOD - 2)
    for i in range(m - K, -1, -1):
        f[i] *= v
        v = v * i % MOD

def solve_dp(n, k, comb):
    MOD = 1000000007
    dp = [1] * (n + 1)
    for i in range(2, n + 1):
        ci = (i - 1) * (k - 1)
        v = 0
        for j, c in zip(list(range(i)), comb[ci:ci + i]):
            v = (v + dp[j] * c) % MOD
            dp[j] = v
        dp[i] = v
    return dp[n] * fac(n) % MOD

def solve(n, k):
    if n == 1 or k == 1: return 1
    m = n * k
    comb = list(fac_gen(k - 2, m - 1))
    build_comb_list(comb, m - 2, k - 2)
    return solve_dp(n, k, comb)


n, k = (int(s) for s in input().split(' '))
print((solve(n, k)))
