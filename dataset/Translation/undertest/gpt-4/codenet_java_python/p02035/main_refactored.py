class main:
    from math import comb, factorial
    
    def mod_pow(base, exponent, modulus):
        result = 1
        while exponent > 0:
            if exponent % 2 == 1:
                result = (result * base) % modulus
            exponent //= 2
            base = (base * base) % modulus
        return result
    
    def solve(n, m):
        mod = m
        ans = 0
        two_pow = [pow(2, i, mod) for i in range(n+1)]
        
        for r in range(1, n):
            b = n - r
            t = comb(n, r) * mod_pow(2, r * (r - 1) // 2, mod) % mod
            t *= mod_pow(2, b * (b - 1) // 2, mod) % mod
            p = 0
            
            for i in range(b + 1):
                if i % 2 == 0:
                    p = (p + comb(b, i) * (mod_pow(two_pow[b - i] - 1, r, mod))) % mod
                else:
                    p = (p - comb(b, i) * ( mod_pow(two_pow[b - i] - 1, r, mod))) % mod
                    
            if p < 0:
                p += mod
            
            t = (t * p) % mod
            ans = (ans + t) % mod
    
        return ans
    
    # Test case
    print(solve(3, 310779401))