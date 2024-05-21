MOD = 1000000007

def make_fac(size):
    fac = [0] * (size + 1)
    inv = [0] * (size + 1)
    fac[0] = 1
    for i in range(1, size + 1):
        fac[i] = fac[i - 1] * i % MOD
    inv[size] = pow(fac[size], MOD - 2, MOD)
    for i in range(size - 1, -1, -1):
        inv[i] = inv[i + 1] * (i + 1) % MOD
    return fac, inv

def comb_fac(n, k, fac, inv):
    if n < k:
        return 0
    return fac[n] * inv[k] * inv[n - k] % MOD

def solve(h, w, a, b):
    fac, inv = make_fac(200005)
    res = 0
    for i in range(h - a):
        res += comb_fac(b - 1 + i, i, fac, inv) * comb_fac(w - b - 1 + h - 1 - i, h - 1 - i, fac, inv)
        res %= MOD
    return res

h, w, a, b = map(int, input().split())
print(solve(h, w, a, b))