class main:
    import sys
    
    MOD = int(1e9+7)
    
    def fast_pow_mod(b, x, mod):
        if x == 0: return 1
        if x == 1: return b
        if x % 2 == 0: return fast_pow_mod(b * b % mod, x // 2, mod) % mod
        return b * fast_pow_mod(b * b % mod, x // 2, mod) % mod
    
    def iscan():
        c