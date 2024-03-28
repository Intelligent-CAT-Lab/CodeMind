class main:
    import math
    
    def solve():
        n, k = map(int, input().split())
        M = 1000000007
        m = Mod(M)
        for i in range(1, k + 1):
            bl = mod_fact(m, k - 1, k - i)
            re = mod_fact(m, n - k + 1, n - k - i + 1)
            print((bl * re) % M)
    
    def mod_fact(m, n, k):
        if k < 0 or k > n:
            return 0
        if n == k:
            return 1
        m['n'] = n
        m['k'] = k
        return m.run("n!/(n-k)!/k!")
    
    def mod_pow(x, y, p):
        res = 1
        x = x % p  
        while y > 0:
            if y & 1:
                res = (res * x) % p
            y = y >> 1
            x = (x * x) % p
        return res
    
    def mod_inverse(n, p):
        return mod_pow(n, p - 2, p)
    
    def mod_binomial(n, k, p):
        if k == 0:
            return 1
        num = den = 1
        for i in range(k):
            num = (num * (n - i)) % p
            den = (den * (i + 1)) % p
        return (num * mod_inverse(den, p)) % p
    
    class Mod:
        def __init__(self, mod):
            self.mod = mod
            self.vm = {}
    
        def set(self, var, val):
            self.vm[var] = val
    
        def run(self, expr):
            if expr == "n!/(n-k)!/k!":
                n = self.vm['n']
                k = self.vm['k']
                return mod_binomial(n, k, self.mod)
            # Implement other expressions as needed
            raise NotImplementedError
    
        def fact(self, n):
            return math.factorial(n) % self.mod
    
    if __name__ == "__main__":
        solve()