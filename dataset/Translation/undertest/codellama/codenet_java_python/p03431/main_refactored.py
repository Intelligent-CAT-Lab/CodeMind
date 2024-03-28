class main:
    import sys
    
    class TaskE:
        def __init__(self):
            self.n = 0
            self.k = 0
            self.fact = [1]
            self.ifact = [1]
    
        def comb(self, n, k):
            if k < 0 or k > n:
                return 0
            return self.fact[n] * self.ifact[k] % 998244353 * self.ifact[n - k] % 998244353
    
        def solve(self, test_number, in, out):
            self.n = in.nextInt()
            self.k = in.nextInt()
            x = Factorials.getFIF(500010, 998244353)
            self.fact = x[0]
            self.ifact = x[1]
    
            ans = 0
            for diff in range(k % 2, k + 1, 2):
                nr = (k + diff) // 2
                nb = k - nr
                if nr < self.n:
                    continue
    
                if diff == 0:
                    ans += self.comb(k - 1, nr)
                    if ans >= 998244353:
                        ans -= 998244353
                    ans -= self.comb(k - 1, nb - 1 - (nr - self.n + 1))
                    if ans < 0:
                        ans += 998244353
                    continue
    
                r2 = (k - diff) // 2 - min(k - diff, nr - self.n) - 1
                b2 = k - r2
    
                ans += self.comb(nr + nb, nb) - self.comb(r2 + b2, r2)
                ans %= 998244353
                if ans < 0:
                    ans