import sys
from math import comb

class ModMath:
    def __init__(self, mod):
        self.mod = mod

    def mod_pow(self, x, y):
        if y < 0:
            return self.mod_pow(self.mod_inv(x), -y)
        elif y == 0:
            return 1
        elif y % 2 == 0:
            z = self.mod_pow(x, y // 2)
            return (z * z) % self.mod
        else:
            return (x % self.mod) * self.mod_pow(x, y - 1) % self.mod

    def mod_inv(self, x):
        return pow(x, self.mod - 2, self.mod)

    def mod_npr(self, n, r):
        ans = 1
        for i in range(r):
            ans = ans * (n - i) % self.mod
        return ans

    def mod_ncr(self, n, r):
        numerator = self.mod_npr(n, r)
        denominator = 1
        for i in range(2, r + 1):
            denominator = (denominator * i) % self.mod
        return numerator * self.mod_inv(denominator) % self.mod

    def mod_comb_pow(self, base, exponent, mod):
        result = 1
        while exponent > 0:
            if exponent % 2 == 1:
                result = (result * base) % mod
            base = (base * base) % mod
            exponent //= 2
        return result


def solve(n, m):
    mod = ModMath(m)
    ans = 0
    exp2 = [mod.mod_pow(2, i) for i in range(n)]
    
    for r in range(1, n):
        b = n - r
        t = mod.mod_ncr(n, r)
        t = t * exp2[r * (r - 1) // 2] % m
        t = t * exp2[b * (b - 1) // 2] % m
        
        p = 0
        for i in range(b + 1):
            if i % 2 == 0:
                p += comb(b, i) * (exp2[b - i] - 1) ** r % m
            else:
                p -= comb(b, i) * (exp2[b - i] - 1) ** r % m
            p %= m
        
        if p < 0:
            p += m
        
        t *= p
        t %= m
        
        ans += t
        ans %= m
    
    return ans    

n, m = map(int, sys.stdin.readline().split())
result = solve(n, m)
sys.stdout.write(str(result) + "\n")