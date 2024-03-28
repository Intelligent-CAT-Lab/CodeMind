class main:
    def mod_pow(x, p, mod):
        res = 1
        while p > 0:
            if p & 1:
                res = res * x % mod
            x = x * x % mod
            p >>= 1
        return res
    
    def mod_inv(x, mod):
        return mod_pow(x, mod - 2, mod)
    
    def prepare_factorials(n, mod):
        fac = [1] * (n + 1)
        for i in range(2, n + 1):
            fac[i] = fac[i - 1] * i % mod
        inv = [1] * (n + 1)
        inv[n] = mod_inv(fac[n], mod)
        for i in range(n, 0, -1):
            inv[i - 1] = inv[i] * i % mod
        return fac, inv
    
    def mod_comb_fac(n, k, fac, inv, mod):
        if n < k:
            return 0
        return fac[n] * inv[k] % mod * inv[n - k] % mod
    
    def solver(h, w, a, b):
        MOD = 1000000007
        res = 0
        fac, inv = prepare_factorials(200005, MOD)
        for i in range(h - a):
            res += (
                mod_comb_fac(b - 1 + i, i, fac, inv, MOD)
                * mod_comb_fac(w - b - 1 + h - 1 - i, h - 1 - i, fac, inv, MOD)
            ) % MOD
            res %= MOD
        return res
    
    # Test case
    h, w, a, b = map(int, input().split())
    print(solver(h, w, a, b))